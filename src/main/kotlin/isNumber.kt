fun isNumber(s: String): Boolean {
    val digits = s.trim()
    val firstIndexIsValid = digits[0].isDigit() || digits[0] == '-' ||
            digits[0] == '+' || (digits[0] == '.' && digits.length > 1 && digits[1].isDigit())
    var isValid = true
    if (digits.any { it.isLetter() && it != 'e' })
        return false
    for (current in digits.indices) {
        for (next in current + 1 until digits.length) {
            isValid = digits[current].isDigit() || digits[next].isDigit()
                    || (digits[next] == 'e' && digits.length > next && digits[next + 1].isDigit()) || digits[next] == '+'
                    || (digits[current].isDigit() && digits[next] == '.')
        }
    }
    return isValid && firstIndexIsValid
}


fun main() {
    println(isNumber("0e"))
}