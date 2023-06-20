fun validateParentheses(str: String): Boolean {
    val stack = mutableListOf<Char>()
    val open = '('
    val close = ')'
    for (char in str) {
        when (char) {
            open -> stack.add(char)
            close -> {
                if (stack.isEmpty() || stack.last() != open) {
                    return false
                }
                stack.removeAt(stack.lastIndex)
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    println(validateParentheses("((()))"))                // Expected output: true
    println(validateParentheses("((())())"))              // Expected output: true
    println(validateParentheses("((())"))                 // Expected output: false
    println(validateParentheses("())("))                  // Expected output: false
    println(validateParentheses("Hello (World)"))         // Expected output: true
    println(validateParentheses("(Hello (World)"))        // Expected output: false
}