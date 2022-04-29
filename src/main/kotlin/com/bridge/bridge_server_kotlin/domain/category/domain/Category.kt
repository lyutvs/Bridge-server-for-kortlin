package com.bridge.bridge_server_kotlin.domain.category.domain

import com.bridge.bridge_server_kotlin.domain.user.domain.User
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_category")
@Entity
class Category(

    title: String,

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 164)
    var title = title
        protected set

}
