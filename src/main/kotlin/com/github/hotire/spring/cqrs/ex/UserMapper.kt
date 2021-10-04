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

@Mapper
interface ContactMapper {
    companion object {
        val INSTANCE: ContactMapper = Mappers.getMapper(ContactMapper::class.java)
    }

    fun toDomain(entity: ContactEntity): Contact
    fun toJpaEntity(domain: Contact): ContactEntity
}

@Mapper
interface AddressMapper {
    companion object {
        val INSTANCE: ContactMapper = Mappers.getMapper(ContactMapper::class.java)
    }

    fun toDomain(entity: AddressEntity): Address
    fun toJpaEntity(domain: Address): AddressEntity
}
