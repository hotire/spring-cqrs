package com.github.hotire.spring.cqrs.ex

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository {
    fun createUser(user: User): User
    fun updateUser(user: User): User
}

interface UserEntityRepository : JpaRepository<UserEntity, Long>, UserRepository {
    override fun createUser(user: User): User {
        return user
    }

    override fun updateUser(user: User): User {
        return user
    }
}
