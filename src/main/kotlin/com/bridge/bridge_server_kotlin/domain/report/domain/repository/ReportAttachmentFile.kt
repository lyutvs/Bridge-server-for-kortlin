package com.bridge.bridge_server_kotlin.domain.report.domain.repository

import com.bridge.bridge_server_kotlin.domain.report.domain.Report
import org.springframework.data.repository.CrudRepository

interface ReportAttachmentFile: CrudRepository<Report, Long> {
}