package com.bridge.bridge_server_kotlin.domain.notice.domain

import com.bridge.bridge_server_kotlin.domain.user.domain.User
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_notice")
@Entity
class Notice(

    title: String,

    content: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

    @NotNull
    @Column(columnDefinition = "TEXT", nullable = false)
    var content = content
        protected set

}
