package deneno.wtf.repositories

import deneno.wtf.entities.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: JpaRepository<PersonEntity, Int> {

    fun findByName(name:String): PersonEntity?
}