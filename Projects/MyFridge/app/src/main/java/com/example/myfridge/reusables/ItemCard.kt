package com.example.myfridge.reusables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myfridge.MainViewModel
import com.example.myfridge.R
import com.example.myfridge.data.Item

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemCard(viewModel: MainViewModel, item: Item) {
    var editing by remember {
        mutableStateOf(false)
    }
    val saveEdit = {
        editing = false
    }
    var count by remember { mutableStateOf("0") }
    if (item.type == "shoppingList") count = item.count.toString()
    val focusManager = LocalFocusManager.current
    if (!editing) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
                .clickable(true) { editing = true },
            shape = MaterialTheme.shapes.medium
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (item.type == "shoppingList") {
                            TextField(
                                value = count,
                                onValueChange = { count = it },
                                placeholder = {
                                    Text("0")
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Done
                                ),
                                keyboardActions = KeyboardActions(onDone = {
                                    focusManager.clearFocus()
                                }),
                                maxLines = 1,
                                modifier = Modifier
                                    .width(75.dp),
                                textStyle = MaterialTheme.typography.titleMedium
                            )
                            Text(
                                text = "  X  ",
                                style = MaterialTheme.typography.titleMedium
                            )
                        }
                        Text(
                            text = item.name,
                            modifier = Modifier
                                .fillMaxWidth(0.4f)
                                .horizontalScroll(rememberScrollState()),
                            style = MaterialTheme.typography.titleMedium
                        )
                    }
                    if (item.expiryDate && item.type != "shoppingList") {
                        if (item.days >= 0) {
                            Text(
                                text = "Expires in ${item.days} days",
                                color = Color.DarkGray,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        } else {
                            Text(
                                text = "Expired for ${-item.days} days",
                                color = Color.Red,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (item.type == "myFridge") {
                        if (item.days >= 0 || !item.expiryDate) {
                            if (item.count == 1) {
                                IconButton(onClick = { viewModel.delete(item = item) }) {
                                    Icon(painterResource(id = R.drawable.delete), contentDescription = "delete")
                                }
                            } else {
                                IconButton(onClick = {
                                    viewModel.updateItem(
                                        item = item,
                                        name = item.name,
                                        expiryDate = item.expiryDate,
                                        days = item.days,
                                        count = item.count - 1
                                    )
                                }) {
                                    Icon(painterResource(id = R.drawable.remove), contentDescription = "minus")
                                }
                            }
                            Text(
                                text = "${item.count}",
                                style = MaterialTheme.typography.titleMedium
                            )
                            IconButton(onClick = {
                                viewModel.updateItem(
                                    item = item,
                                    name = item.name,
                                    expiryDate = item.expiryDate,
                                    days = item.days,
                                    count = item.count + 1
                                )
                            }) {
                                Icon(painterResource(id = R.drawable.add), contentDescription = "add")
                            }
                        } else {
                            IconButton(
                                onClick = {
                                    if (count != "0") {
                                        viewModel.addItem(
                                            type = "shoppingList",
                                            name = item.name,
                                            expiryDate = item.expiryDate,
                                            days = item.days,
                                            count = count.toInt()
                                        )
                                    }
                                }
                            ) {
                                Icon(
                                    painterResource(id = R.drawable.shopping_cart_checkout),
                                    contentDescription = "addToShoppingList"
                                )
                            }
                            IconButton(onClick = { viewModel.delete(item = item) }) {
                                Icon(painterResource(id = R.drawable.delete), contentDescription = "delete")
                            }
                        }
                    } else if (item.type == "savedItems") {
                        Column(
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Count: ",
                                    style = MaterialTheme.typography.titleMedium
                                )
                                TextField(
                                    value = count,
                                    onValueChange = { count = it },
                                    placeholder = {
                                        Text("0")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Number,
                                        imeAction = ImeAction.Done
                                    ),
                                    keyboardActions = KeyboardActions(onDone = {
                                        focusManager.clearFocus()
                                    }),
                                    maxLines = 1,
                                    modifier = Modifier
                                        .width(75.dp),
                                    textStyle = MaterialTheme.typography.titleMedium
                                )
                            }
                            Row(
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconButton(
                                    onClick = {
                                        if (count != "0") {
                                            viewModel.addItem(
                                                type = "myFridge",
                                                name = item.name,
                                                expiryDate = item.expiryDate,
                                                days = item.days,
                                                count = count.toInt()
                                            )
                                        }
                                        focusManager.clearFocus()
                                    }
                                ) {
                                    Icon(painterResource(id = R.drawable.logo), contentDescription = "addToFridge")
                                }
                                IconButton(
                                    onClick = {
                                        if (count != "0") {
                                            viewModel.addItem(
                                                type = "shoppingList",
                                                name = item.name,
                                                expiryDate = item.expiryDate,
                                                days = item.days,
                                                count = count.toInt()
                                            )
                                        }
                                        focusManager.clearFocus()
                                    }
                                ) {
                                    Icon(
                                        painterResource(id = R.drawable.shopping_cart_checkout),
                                        contentDescription = "addToShoppingList"
                                    )
                                }
                                IconButton(
                                    onClick = {
                                        viewModel.delete(item = item)
                                        focusManager.clearFocus()
                                    }
                                ) {
                                    Icon(painterResource(id = R.drawable.bookmark_remove), contentDescription = "delete")
                                }
                            }
                        }
                    } else if (item.type == "shoppingList") {
                        IconButton(
                            onClick = {
                                viewModel.delete(item = item)
                            }
                        ) {
                            Icon(painterResource(id = R.drawable.shopping_cart_remove), contentDescription = "delete")
                        }
                    }
                }
            }
        }
    }
    else {
        EditCard(viewModel = viewModel, item = item, type = item.type, saveEdit = saveEdit)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditCard(viewModel: MainViewModel, item: Item? = null, type: String, saveEdit: () -> Unit = {}) {
    var name by remember { mutableStateOf(item?.name ?: "") }
    var days by remember { mutableStateOf(item?.days?.toString() ?: "0") }
    var count by remember { mutableStateOf(item?.count?.toString() ?: "1") }
    var expiryDate by remember { mutableStateOf(true) }
    val focusManager = LocalFocusManager.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            .clickable(true) { },
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = if (item == null) "Add Item" else "Edit Item", modifier = Modifier.padding(top = 20.dp, start = 20.dp), style = MaterialTheme.typography.titleLarge)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.85f),
                    horizontalAlignment = Alignment.Start
                ) {
                    TextField(
                        value = name,
                        onValueChange = { name = it },
                        placeholder = {
                            Text("Name")
                        },
                        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                        keyboardActions = KeyboardActions(onDone = {
                            focusManager.clearFocus()
                        }),
                        maxLines = 1,
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        textStyle = MaterialTheme.typography.titleMedium
                    )

                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        if (type != "shoppingList") {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Column(
                                    horizontalAlignment = Alignment.Start,
                                    verticalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Start
                                    ) {
                                        Text(
                                            text = "Expiry Date",
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                        Checkbox(
                                            checked = expiryDate,
                                            onCheckedChange = { expiryDate = it })
                                    }
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Start
                                    ) {
                                        Text(
                                            text = "Expires in ",
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                        TextField(
                                            enabled = expiryDate,
                                            value = days,
                                            onValueChange = { days = it },
                                            placeholder = {
                                                Text("0")
                                            },
                                            keyboardOptions = KeyboardOptions(
                                                keyboardType = KeyboardType.Number,
                                                imeAction = ImeAction.Done
                                            ),
                                            keyboardActions = KeyboardActions(onDone = {
                                                focusManager.clearFocus()
                                            }),
                                            maxLines = 1,
                                            modifier = Modifier
                                                .width(75.dp),
                                            textStyle = MaterialTheme.typography.titleMedium
                                        )
                                        Text(
                                            text = " days",
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                    }
                                }
                            }
                        }
                        if (type != "savedItems") {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Count: ", style = MaterialTheme.typography.titleMedium)
                                TextField(
                                    value = count,
                                    onValueChange = { count = it },
                                    placeholder = {
                                        Text("0")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Number,
                                        imeAction = ImeAction.Done
                                    ),
                                    keyboardActions = KeyboardActions(onDone = {
                                        focusManager.clearFocus()
                                    }),
                                    maxLines = 1,
                                    modifier = Modifier
                                        .width(75.dp),
                                    textStyle = MaterialTheme.typography.titleMedium
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                IconButton(
                    onClick = {
                        if (name != "" && (type == "savedItems" || count != "0")) {
                            if (item == null)
                                viewModel.addItem(
                                    type = type,
                                    name = name,
                                    expiryDate = expiryDate,
                                    days = days.toInt(),
                                    count = count.toInt()
                                )
                            else {
                                viewModel.updateItem(
                                    item = item,
                                    name = name,
                                    expiryDate = expiryDate,
                                    days = days.toInt(),
                                    count = count.toInt()
                                )
                                saveEdit()
                            }
                        }
                    }
                ) {
                    Icon(painterResource(id = R.drawable.done), contentDescription = "edit")
                }
            }
        }
    }
}