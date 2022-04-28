package com.bridge.bridge_server_kotlin.domain.category.domain.repository

import com.bridge.bridge_server_kotlin.domain.category.domain.Category
import com.bridge.bridge_server_kotlin.domain.category.domain.CategoryId
import org.springframework.data.repository.CrudRepository

interface CategoryListRepository: CrudRepository<Category, CategoryId> {
}
