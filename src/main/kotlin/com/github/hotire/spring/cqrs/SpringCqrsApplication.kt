package com.github.hotire.spring.cqrs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCqrsApplication

fun main(args: Array<String>) {
    runApplication<SpringCqrsApplication>(*args)
}
