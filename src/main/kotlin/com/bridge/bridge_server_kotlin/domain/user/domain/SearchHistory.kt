package com.bridge.bridge_server_kotlin.domain.user.domain

import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_search_history")
@Entity
class SearchHistory(

    sentence: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 100)
    var sentence = sentence
        protected set
}
