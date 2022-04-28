package com.bridge.bridge_server_kotlin.domain.notification.domain.repository

import com.bridge.bridge_server_kotlin.domain.notification.domain.NotificationEntity
import com.bridge.bridge_server_kotlin.domain.notification.domain.NotificationId
import org.springframework.data.repository.CrudRepository

interface NotificationListRepository: CrudRepository<NotificationEntity, NotificationId> {
}