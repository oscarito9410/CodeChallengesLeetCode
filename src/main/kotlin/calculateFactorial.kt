fun calculateFactorial(n: Int): Long = if (n == 0) {
    1
} else {
    n * calculateFactorial(n - 1)
}

fun main() {
    println(calculateFactorial(0))  // Expected output: 1
    println(calculateFactorial(5))  // Expected output: 120
    println(calculateFactorial(10)) // Expected output: 3628800
}