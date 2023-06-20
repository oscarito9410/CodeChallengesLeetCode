fun largestUniqueNumber(numbers: IntArray): Int {
    // case when not unique number

    val frequencyMap = mutableMapOf<Int, Int>()

    numbers.forEach {
        frequencyMap[it] = frequencyMap.getOrDefault(it, 0) + 1
    }

    val uniqueNumbers = numbers.filter { frequencyMap[it] == 1 }

    if (uniqueNumbers.isEmpty()) {
        return -1
    }

    return uniqueNumbers.reduce { first, second -> if (first > second) first else second }
}

fun main() {
    val numbers1 = intArrayOf(1, 3, 5, 2, 2, 5, 1, 6)
    println(largestUniqueNumber(numbers1)) // Output: 6

    val numbers2 = intArrayOf(1, 1, 1, 1, 1)
    println(largestUniqueNumber(numbers2)) // Output: -1

    val numbers3 = intArrayOf(5, 5, 5, 5, 5, 5, 5)
    println(largestUniqueNumber(numbers3)) // Output: -1

    val numbers4 = intArrayOf(3, 2, 1, 3, 2, 5)
    println(largestUniqueNumber(numbers4)) // Output: 5

    val numbers5 = intArrayOf(4, 4, 4, 4)
    println(largestUniqueNumber(numbers5)) // Output: -1

    val numbers6 = intArrayOf(2, 2, 3, 3, 4, 4, 5, 5)
    val largest6 = largestUniqueNumber(numbers6)
    println("The largest unique number is: $largest6") // Expected output: -1 (no unique numbers)

    val numbers7 = intArrayOf(5, 3, 3, 2, 2, 4, 4)
    val largest7 = largestUniqueNumber(numbers7)
    println("The largest unique number is: $largest7") // Expected output: 5 (5 is the largest unique number)
}



