package com.bridge.bridge_server_kotlin.domain.category.domain

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table


@Table(name = "tbl_category_list")
@Entity
class CategoryList(

    @EmbeddedId
    var id: CategoryId

)