package com.github.hotire.spring.cqrs.ex

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class UserEntity(
    @Id
    val userId: String,
    val firstName: String,
    val lastName: String,
    @OneToMany
    val contacts: Set<ContactEntity>,
    @OneToMany
    val addresses: Set<AddressEntity>,
)

@Entity
class ContactEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val type: String,
    val detail: String
)

@Entity
class AddressEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val city: String,
    val state: String,
    val postcode: String
)
