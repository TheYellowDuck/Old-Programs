package com.example.myfridge

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfridge.reusables.BottomBarButton
import com.example.myfridge.reusables.EditCard
import com.example.myfridge.reusables.ItemCard
import com.example.myfridge.reusables.TopBar
import com.example.myfridge.services.UpdateDays
import com.example.myfridge.ui.theme.MyFridgeTheme

sealed class Screens(val title: String, val route: String) {
    object MyFridge: Screens("MyFridge", "myFridge")
    object SavedItems: Screens("SavedItems", "savedItems")
    object ShoppingList: Screens("ShoppingList", "shoppingList")
    object Settings: Screens("Settings", "settings")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, arrayOf("android.permission.POST_NOTIFICATIONS"), 1);
        }
        println("PERMISSION: ${ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == PackageManager.PERMISSION_GRANTED}")
        val intent = Intent(this, UpdateDays::class.java)
        startService(intent)
        setContent {
            MyFridgeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                    tonalElevation = 3.dp
                ) {
                    MainActivityScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainActivityScreen() {
    val navController = rememberNavController()

    val owner = LocalViewModelStoreOwner.current
    val viewModel: MainViewModel = viewModel(
        owner!!,
        "MainViewModel",
        MainViewModelFactory(LocalContext.current)
    )
//
//    val settingsDataStore = SettingsDataStore(LocalContext.current)
//    val storageMethod by settingsDataStore.getStorageSetting().collectAsState(initial = "Local")
//    viewModel.setStorageMode(storageMethod == "Cloud")

    Scaffold(
        bottomBar = {
            BottomAppBar() {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    BottomBarButton(painterResource(id = R.drawable.shopping_cart), "Shopping List") {
                        navController.navigate("shoppingList") {
                            popUpTo("myFridge")
                        }
                    }
                    BottomBarButton(painterResource(id = R.drawable.logo), "My Fridge") {
                        navController.navigate("myFridge") {
                            popUpTo("myFridge")
                        }
                    }
                    BottomBarButton(painterResource(id = R.drawable.bookmarks), "Saved Items") {
                        navController.navigate("savedItems") {
                            popUpTo("myFridge")
                        }
                    }
//                    BottomBarButton(Icons.Default.Settings, "Settings") {
//                        navController.navigate("settings")
//                    }
                }
            }
        }
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = "myFridge"
        ) {
            composable(Screens.MyFridge.route) {
                MyFridge(contentPadding, viewModel, navController)
            }
            composable(Screens.SavedItems.route) {
                SavedItems(contentPadding, viewModel, navController)
            }
            composable(Screens.ShoppingList.route) {
                ShoppingList(contentPadding, viewModel, navController)
            }
            composable(Screens.Settings.route) {
                Settings(contentPadding)
            }
        }
    }
}

@Composable
fun MyFridge(contentPadding: PaddingValues, viewModel: MainViewModel, navController: NavController) {
//    showFloatingButtonCheck(true)
//    viewModel.refreshState("all")
    val itemList by viewModel.itemListState.collectAsState()
    Column(
        modifier = Modifier.padding(contentPadding)
    ) {
        TopBar(navController,
            { Text("My Fridge", style = MaterialTheme.typography.titleLarge) },
            {
                IconButton(
//                    onClick = onAccountClick
                    onClick = {}
                ) {
                    Icon(painterResource(id = R.drawable.settings), contentDescription = "Settings")
                }
            }
        )
        Column(
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
        ) {
            for (item in itemList) {
                ItemCard(viewModel = viewModel, item = item)
            }
            EditCard(viewModel = viewModel, type = "myFridge")
        }
    }
}
@Composable
fun SavedItems(contentPadding: PaddingValues, viewModel: MainViewModel, navController: NavController) {
    val itemList by viewModel.savedListState.collectAsState()
    Column(
        modifier = Modifier.padding(contentPadding)
    ) {
        TopBar(navController,
            { Text("Saved Items", style = MaterialTheme.typography.titleLarge) },
            {
                IconButton(
//                    onClick = onAccountClick
                    onClick = {}
                ) {
                    Icon(painterResource(id = R.drawable.settings), contentDescription = "Settings")
                }
            }
        )
        Column(
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
        ) {
            for (item in itemList) {
                ItemCard(viewModel = viewModel, item = item)
            }
            EditCard(viewModel = viewModel, type = "savedItems")
        }
    }
}
@Composable
fun ShoppingList(contentPadding: PaddingValues, viewModel: MainViewModel, navController: NavController) {
    val itemList by viewModel.shoppingListState.collectAsState()
    Column(
        modifier = Modifier.padding(contentPadding)
    ) {
        TopBar(navController,
            { Text("Shopping List", style = MaterialTheme.typography.titleLarge) },
            {
                IconButton(
//                    onClick = onAccountClick
                    onClick = {}
                ) {
                    Icon(painterResource(id = R.drawable.settings), contentDescription = "Settings")
                }
            }
        )
        Column(
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
        ) {
            for (item in itemList) {
                ItemCard(viewModel = viewModel, item = item)
            }
            EditCard(viewModel = viewModel, type = "shoppingList")
        }
    }
}
@Composable
fun Settings(contentPadding: PaddingValues) {

}