package com.hendisantika.kotlin.entity

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 * Created by hendisantika on 3/12/17.
 */
@Entity
@Data
data class Person(
        @Id
        @GeneratedValue
        var id: Long = 0,

        @NotNull
        @Size(min = 1, max = 255)
        var name: String = "",

        @NotNull
        @Size(min = 1, max = 255)
        var level: String = ""
)
