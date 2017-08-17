package com.laibao.microservice.controller

import com.laibao.microservice.entity.User
import com.laibao.microservice.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController (val userService: UserService){

    //@Autowired
    //lateinit var userRepository: UserRepository

    @GetMapping(value = "/{id}")
    fun findById(@PathVariable id: Long?): User {
        val findOne = userService.findUserByUserId(id)
        return findOne
    }

}