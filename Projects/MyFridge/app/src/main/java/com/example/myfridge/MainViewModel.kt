package com.example.myfridge

import android.content.Context
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.myfridge.data.Item
import com.example.myfridge.data.ItemDatabase
import com.example.myfridge.data.OfflineItemRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.util.Calendar
import java.util.Date

class MainViewModel(
    private val offlineItemRepository: OfflineItemRepository
) : ViewModel() {

    var itemListState: StateFlow<List<Item>> = offlineItemRepository.getAllItemsStream(type = "myFridge")
        .map { it }
        .stateIn(
            scope = viewModelScope,
            initialValue = listOf(),
            started = SharingStarted.WhileSubscribed(100)
        )

    var shoppingListState: StateFlow<List<Item>> = offlineItemRepository.getAllItemsStream(type = "shoppingList")
        .map { it }
        .stateIn(
            scope = viewModelScope,
            initialValue = listOf(),
            started = SharingStarted.WhileSubscribed(100)
        )

    var savedListState: StateFlow<List<Item>> = offlineItemRepository.getAllItemsStream(type = "savedItems")
        .map { it }
        .stateIn(
            scope = viewModelScope,
            initialValue = listOf(),
            started = SharingStarted.WhileSubscribed(100)
        )

    fun refreshState(ordering: String) {
        if (ordering == "expired") {
            itemListState = offlineItemRepository.getExpiredItemsStream()
            .map { it }
                .stateIn(
                    scope = viewModelScope,
                    initialValue = listOf(),
                    started = SharingStarted.WhileSubscribed(100)
                )
        }
        else {
            itemListState = offlineItemRepository.getAllItemsStream(type = "myFridge")
            .map { it }
                .stateIn(
                    scope = viewModelScope,
                    initialValue = listOf(),
                    started = SharingStarted.WhileSubscribed(100)
                )
        }
    }

    fun addItem(type: String, name: String, expiryDate : Boolean, days: Int, count: Int) {
        var date : Long = Calendar.getInstance().time.time

        val item = Item(type = type, name = name, expiryDate = expiryDate, days = days, date = date, count = count)
        viewModelScope.launch {
            println("adding item")
            offlineItemRepository.insertItem(item)
            println("done adding item")
        }
    }
    fun updateItem(item: Item, name: String, expiryDate : Boolean, days: Int, count: Int) {
        var date : Long = Calendar.getInstance().time.time

        val item = item.copy(name = name, expiryDate = expiryDate, days = days, date = date, count = count)
        viewModelScope.launch {
            println("updating item")
            offlineItemRepository.updateItem(item)
            println("done updating item")
        }
    }
    fun delete (item: Item) {
        viewModelScope.launch {
            println("deleting item")
            offlineItemRepository.deleteItem(item)
            println("done deleting item")
        }
    }
}

class MainViewModelFactory(val context: Context) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val offlineRepository = OfflineItemRepository(ItemDatabase.getDatabase(context).itemDao())
        return MainViewModel(offlineRepository) as T
    }
}
