package com.softserve.academy.tictactoe

fun main() {
//    println(foo1())
//    println(foo2())
//    println(foo3())
    println(pars(1, 2))
    println(pars(a = 1, 2))
    println(pars(a = 1, b = 2))
    println(pars(b = 2, a = 1))
    println(pars(a = 1, 2))
    println(pars(1, b = 2))
    println(pars())
    println(pars(1))
    println(pars(a = 1))
    println(pars(b = 1))

    println(listOf("Alice", "bob").joinToString(
        prefix = "[", postfix = "]", separator = ";"))
}

fun pars(a: Int = 1, b: Long = 1L): Long {
    return a + b
}

// overload - перевантаження
//fun pars(a: Int): Long {
//    return a + 1L
//}


fun foo1(): String {
    return "Hi"
}

fun foo2(): String = "Hi"

fun foo3() = "Hi"
