package com.Eraga.service

import com.Eraga.model.AddressBook
import com.Eraga.request.SaveBandRequest

interface AddressBookService {

    fun findAll(): List<AddressBook>

    fun findById(address_book_id: Int): AddressBook

    fun create(request: SaveBandRequest)

    fun update(address_book_id: Int, request: SaveAddressBookRequest)

    fun delete(address_book_id: Int)