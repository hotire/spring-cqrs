package com.github.hotire.spring.cqrs.ex

/**
 * output
 */
interface CreateUserPort {
    fun create(user: User): User
}

/**
 * intput
 */
interface CreateUserUseCase {
    fun create(command: CreateUserCommand): Boolean
}