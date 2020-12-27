package com.test.task

fun findTwoElementsThatAppearOnlyOnce(input: Array<Int>): Array<Int> {
    var temp = 0
    input.forEach { temp = temp.xor(it) }
    val diff = (temp.and(temp - 1)).xor(temp)
    var first = 0
    var second = 0
    input.forEach {
        if (diff.and(it) == 0) {
            first = first.xor(it)
        } else {
            second = second.xor(it)
        }
    }
    return arrayOf(first, second)
}