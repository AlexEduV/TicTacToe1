package com.softserve.academy.tictactoe.model

import com.softserve.academy.tictactoe.model.GameState.*

typealias Field = CharArray

fun String.toField(): Field = this.toCharArray()

var data: Field = "0X0X0X0X0".toField()

const val DIM = 3

fun ix(row: Int, col: Int) = row * DIM + col

fun printField(field: Field): Unit {
    repeat(DIM) { row ->
        repeat(DIM) { col ->
            print("${field[ix(row, col)]} ")
        }
        println()
    }
}

enum class GameState {
    IN_PROGRESS, CROSS_WIN, NOUGHT_WIN, DRAW, ILLEGAL
}

enum class Player {
    CROSS, NOUGHT
}



//fun gameState(field: Field): GameState
val Field.gameState: GameState get() {
    // 0 1 2
    // 3 4 5
    // 6 7 8
    val lines = arrayOf(
        arrayOf(0, 1, 2),
        arrayOf(3, 4, 5),
        arrayOf(6, 7, 8),
        arrayOf(0, 3, 6),
        arrayOf(1, 4, 7),
        arrayOf(2, 5, 8),
        arrayOf(0, 4, 8),
        arrayOf(2, 4, 6),
    )
    val nX = this.count { it == 'X' }
    val n0 = this.count { it == '0' }
    if ((nX == n0 || nX == n0 + 1).not()) {
        return ILLEGAL
    }
    if (nX + n0 == DIM * DIM) return DRAW
    for (line in lines) {
        when {
            line.all { this[it] == 'X' } -> return CROSS_WIN
            line.all { this[it] == '0' } -> return NOUGHT_WIN
        }
    }
    return IN_PROGRESS
}

val Field.nextPlayer: Player get() {

    val nX = this.count {it == 'X'}
    val n0 = this.count {it == '0'}

    if (nX == 0 || nX == n0) {
        return Player.CROSS
    }
    else {
        return Player.NOUGHT
    }

}

val Field.click(row: Int, column: Int): Field get {

    val next = this.toField().nextPlayer
    this[ix(row, column)] = next == Player.NOUGHT ? '0' : 'X'

    return this

}

fun main() {
    printField(data)
//    println(gameState(data))
    println(data.gameState)
    println("XXXXXXXXX".toField().gameState)
    println("XXX_0_00_".toField().gameState)
    println("000_X_XX_".toField().gameState)
    println("X________".toField().nextPlayer) // > NOUGHT
    println("X0_______".toField().nextPlayer) // > CROSS
    println("X0_______".toField().click(0, 2).toList() == "X0X______".toField().toList())
    printField("_________".toCharArray())
}