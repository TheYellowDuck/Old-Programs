package com.example.myfridge.data

import kotlinx.coroutines.flow.Flow

interface ItemRepository {
    fun getImageByIdStream(id: Int): Flow<Item>

    fun getAllItemsStream(type: String): Flow<List<Item>>

    fun getExpiredItemsStream(): Flow<List<Item>>

//    fun getImagesByUserStream(user: String): Flow<List<Item>>

    suspend fun insertItem(item: Item)

    suspend fun deleteItem(item: Item)

    suspend fun updateItem(item: Item)
}