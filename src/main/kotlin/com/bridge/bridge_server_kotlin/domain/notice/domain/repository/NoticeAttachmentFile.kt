package com.bridge.bridge_server_kotlin.domain.notice.domain.repository

import com.bridge.bridge_server_kotlin.domain.notice.domain.NoticeAttachmentFile
import org.springframework.data.repository.CrudRepository

interface NoticeAttachmentFile: CrudRepository<NoticeAttachmentFile, Long> {
}