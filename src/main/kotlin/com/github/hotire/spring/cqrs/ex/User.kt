package com.github.hotire.spring.cqrs.ex

class User(
    val userId: String,
    val firstName: String,
    val lastName: String,
    val contacts: Set<Contact>,
    val addresses: Set<Address>
)

class Contact(
    val type: String,
    val detail: String
)

class Address(
    val city: String,
    val state: String,
    val postcode: String
)
