package com.bridge.bridge_server_kotlin.domain.notification.domain

import com.bridge.bridge_server_kotlin.domain.notification.domain.type.NotificationType
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Table(name = "tbl_notification")
@Entity
class NotificationEntity(

    title: String,

    notificationType: NotificationType,

    content: String,

    data: Long

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

    @NotNull
    @Length(max = 8)
    var notificationType = notificationType
        protected set
}