package deneno.wtf.service

import deneno.wtf.entities.PersonEntity

interface PersonService {
    fun findAll(): List<PersonEntity>
    fun findByName(name:String): PersonEntity?
    fun save(personEntity: PersonEntity)
}