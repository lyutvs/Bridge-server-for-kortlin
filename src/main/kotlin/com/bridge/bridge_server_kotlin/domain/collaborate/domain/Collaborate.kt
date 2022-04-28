package com.bridge.bridge_server_kotlin.domain.collaborate.domain

import com.bridge.bridge_server_kotlin.domain.collaborate.domain.type.Progress
import com.bridge.bridge_server_kotlin.domain.user.domain.User
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_collaborate")
@Entity
class Collaborate(

    title: String,

    content: String,

    progress: Progress,

    managerName: String,

    companyPhoneNumber: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "send_user_id")
    var sendUser: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "received_user_id")
    var receivedUser: User

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

    @Column(columnDefinition = "TEXT", nullable = false)
    var content = content
        protected set

    @NotNull
    @Length(max = 10)
    var progress = progress
        protected set

    @NotNull
    @Length(max = 20)
    var managerName = managerName
        protected set

    @NotNull
    @Length(max = 11)
    var companyPhoneNumber = companyPhoneNumber
        protected set

}