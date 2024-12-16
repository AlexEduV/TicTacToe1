package com.softserve.academy.tictactoe

fun main() {
    val fun1 = external(13)
    println(fun1(10))
}

fun external(a: Int): (Int) -> Int {
    var c = 12
    fun internal(b: Int): Int {
        return a + b + c
    }
    c++
    return ::internal
}