package com.bridge.bridge_server_kotlin.domain.report.domain

import com.bridge.bridge_server_kotlin.domain.user.domain.User
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbL_report")
@Entity
class Report(

    title: String,

    content: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "report_user_id")
    var reportUserId: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reporter_user_id")
    var reporterUserId: User

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

    @NotNull
    var content = content
        protected set
}