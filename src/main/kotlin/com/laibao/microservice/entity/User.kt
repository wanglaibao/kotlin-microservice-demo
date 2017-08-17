package com.laibao.microservice.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class User (@Id @GeneratedValue(strategy = GenerationType.AUTO)
            var id: Long, //= 0,
            var account:String, //= "",
            var name:String, //= "",
            var age:Int, //= 0,
            var balance:Double //= 0.0
            ) : Serializable {
        constructor() : this(0, "", "",0,0.0)  // Hibernate反射 需要
}