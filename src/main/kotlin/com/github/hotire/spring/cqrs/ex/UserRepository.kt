package com.github.hotire.spring.cqrs.ex

import org.springframework.data.jpa.repository.JpaRepository

interface UserEntityRepository : JpaRepository<UserEntity, Long>
