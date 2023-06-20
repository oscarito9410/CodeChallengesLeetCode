/**
 * Write a function in Kotlin called findPairs that takes in an array of integers and a target sum. The function should find and return all pairs of numbers from the array that add up to the target sum.

For example, given the input array [2, 4, 3, 5, 6, -2, 4, 7, 8, 9] and the target sum of 7, the function should return a list of pairs: [(2, 5), (4, 3), (6, 1), (-2, 9)].
 */

fun findPairs(array: IntArray, targetSum: Int): List<Pair<Int, Int>> {
    val pairs = mutableSetOf<Pair<Int, Int>>()

    for (num in array) {
        val complement = targetSum - num
        val rest = targetSum - complement
        if (complement > 0
            && array.contains(rest)
            && pairs.any {
                it.second == rest
                        && it.first == complement
            }.not()
        ) {
            pairs.add(Pair(rest, complement))
        }
    }
    return pairs.toList()
}

fun main() {
    // Test case
    val array = intArrayOf(2, 4, 3, 5, 6, -2, 4, 7, 8, 9)
    val targetSum = 7

    val pairs = findPairs(array, targetSum)
    println("Pairs that add up to $targetSum:")
    for (pair in pairs) {
        println("${pair.first}, ${pair.second}")
    }
}