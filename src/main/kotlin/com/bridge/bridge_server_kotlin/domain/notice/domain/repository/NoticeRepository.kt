package com.bridge.bridge_server_kotlin.domain.notice.domain.repository

import com.bridge.bridge_server_kotlin.domain.notice.domain.Notice
import org.springframework.data.repository.CrudRepository

interface NoticeRepository: CrudRepository<Notice, Long> {
}