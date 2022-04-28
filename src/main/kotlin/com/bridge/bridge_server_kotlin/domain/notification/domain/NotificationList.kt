package com.bridge.bridge_server_kotlin.domain.notification.domain

import javax.persistence.Embeddable
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "tbl_notification_list")
@Entity
class NotificationList(

    @EmbeddedId
    var id: NotificationId

)