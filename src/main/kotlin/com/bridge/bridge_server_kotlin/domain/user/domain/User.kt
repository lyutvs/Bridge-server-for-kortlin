package com.bridge.bridge_server_kotlin.domain.user.domain

import com.bridge.bridge_server_kotlin.domain.user.domain.type.Authority
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import com.bridge.bridge_server_kotlin.infrastructure.s3.DefaultImage
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.DynamicInsert
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@DynamicInsert
@Table(name = "tbl_name")
@Entity
class User(

    email: String,

    password: String,

    accountId: String,

    companyName: String,

    profileImageUrl: String,

    companyInformation: String,

    managerName: String,

    managerEmail: String,

    companyPhoneNumber: String,

    address: String,

    authority: Authority,

    deviceToken: String,

    homePageUrl: String,

    isExposedFeed: Boolean

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 64)
    var email = email
        protected set

    @NotNull
    @Length(max = 60)
    var password = password
        protected set

    @NotNull
    @Length(max = 30)
    var accountId = accountId
        protected set

    @NotNull
    @Length(max = 50)
    var companyName = companyName
        protected set

    @ColumnDefault(DefaultImage.USER_PROFILE_IMAGE)
    @Column(nullable = false)
    var profileImageUrl = profileImageUrl
        protected set

    @NotNull
    @Length(max = 2000)
    var companyInformation = companyInformation
        protected set

    @NotNull
    @Length(max = 10)
    var managerName = managerName
        protected set

    @NotNull
    @Length(max = 64)
    var managerEmail = managerEmail
        protected set

    @NotNull
    @Length(max = 11)
    var companyPhoneNumber = companyPhoneNumber
        protected set

    @NotNull
    @Length(max = 93)
    var address = address
        protected set

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 7)
    var authority = authority
        protected set

    @NotNull
    @Length(max = 64)
    var deviceToken = deviceToken
        protected set

    @NotNull
    @Length(max = 255)
    var homePageUrl = homePageUrl
        protected set

    @ColumnDefault("0")
    @Column(nullable = false)
    var isExposedFeed =isExposedFeed
        protected set
}
