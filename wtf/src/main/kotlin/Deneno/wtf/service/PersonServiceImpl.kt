package deneno.wtf.service

import deneno.wtf.entities.PersonEntity
import deneno.wtf.repositories.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl(private val personRepository: PersonRepository):PersonService {
    override fun findAll(): List<PersonEntity> {
        return personRepository.findAll()
    }

    override fun findByName(name: String): PersonEntity? {
        return personRepository.findByName(name)
    }

    override fun save(personEntity: PersonEntity) {
        personRepository.save(personEntity)

    }

}