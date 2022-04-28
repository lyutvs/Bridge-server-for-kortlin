package com.bridge.bridge_server_kotlin.domain.notification.domain

import com.bridge.bridge_server_kotlin.domain.user.domain.User
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.DynamicInsert
import java.io.Serializable
import javax.persistence.Embeddable
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@DynamicInsert
@Embeddable
class NotificationId(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id", nullable = false)
    var notificationEntity: NotificationEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User,

    isRead: Boolean

): Serializable {

    @NotNull
    @ColumnDefault("0")
    var isRead = isRead
        protected set

}