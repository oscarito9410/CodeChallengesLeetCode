fun fibonacci(number: Int): Int {
    if (number < 2) {
        return number
    }
    return fibonacci(number - 1) + fibonacci(number -2)
}

fun main() {
    println(fibonacci(0)) // Output: 0
    println(fibonacci(1)) // Output: 1
    println(fibonacci(2)) // Output: 1
    println(fibonacci(3)) // Output: 2
    println(fibonacci(4)) // Output: 3
    println(fibonacci(5)) // Output: 5
    println(fibonacci(10)) // Output: 55
}