package com.bridge.bridge_server_kotlin.domain.collaborate.domain.repository

import com.bridge.bridge_server_kotlin.domain.collaborate.domain.CollaborateAttachmentFile
import org.springframework.data.repository.CrudRepository

interface CollaborateAttachmentFileRepository: CrudRepository<CollaborateAttachmentFile, Long> {
}