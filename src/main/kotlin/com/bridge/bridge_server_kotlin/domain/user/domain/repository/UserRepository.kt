package com.bridge.bridge_server_kotlin.domain.user.domain.repository

import com.bridge.bridge_server_kotlin.domain.user.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {
}