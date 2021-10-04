package com.github.hotire.spring.cqrs.ex

data class User(
    val userId: String,
    val firstName: String,
    val lastName: String,
    val contacts: Set<Contact>,
    val addresses: Set<Address>
)

data class Contact(
    val type: String,
    val detail: String
)

data class Address(
    val city: String,
    val state: String,
    val postcode: String
)
