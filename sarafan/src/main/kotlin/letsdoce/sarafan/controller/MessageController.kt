package letsdoce.sarafan.controller

import letsdoce.sarafan.exception.NotFoundException
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("message")
class MessageController {
    fun messages(): List<Map<String, String>> {
        val message: MutableList<Map<String, String>> = mutableListOf(mutableMapOf("id" to "1", "text" to "First message"))
        message.add(mutableMapOf("id" to "2", "text" to "Second message"))
        message.add(mutableMapOf("id" to "3", "text" to "Third message"))
        return message
    }

    @GetMapping
    fun list(): List<Map<String, String>> {
        return messages()
    }
    @GetMapping("{id}")
    fun findById(@PathVariable id: String): Map<String, String>  {
        return messages().filter{it["id"].equals(id)}.toList().firstOrNull() ?: throw NotFoundException(id)

        }
}