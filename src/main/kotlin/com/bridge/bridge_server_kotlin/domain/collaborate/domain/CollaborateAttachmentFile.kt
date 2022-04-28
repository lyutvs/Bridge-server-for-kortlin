package com.bridge.bridge_server_kotlin.domain.collaborate.domain

import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_collaborate_attachment_file")
@Entity
class CollaborateAttachmentFile(

    collaborateAttachmentFileUrl: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collaborate_id")
    var collaborate: Collaborate

): BaseTimeIdEntity() {

    @NotNull
    var collaborateAttachmentFileUrl = collaborateAttachmentFileUrl
        protected set

}