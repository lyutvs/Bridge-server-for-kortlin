package com.bridge.bridge_server_kotlin.domain.collaborate.domain.repository

import com.bridge.bridge_server_kotlin.domain.collaborate.domain.Collaborate
import org.springframework.data.repository.CrudRepository

interface CollaborateRepository: CrudRepository<Collaborate, Long> {
}