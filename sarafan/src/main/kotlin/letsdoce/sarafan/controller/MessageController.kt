package letsdoce.sarafan.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("message")
class MessageController {
    @GetMapping
    fun list(): String {
        return "index"
    }
}