package com.softserve.academy.tictactoe.demo

import kotlin.random.Random

fun main() {
    val c1 = C1()
    val c2 = C1()
    val c3 = C1()
    println(c1.prop1)
    println(c2.prop1)
    println(c3.prop1)
    println(c3.prop1)
    println(c3.prop1)
    println(c3.prop1)
    c3.prop1 = 13
}

class C1 {
    init {

    }
    var prop1: Int// = 12
        get() = Random.nextInt(10)
        set(value) {
//            field = value
        }


}