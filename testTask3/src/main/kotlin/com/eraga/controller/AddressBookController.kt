package com.eraga.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.eraga.model.AddressBook
import com.eraga.request.SaveAddressBookRequest
import com.eraga.response.StatusResponse
import com.eraga.service.AddressBookService
import javax.validation.Valid


@RestController
@RequestMapping("/addressBook", produces = [MediaType.APPLICATION_JSON_VALUE])
class AddressBookController(private val addressBookService: AddressBookService) {

    @GetMapping
    fun findAll() = addressBookService.findAll()

    @GetMapping("/{address_book_id}")
    fun findById(@PathVariable("address_book_id") address_book_id: Int): AddressBook {
        return addressBookService.findById(address_book_id)
    }

    @PostMapping
    fun create(@Valid @RequestBody request: SaveAddressBookRequest): StatusResponse {
        addressBookService.create(request)
        return StatusResponse("Created")
    }

    @PutMapping("/{address_book_id}")
    fun update(
        @PathVariable("address_book_id") address_book_id: Int,
        @Valid @RequestBody request: SaveAddressBookRequest
    ): StatusResponse {
        addressBookService.update(address_book_id, request)
        return StatusResponse("Updated")
    }

    @DeleteMapping("/{address_book_id}")
    fun delete(@PathVariable("address_book_id") address_book_id: Int
    ): StatusResponse {
        addressBookService.delete(address_book_id)
        return StatusResponse("Deleted")
    }
}