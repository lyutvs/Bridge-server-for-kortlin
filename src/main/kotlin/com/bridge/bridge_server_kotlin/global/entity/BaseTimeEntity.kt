package com.bridge.bridge_server_kotlin.global.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass
import javax.validation.constraints.NotNull

@EntityListeners(value = [AuditingEntityListener::class])
@MappedSuperclass
class BaseTimeEntity {

    @NotNull
    @CreatedDate
    var createdAt: LocalDateTime = LocalDateTime.now()

}