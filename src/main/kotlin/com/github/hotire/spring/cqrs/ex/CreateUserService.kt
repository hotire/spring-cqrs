package com.github.hotire.spring.cqrs.ex

import org.springframework.stereotype.Service

@Service
class CreateUserService : CreateUserUseCase {
    override fun create(command: CreateUserCommand): Boolean {
        TODO("Not yet implemented")
    }
}
