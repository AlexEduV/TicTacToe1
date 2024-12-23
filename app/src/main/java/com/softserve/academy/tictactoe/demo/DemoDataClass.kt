package com.softserve.academy.tictactoe.demo

import androidx.compose.ui.graphics.Color

class Person(val name: String,
             val age: Int) {
    operator fun component1(): String = name
    operator fun component2(): Int = age
}

class MyUtil private constructor(val seed: Int) {

}

data class Student(
    val name: String,
    val age: Int,
    val status: String = "valStudent") {
//    fun copy(
//        name: String = this.name,
//        age: Int = this.age
//    ): Student = Student(name, age)
    operator fun component4(): String = "Student"
}

fun main() {
    var student1 = Student("Alice", 17)
    student1 = Student(student1.name, student1.age + 1)
    student1 = student1.copy(age = student1.age + 1)
    student1 = student1.copy(name = "Alice Couper", age = 18)
    val color1: Color = Color.Red.copy(alpha = 0.5f)
    val names = listOf("Alice", "Bob")
    for (pair in names.withIndex()) {
        val (ix, name) = pair // destructuring
        println("${ix + 1}: $name")
    }
    for ((ix, name) in names.withIndex()) {
        println("${ix + 1}: $name")
    }
    for ((ix, _) in names.withIndex()) {
        println("${ix + 1}: ${names[ix]}")
    }
    names.withIndex().forEach { (ix, name) ->
        println("${ix + 1}: $name")
    }
    names.forEachIndexed { ix, name ->
        println("${ix + 1}: $name")
    }
    val (name, age, status) = student1
    val (_, _, status2) = student1
    val age3 = student1.component2()
//    println("_ = ${_}")
    val status1 = student1.component3()
    val name1 = student1.component1()
    println("$status name = $name, age = $age")
    println("$status1 name = $name1, age = $age")
    val person1 = Person("Bob", 20)
    val (name2, age2) = person1
}