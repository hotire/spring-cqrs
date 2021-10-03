package com.github.hotire.spring.cqrs.ex

import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository)
