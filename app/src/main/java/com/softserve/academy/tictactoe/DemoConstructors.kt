package com.softserve.academy.tictactoe

class A1(val name: String) {

}

data class TelephoneNumber(val value: String) {
    init {
        require(value.isNotEmpty()) { "phone number should not be empty" }
    }

    private fun isValid(): Boolean {
        // checking I'm a valid number
        return true
    }
}

class User(val telephoneNumber: TelephoneNumber) {
}

class A2(name: String) {
    init {
        println("In A2::init")
        require(name != "N/A")
    }

    var name: String = name.also { println("in initialization '$name'") }
        get() {
            return field
        }
        set(value) {
            println("set name to $value")
            require(value.isNotEmpty()) { "name should not be empty!!!" }
            field = value
        }

    fun foo() {
        this.name = "N/A"
    }
}

fun main13() {
    val a1 = A2("Alex")
    val a3 = A2("")
    runCatching { val a2 = A2("N/A") }

    val phone1 = TelephoneNumber("123")
    val phone2 = TelephoneNumber("")
}

fun main12() {
    val a1 = A1("Alex")
    println(a1.name)
    val a2 = A2("Oles")
    println(a2.name)
    a2.name = "Bob"
    println(a2.name)
    a2.foo()
    println(a2.name)
}

class MyBigInteger {
    constructor(str: String) {
        println("Creating BigInteger from string $str")
    }
    constructor(num: Int) {
        println("Creating BigInteger from int $num")
    }
}

fun main14() {
    val num1 = MyBigInteger("'123456'")
    val num2 = MyBigInteger(123)
}

class PositiveInt(num: Int) {
    init {
        require(num > 0)
    }

    val num = num

    constructor() : this("12"
        .also { println("inside parameter of constructor()") }) {
    }

    constructor(str: String) : this(
        str.toInt()
    ) {
        println("after primary constructor")
    }

    override fun toString(): String {
        return "PositiveInt(num=$num)"
    }
}

fun main() {
    val pnum1 = PositiveInt(12)
    val pnum2 = PositiveInt("12")
    runCatching { PositiveInt("12") }
        .onFailure {
            println("error: ${it.message}")
            it.printStackTrace()
        }
        .onSuccess { println(it) }
    runCatching { PositiveInt("-12") }
        .onFailure {
            println("error: ${it.message}")
            it.printStackTrace()
        }
        .onSuccess { println(it) }
    runCatching { PositiveInt("adfgaf") }
        .onFailure {
            println("error: ${it.message}")
            it.printStackTrace()
        }
        .onSuccess { println(it) }
}
