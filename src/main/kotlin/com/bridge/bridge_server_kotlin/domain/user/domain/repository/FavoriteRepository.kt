package com.bridge.bridge_server_kotlin.domain.user.domain.repository

import com.bridge.bridge_server_kotlin.domain.user.domain.Favorite
import org.springframework.data.repository.CrudRepository

interface FavoriteRepository: CrudRepository<Favorite, Long> {
}