package com.bridge.bridge_server_kotlin.domain.category.domain

import com.bridge.bridge_server_kotlin.domain.feed.domain.Feed
import com.bridge.bridge_server_kotlin.domain.user.domain.User
import java.io.Serializable
import javax.persistence.Embeddable
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Embeddable
class CategoryId(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    var category: Category,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feed_id", nullable = false)
    var feed: Feed

): Serializable