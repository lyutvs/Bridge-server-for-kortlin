package com.bridge.bridge_server_kotlin.domain.feed.domain.repository

import com.bridge.bridge_server_kotlin.domain.feed.domain.Feed
import org.springframework.data.repository.CrudRepository

interface FeedRepository: CrudRepository<Feed, Long> {
}