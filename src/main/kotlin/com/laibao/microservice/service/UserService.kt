package com.laibao.microservice.service

import com.laibao.microservice.entity.User
import com.laibao.microservice.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
class UserService (val userRepository: UserRepository){
    fun findUserByUserId(@PathVariable id: Long?): User {
        val user: User = userRepository.findOne(id)
        return user
    }
}