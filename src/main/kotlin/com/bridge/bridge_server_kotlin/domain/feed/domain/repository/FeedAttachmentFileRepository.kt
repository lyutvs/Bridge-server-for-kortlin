package com.bridge.bridge_server_kotlin.domain.feed.domain.repository

import com.bridge.bridge_server_kotlin.domain.feed.domain.FeedAttachmentFile
import org.springframework.data.repository.CrudRepository

interface FeedAttachmentFileRepository: CrudRepository<FeedAttachmentFile, Long> {
}