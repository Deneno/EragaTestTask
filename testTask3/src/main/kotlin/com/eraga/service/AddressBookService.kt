package com.eraga.service

import com.eraga.model.AddressBook
import com.eraga.request.SaveAddressBookRequest

interface AddressBookService {

    fun create(request: SaveAddressBookRequest)

    fun update(address_book_id: Int, request: SaveAddressBookRequest)

    fun delete(address_book_id: Int)

    fun findAll(): List<AddressBook>

    fun findById(address_book_id: Int): AddressBook

}