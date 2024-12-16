package com.softserve.academy.tictactoe

import com.softserve.academy.tictactoe.model.GameState
import com.softserve.academy.tictactoe.model.Player
import com.softserve.academy.tictactoe.model.gameState
import com.softserve.academy.tictactoe.model.nextPlayer
import com.softserve.academy.tictactoe.model.toField
import org.junit.Test
import org.junit.Assert.*

class CliTest {
    @Test
    fun `test gameState correctly estimate Illegal state`() {
        // Arrange
        val field = "XXXXXXXXX".toField()
        val expected = GameState.ILLEGAL
        // Act
        val res = field.gameState
        // Assert
        assertSame(expected, res)
    }

    @Test
    fun `when there is a single cross on the field then next player should be nought`() {
//        println("X________".toField().nextPlayer)
        val field = "X________".toField()

        val res = field.nextPlayer

        assertEquals(Player.NOUGHT, res)
    }
}