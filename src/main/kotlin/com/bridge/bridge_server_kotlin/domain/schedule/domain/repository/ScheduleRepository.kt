package com.bridge.bridge_server_kotlin.domain.schedule.domain.repository

import com.bridge.bridge_server_kotlin.domain.schedule.domain.Schedule
import org.springframework.data.repository.CrudRepository

interface ScheduleRepository: CrudRepository<Schedule, Long> {
}
