package com.eraga.service

import org.slf4j.LoggerFactory
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import com.eraga.dao.AddressBookDao
import com.eraga.exception.AddressBookNotFoundException
import com.eraga.model.AddressBook
import com.eraga.request.SaveAddressBookRequest

@Service
class AddressBookServiceImpl(private val addressBookDao: AddressBookDao): AddressBookService {
    companion object {
        private val log = LoggerFactory.getLogger(AddressBookServiceImpl::class.java)
    }

    override fun create(request: SaveAddressBookRequest) {
        log.info("Создать новый контакт с именем=${request.name}")
        addressBookDao.save(
            AddressBook(
                name = request.name!!,
                region = request.region!!,
                city = request.city,
                contact = request.contact!!,
                notes = request.notes
            )
        )
    }

    override fun update(address_book_id: Int, request: SaveAddressBookRequest) {
        log.info("Обновить контакт с id=$address_book_id")
        val addressBook = addressBookDao.findByIdOrNull(address_book_id) ?:
            throw AddressBookNotFoundException(address_book_id)
        addressBookDao.save(
            addressBook.copy(
                name = request.name!!,
                region = request.region!!,
                city = request.city,
                contact = request.contact!!,
                notes = request.notes
            )
        )
    }

    override fun delete(address_book_id: Int) {
        log.info("Удалить контакт с id=$address_book_id")
        val addressBook = addressBookDao.findByIdOrNull(address_book_id) ?:
            throw AddressBookNotFoundException(address_book_id)
        addressBookDao.delete(addressBook)
    }


    override fun findAll(): List<AddressBook> {
        log.info("Найти все записи")
        return addressBookDao.findByOrderByName()
    }

    override fun findById(address_book_id: Int): AddressBook {
        log.info("Найти имя контакта с id=$address_book_id")
        return addressBookDao.findByIdOrNull(address_book_id) ?: throw AddressBookNotFoundException(address_book_id)
    }

}