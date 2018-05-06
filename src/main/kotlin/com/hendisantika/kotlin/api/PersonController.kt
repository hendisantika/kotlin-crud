package com.hendisantika.kotlin.api

import com.hendisantika.kotlin.entity.Person
import com.hendisantika.kotlin.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

/**
 * Created by hendisantika on 3/12/17.
 */

@RestController
@RequestMapping("/api/persons")
class PersonController {
    @Autowired
    var personService: PersonService? = null

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun getPersons(): List<Person> {
        return personService!!.findAll()
    }

    @RequestMapping(method = arrayOf(RequestMethod.POST))
    @ResponseStatus(HttpStatus.CREATED)
    fun insertPerson(@Validated @RequestBody Person: Person): Person {
        return personService!!.save(Person)
    }

    @RequestMapping(value = "{id}", method = arrayOf(RequestMethod.PUT))
    @ResponseStatus(HttpStatus.OK)
    fun updatePerson(@PathVariable("id") id: Long, @Validated @RequestBody person: Person): Person {
        person.id = id
        return personService!!.save(person)
    }

    @RequestMapping(value = "{id}", method = arrayOf(RequestMethod.DELETE))
    @ResponseStatus(HttpStatus.OK)
    fun deletePerson(@PathVariable("id") id: Long?) {
        personService!!.delete(id)
    }

    @RequestMapping(value = "{id}", method = arrayOf(RequestMethod.GET))
    fun getPerson(@PathVariable("id") id: Long?): Person {
        return personService!!.find(id)
    }
}