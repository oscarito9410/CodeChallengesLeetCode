fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var num = x
    var remainder: Int
    var reverseNumber = 0
    while (num != 0) {
        remainder = num % 10
        reverseNumber = reverseNumber * 10 + remainder
        num /= 10
    }
    return x == reverseNumber
}

fun main() {
print(isPalindrome(111))
}