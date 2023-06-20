fun checkParentheses(input: String): Boolean {
    val open = '('
    val close = ')'
    val stack = mutableListOf<Char>()
    input.forEach {
        when (it) {
            open -> stack.add(open)
            close -> {
                if (it.isWhitespace() || it.toString().isEmpty() && stack.last() != open) {
                    return false
                }
                stack.removeAt(stack.lastIndex)
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    // Test cases
    val testCases = listOf(
        "((())())",
        "(()))(",
        // Add more test cases here
    )

    for (testCase in testCases) {
        val isBalanced = checkParentheses(testCase)
        println("Input: $testCase")
        println("Parentheses Balanced: $isBalanced")
        println()
    }
}