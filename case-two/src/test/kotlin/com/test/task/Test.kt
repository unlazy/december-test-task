package com.test.task

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun `case 1`() {
        val input = "bcabc"
        val output = removeDuplicateLetters(input)
        val expected = "abc"

        Assertions.assertEquals(expected, output)
    }

    @Test
    fun `case 2`() {
        val input = "cbacdcbc"
        val output = removeDuplicateLetters(input)
        val expected = "acdb"

        Assertions.assertEquals(expected, output)
    }

    @Test
    fun `case 3`() {
        val input = "cdadabcc"
        val output = removeDuplicateLetters(input)
        val expected = "adbc"

        Assertions.assertEquals(expected, output)
    }

    @Test
    fun `case 4`() {
        val input = "ecbacba"
        val output = removeDuplicateLetters(input)
        val expected = "eacb"

        Assertions.assertEquals(expected, output)
    }
}