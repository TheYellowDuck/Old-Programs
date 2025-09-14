package com.example.myfridge.data

import kotlinx.coroutines.flow.Flow

class OfflineItemRepository(private val itemDao: ItemDao) : ItemRepository {
    override fun getImageByIdStream(id: Int): Flow<Item> = itemDao.getItemById(id)

    override fun getAllItemsStream(type: String): Flow<List<Item>> = itemDao.getAllItems(type)

    override fun getExpiredItemsStream(): Flow<List<Item>> = itemDao.getExpiredItems()

//    override fun getImagesByUserStream(user: String): Flow<List<Item>> = itemDao.getImagesByUser(user)

    override suspend fun insertItem(item: Item) = itemDao.insert(item)

    override suspend fun deleteItem(item: Item) = itemDao.delete(item)

    override suspend fun updateItem(item: Item)  = itemDao.update(item)

}