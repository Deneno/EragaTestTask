package com.Eraga.dao

import org.springframework.data.repository.CrudRepository
import com.Eraga.model.AddressBook

interface BandDao : CrudRepository<AddressBook, Int> {
    fun findByOrderByName(): List<AddressBook>
}