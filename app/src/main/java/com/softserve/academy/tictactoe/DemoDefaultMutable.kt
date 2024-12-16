package com.softserve.academy.tictactoe

fun main() {
    setAt(position = 0, value = 11)
    setAt(position = 1, value = 22)
    myPrint("Hello", "world")
    myPrint("One", "line")
    myPrint("line =", 12)
    myPrint(arrayOf("Alice", "Bob"))
}

fun setAt(value: Int, position: Int, arr: IntArray = intArrayOf(1, 2, 3)) {
    arr[position] = value
    println(arr.contentToString())
}

fun myPrint(vararg params: Any, sep: String = " ", end: String = "\n") {
    print(params.joinToString(separator = sep, postfix = end) { it.toString() })
}