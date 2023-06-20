fun isValidParentesis(s: String): Boolean {
    val stack = mutableListOf<Char>()
    val opening: HashMap<Char, Char> = hashMapOf(
        '(' to ')', '[' to ']', '{' to '}'
    )
    s.forEach { letter ->
        if (opening.contains(letter)) {
            stack.add(letter)
        } else  {
            if (stack.isEmpty()) {
                return false
            }
            val last = opening.getOrDefault(stack.last(), "#")
            if (letter == last) {
                stack.removeAt(stack.lastIndex)
            } else {
                return false
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    print(isValidParentesis("()[]{}")) // expected true
}