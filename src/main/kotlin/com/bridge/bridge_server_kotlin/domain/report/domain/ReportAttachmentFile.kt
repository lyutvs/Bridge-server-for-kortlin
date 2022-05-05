package com.bridge.bridge_server_kotlin.domain.report.domain

import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_report_attachment_file")
@Entity
class ReportAttachmentFile(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "report_id", nullable = false)
    var report: Report,

    reportAttachmentFileUrl: String

): BaseTimeIdEntity() {

    @NotNull
    var reportAttachmentFileUrl = reportAttachmentFileUrl
        protected set

}