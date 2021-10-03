package com.github.hotire.spring.cqrs.ex

data class CreateUserCommand(
    val userId: String? = null,
    val firstName: String? = null,
    val lastName: String? = null
)
