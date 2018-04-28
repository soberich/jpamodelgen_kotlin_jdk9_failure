package com.example.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToOne


@Entity
open class Foo(
        @Id
        val id: Int = 0
) {
    @ManyToOne
    lateinit var taskList: List<EntityMy>

    @OneToOne
    lateinit var my: EntityMy

    constructor(name: String, buyers: List<EntityMy>) : this() {
        this.taskList = buyers
    }

//    lateinit var taskList: List<String>
//
//    constructor(name: String, buyers: List<String>) : this(name = name) {
//        this.taskList = buyers
//    }
}
