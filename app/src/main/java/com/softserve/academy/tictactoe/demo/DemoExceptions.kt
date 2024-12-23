package com.softserve.academy.tictactoe.demo

fun main1() {
    val answer = readln()
    val yourAge = try {
        checkAge(answer.toInt())
    } catch (e: Exception) {
        when (e) {
            is NumberFormatException,
            is IllegalArgumentException -> 0
            else -> 10
        }
    }
    println("your age is $yourAge")
}

fun main2() {
    val answer = readln()
    val yourAge = checkAgeOrNull(answer.toIntOrNull()) ?: 0
    println("your age is $yourAge")
}

fun main3() {
    val answer = readln()
    val yourAge = runCatching { checkAge(answer.toInt()) }
    when {
        yourAge.isSuccess -> println("Your age is ${yourAge.getOrNull()}")
        yourAge.isFailure -> println("Sorry, no value")
    }
}

fun main4() {
    val nums = LongArray(Int.MAX_VALUE) { 0L }
}

fun main() {
    val pi: Double = error("Find pi value in Internet")
}

fun checkAge(age: Int): Int {
//    if (age < 1 || age > 110) {
//        throw IllegalArgumentException("Illegal age = $age")
//    }
    require(age in 1..110) { "Illegal age = $age" }
    return age
}

fun checkAgeOrNull(age: Int?): Int? {
    if (age == null || age < 1 || age > 110) {
        return null
    }
    return age
}