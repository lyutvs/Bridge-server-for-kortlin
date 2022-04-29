package com.bridge.bridge_server_kotlin.domain.feed.domain

import com.bridge.bridge_server_kotlin.domain.user.domain.User
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_feed")
@Entity
class Feed(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var user: User,

    title: String,

    content: String,

    projectManagerName: String,

    projectMangerPhoneNumber: String

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 30)
    var title = title
        protected set

    @Column(columnDefinition = "TEXT", nullable = false)
    var content = content
        protected set

    @NotNull
    @Length(max = 10)
    var projectManagerName = projectManagerName
        protected set

    @NotNull
    @Length(max = 11)
    var projectMangerPhoneNumber = projectMangerPhoneNumber
        protected set
}
