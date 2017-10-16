package com.laibao.microservice.service

import com.laibao.microservice.entity.User
import com.laibao.microservice.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (val userRepository: UserRepository){

    fun findUserByUserId(id: Long?): User {
        val user: User = userRepository.findOne(id)
        return user
    }

    fun findAllUser(): List<User> = userRepository.findAll()
}