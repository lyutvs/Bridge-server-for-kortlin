package com.bridge.bridge_server_kotlin.domain.notification.domain.repository

import com.bridge.bridge_server_kotlin.domain.notification.domain.NotificationEntity
import org.springframework.data.repository.CrudRepository

interface NotificationRepository: CrudRepository<NotificationEntity, Long> {

}