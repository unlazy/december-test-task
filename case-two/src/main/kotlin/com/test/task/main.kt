package com.test.task

import java.util.Stack


fun removeDuplicateLetters(incomingString: String): String {
    val processedLetters = IntArray(26)
    val incomingChars = incomingString.toCharArray()
    incomingChars.forEach { processedLetters[it - 'a']++ }

    val visitedLetters = BooleanArray(26)
    val resultStack = Stack<Char>()
    var index: Int
    for (c in incomingChars) {
        index = c - 'a'
        processedLetters[index]--

        if (visitedLetters[index]) continue

        while (!resultStack.isEmpty() && c < resultStack.peek() && processedLetters[resultStack.peek() - 'a'] != 0) {
            val top = resultStack.pop()
            visitedLetters[top - 'a'] = false
        }

        visitedLetters[index] = true
        resultStack.push(c)
    }

    return buildString {
        while (!resultStack.isEmpty()) {
            this.insert(0, resultStack.pop())
        }
    }
}
