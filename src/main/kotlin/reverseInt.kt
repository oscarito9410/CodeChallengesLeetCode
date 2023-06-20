/**
 * Reverse = 0

WHILE(Number > 0)THEN
Reminder = Number %10
Reverse = (Reverse *10) + Reminder
Number = Number // 10
END WHILE
 */


fun Int.reverseNumber(): Int {
    var number = kotlin.math.abs(this)
    val isNegative = this < 0
    var reminder: Int
    var reverse = 0
    while (number > 0) {
        reminder = number % 10
        reverse = (reverse * 10) + reminder
        number /= 10
    }
    return if (isNegative) -reverse else reverse
}


fun reverse(number: Int): Int = number.reverseNumber()

fun main() {
    val x = 12345
    val result = reverse(x)
    println(result) // Output: 54321
}