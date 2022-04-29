package com.bridge.bridge_server_kotlin.domain.feed.domain

import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_feed_attachment_file")
@Entity
class FeedAttachmentFile(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feed_id", nullable = false)
    var feed: Feed,

    feedAttachmentFile: String

): BaseTimeIdEntity() {

    @NotNull
    var feedAttachmentFile = feedAttachmentFile
        protected set
}