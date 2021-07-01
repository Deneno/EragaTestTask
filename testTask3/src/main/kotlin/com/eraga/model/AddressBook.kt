package com.eraga.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "AddressBook")
data class AddressBook(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val address_book_id: Int = 0,
    val name: String,
    val region: String,
    val city: String,
    val contact: String,
    val notes: String
)