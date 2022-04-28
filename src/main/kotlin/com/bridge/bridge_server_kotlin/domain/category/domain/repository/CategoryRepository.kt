package com.bridge.bridge_server_kotlin.domain.category.domain.repository

import com.bridge.bridge_server_kotlin.domain.category.domain.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository: CrudRepository<Category, Long> {
}