package com.test.task

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun `case from example`() {
        val input = arrayOf(100, 200, 100, 300, 200, 500)
        val output = findTwoElementsThatAppearOnlyOnce(input)

        val expected = arrayOf(300, 500)
        Assertions.assertArrayEquals(expected, output.sortedArray())
    }

    @Test
    fun `only one not duplicated number leads to a zero in a result`() {
        val input = arrayOf(100, 200, 100, 300, 200)
        val output = findTwoElementsThatAppearOnlyOnce(input)

        val expected = arrayOf(0, 300)
        Assertions.assertArrayEquals(expected, output.sortedArray())
    }

    @Test
    fun `more than two duplicated number leads to a mess`() {
        val input = arrayOf(100, 200, 100, 300, 200, 500, 600)
        val output = findTwoElementsThatAppearOnlyOnce(input)

        val expected = arrayOf(500, 884)
        Assertions.assertArrayEquals(expected, output.sortedArray())
    }
}