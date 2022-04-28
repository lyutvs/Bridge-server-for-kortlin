package com.bridge.bridge_server_kotlin.domain.notice.domain

import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_notice_attachment_file")
@Entity
class NoticeAttachmentFile(

    noticeAttachmentFileUrl: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notice_id", nullable = false)
    var notice: Notice

): BaseTimeIdEntity() {

    @NotNull
    var noticeAttachmentFileUrl = noticeAttachmentFileUrl
        protected set

}
