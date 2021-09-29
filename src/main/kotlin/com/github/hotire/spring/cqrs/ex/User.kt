package com.github.hotire.spring.cqrs.ex

class User {
    val userid: String? = null
    val firstName: String? = null
    val lastName: String? = null
    val contacts: Set<Contact>? = null
    val addresses: Set<Address>? = null
}

class Contact(
    val type: String,
    val detail: String
)

class Address(
    val city: String,
    val state: String,
    val postcode: String
)
