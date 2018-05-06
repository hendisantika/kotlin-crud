package com.hendisantika.kotlin

import com.hendisantika.kotlin.entity.Person
import com.hendisantika.kotlin.repository.PersonRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinCrudApplication {
    @Bean
    fun init(repository: PersonRepository) = CommandLineRunner {
        repository.save(Person(1, "Naruto", "Hokage"))
        repository.save(Person(2, "Kakashi", "Hokage"))
        repository.save(Person(3, "Sakura", "Jounin"))
        repository.save(Person(4, "Sasuke", "Jounin"))
        repository.save(Person(5, "Jiraiya", "Sannin"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinCrudApplication::class.java, *args)
}
