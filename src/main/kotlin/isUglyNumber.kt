/**
 * function isUgly(number):
if number <= 0:
return False
while number % 2 == 0:
number = number / 2
while number % 3 == 0:
number = number / 3
while number % 5 == 0:
number = number / 5
return number == 1
 */

fun isUgly(n: Int): Boolean {
    if (n <= 0) {
        return false
    }
    var number = n
    val ranges = arrayOf(2, 3, 5)
    for (range in ranges.indices) {
        while (number % ranges[range] == 0) {
            number /= ranges[range]
        }
    }
    return number == 1
}

fun main() {
    println(isUgly(14))
}