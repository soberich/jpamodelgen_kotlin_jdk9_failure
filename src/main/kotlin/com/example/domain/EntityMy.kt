package com.example.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToOne

@Entity
data class EntityMy(
        @Id
        val id: Int = 0,
        val name: String,
        val description: String? = null,
        val dueDate: LocalDate? = null,
        val done: Boolean = false
) {
    @ManyToOne
    lateinit var taskList: List<Foo>

    @OneToOne
    lateinit var foo: Foo

    constructor(name: String, buyers: List<Foo>) : this(name = name) {
        this.taskList = buyers
    }

//    lateinit var taskList: List<String>
//
//    constructor(name: String, buyers: List<String>) : this(name = name) {
//        this.taskList = buyers
//    }
}
