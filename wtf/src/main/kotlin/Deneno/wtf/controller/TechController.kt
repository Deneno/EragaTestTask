package deneno.wtf.controller

import deneno.wtf.entities.PersonEntity
import deneno.wtf.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hello/")
class TechController (private val personService: PersonService) {

    @GetMapping("{name}")
    fun hello(@PathVariable name:String):ResponseEntity<Any> {
        val person = personService.findByName(name)
        return if (person != null) ResponseEntity.ok(person) else ResponseEntity.notFound().build()
    }
    @PostMapping("add")
    fun save(@RequestBody personEntity: PersonEntity) {
        personService.save(personEntity)
    }
}