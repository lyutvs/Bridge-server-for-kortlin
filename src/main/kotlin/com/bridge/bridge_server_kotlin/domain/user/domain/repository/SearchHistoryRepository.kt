package com.bridge.bridge_server_kotlin.domain.user.domain.repository

import com.bridge.bridge_server_kotlin.domain.user.domain.SearchHistory
import org.springframework.data.repository.CrudRepository

interface SearchHistoryRepository: CrudRepository<SearchHistory, Long> {
}