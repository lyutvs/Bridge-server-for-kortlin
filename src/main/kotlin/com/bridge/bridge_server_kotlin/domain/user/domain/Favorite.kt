package com.bridge.bridge_server_kotlin.domain.user.domain

import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import javax.persistence.*

@Entity
@Table(name = "tbl_favorite")
class Favorite(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "target_user_id", nullable = false)
    var targetUser: User

): BaseTimeIdEntity()