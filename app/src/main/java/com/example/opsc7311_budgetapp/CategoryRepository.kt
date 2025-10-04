package com.example.opsc7311_budgetapp.data

import kotlinx.coroutines.flow.Flow

class CategoryRepository(private val categoryDao: CategoryDao) {
    fun getAll(): Flow<List<Category>> = categoryDao.getAllCategories()
    suspend fun insert(cat: Category) = categoryDao.insert(cat)
    suspend fun delete(id: Long) = categoryDao.deleteById(id)
}
