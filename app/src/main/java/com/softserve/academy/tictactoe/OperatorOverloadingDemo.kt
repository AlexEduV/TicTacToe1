package com.softserve.academy.tictactoe

fun main() {
    println(("Hello world, Bye world!" - "world"))
    println(("Hello World, Bye World!" - "world"))
}

operator fun String.minus(toRemove: String): String {
    return this.replace(toRemove, "")
}