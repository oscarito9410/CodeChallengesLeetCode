fun isPalindrome(str: String): Boolean {
    if (str.isEmpty()) {
        return false
    }
    return str.reversed() == str
}

fun isPalindromeV2(str: String): Boolean {
    if (str.isEmpty()) {
        return false
    }
    for ((index, reverseIndex) in (str.length - 1 downTo 0).withIndex()) {
        if (str[reverseIndex] != str[index]) {
            return false
        }
    }
    return true
}

fun isPalindromeV3(str: String): Boolean {
    if (str.isEmpty()) {
        return false
    }
    return (str.length - 1 downTo 0)
        .asSequence()
        .filterIndexed { index, reverseIndex -> str[reverseIndex] != str[index] }
        .none()
}

fun main() {
    println(isPalindromeV2("level"))                 // Expected output: true
    println(isPalindromeV2("radar"))                 // Expected output: true
    println(isPalindromeV2("hello"))                 // Expected output: false
    println(isPalindromeV2("A man, a plan, a canal: Panama"))  // Expected output: false
    println(isPalindromeV2("12321"))                 // Expected output: true
    println(isPalindromeV2("openAI"))                // Expected output: false
}