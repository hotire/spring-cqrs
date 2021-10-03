package com.github.hotire.spring.cqrs.ex

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository

interface UserEntityRepository : JpaRepository<UserEntity, Long>, UserRepository
