package com.softserve.academy.tictactoe.demo

import java.util.UUID

data class A(
    val name: String = "N/A",
    var age: Int = 0
) {
    var id: Int = 1
}

data class DollarBill(val amount: Int) {
    var id: String = UUID.randomUUID().toString()

    override fun toString(): String {
        return "DollarBill(amount=$amount, id='$id')"
    }
}

fun main() {
    val fiveBucks1 = DollarBill(5)
    val fiveBucks2 = DollarBill(5)
    println(fiveBucks1 == fiveBucks2)
    println(fiveBucks1)
    println(fiveBucks2)
}

fun main11() {
    val a1: A = A("Alex")
    val a2 = A(name = "Oles")
    val a3 = A()
    val a4 = A()

    println("name = ${a1.name}, age = ${a1.age}, id = ${a1.id}")
    a1.age += 1
    a1.id = 2
    println("name = ${a1.name}, age = ${a1.age}, id = ${a1.id}")

    a3.id = 10
    a4.id = 15
    println(a3 === a4)
    println(a3 == a4)
    println(a3)
    println(a4)
    println(a3.hashCode())
    println(a4.hashCode())
}