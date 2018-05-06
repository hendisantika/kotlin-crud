package com.hendisantika.kotlin.repository

import com.hendisantika.kotlin.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by hendisantika on 3/12/17.
 */

interface PersonRepository : JpaRepository<Person, Long>
