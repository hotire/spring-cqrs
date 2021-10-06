package com.github.hotire.spring.cqrs.ex

import org.junit.jupiter.api.Test

internal class UserMapperTest {

    @Test
    fun toDomain() {
        // given, when
        val result = UserMapper.INSTANCE.toDomain(
            UserEntity(
                "id", "first", "last", setOf(ContactEntity(1L, "type", "detail")),
                setOf(
                    AddressEntity(1L, "city", "state", "postcode")
                )
            )
        )

        // no assert
    }
}
