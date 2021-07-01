package com.eraga.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(HttpStatus.NOT_FOUND)
class AddressBookNotFoundException(address_book_id: Int): RuntimeException("Name with id=$address_book_id not found")