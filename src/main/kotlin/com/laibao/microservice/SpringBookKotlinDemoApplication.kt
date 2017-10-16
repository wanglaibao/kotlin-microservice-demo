package com.laibao.microservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class SpringBootKotlinDemoApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SpringBootKotlinDemoApplication::class.java, *args)
        }
    }

}


