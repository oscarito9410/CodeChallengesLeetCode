/**
 * Write a function called findMissingNumber that takes in an array of integers and returns the missing number in the range from 1 to n, where n is the length of the array. The array will contain n-1 unique integers in random order.

For example, given the input: [1, 3, 4, 2, 6]

The output should be: 5

Your task is to implement the findMissingNumber function. You can assume that the input array will always have at least one element, and it will contain distinct positive integers from 1 to n, except for one missing number.

Take your time to think about the problem and come up with a solution. Once you're ready, feel free to share your implementation, and I'll be glad to provide feedback and guidance if needed.
 */

fun findMissingNumber(numbers: IntArray): Int {
    if(numbers.size == 1) {
        return 0
    }
    val sequenceNumbers = IntArray(numbers.size + 1) { it + 1 }
    return sequenceNumbers.subtract(numbers.asIterable()).firstOrNull() ?: 1
}


fun main() {
    val numbers1 = intArrayOf(1, 3, 4, 2, 6)
    val missingNumber1 = findMissingNumber(numbers1)
    println("Missing number: $missingNumber1") // Expected output: 5

    val numbers2 = intArrayOf(2, 3, 1, 5)
    val missingNumber2 = findMissingNumber(numbers2)
    println("Missing number: $missingNumber2") // Expected output: 4

    // Add more test cases as needed
}