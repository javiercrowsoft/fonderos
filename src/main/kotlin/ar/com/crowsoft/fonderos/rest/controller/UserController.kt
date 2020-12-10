package ar.com.crowsoft.fonderos.rest.controller

import ar.com.crowsoft.fonderos.core.model.User
import ar.com.crowsoft.fonderos.core.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("api/v1/users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun findAll() = userService.findAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id: Int) = userService.get(id)

    @PostMapping
    fun create(@Valid @RequestBody user: User) = userService.create(user)

    @PutMapping("/{id}")
    fun create(@PathVariable id: Int, @Valid @RequestBody user: User) = userService.update(id, user)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) = userService.delete(id)

}