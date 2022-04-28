package com.bridge.bridge_server_kotlin.domain.schedule.domain

import com.bridge.bridge_server_kotlin.domain.user.domain.User
import com.bridge.bridge_server_kotlin.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_schedule")
@Entity
class Schedule (

    title: String,

    scheduleStartAt: LocalDateTime,

    scheduleEndAt: LocalDateTime,

    alarmAt: LocalDateTime,

    address: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proposal_user_id")
    var proposalUser: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "participant_user_id")
    var participantUser: User

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

    @NotNull
    var scheduleStarAt  = scheduleStartAt
        protected set

    @NotNull
    var scheduleEndAt = scheduleEndAt
        protected set

    @NotNull
    var alarmAt = alarmAt
        protected set

    @NotNull
    @Length(max = 93)
    var address = address
        protected set
}
