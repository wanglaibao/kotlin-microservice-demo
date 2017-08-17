package com.laibao.microservice.repository

import com.laibao.microservice.entity.User
import org.springframework.data.jpa.repository.JpaRepository



interface UserRepository : JpaRepository<User, Long>//CrudRepository<User, Long>