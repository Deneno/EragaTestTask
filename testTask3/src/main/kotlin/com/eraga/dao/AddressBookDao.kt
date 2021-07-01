package com.eraga.dao

import org.springframework.data.repository.CrudRepository
import com.eraga.model.AddressBook

interface BandDao : CrudRepository<AddressBook, Int> {
    fun findByOrderByName(): List<AddressBook>
}