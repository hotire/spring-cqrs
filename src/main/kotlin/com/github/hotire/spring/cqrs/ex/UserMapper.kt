package com.github.hotire.spring.cqrs.ex

import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface UserMapper {

    companion object {
        val INSTANCE: UserMapper = Mappers.getMapper(UserMapper::class.java)
    }

    fun toDomain(userEntity: UserEntity): User
    fun toJpaEntity(user: User): UserEntity
}
