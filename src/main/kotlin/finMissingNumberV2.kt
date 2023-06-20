
fun findMissingNumberV2(numbers: IntArray): Int {
    val originalNumbersSum = numbers.sum() // 12
    val expectedNumbersSum = IntArray(numbers.size + 1) { it + 1 }.sum() // 15
    return expectedNumbersSum - originalNumbersSum
}

fun main() {
    val list1 = arrayOf(1, 2, 4, 5) // The missing number is 3
    println(findMissingNumberV2(list1.toIntArray())) // Output: 3

    val list2 = arrayOf(1, 3, 4, 5, 6) // The missing number is 2
    println(findMissingNumberV2(list2.toIntArray())) // Output: 2

    val list3 = arrayOf(2, 3, 4, 5) // The missing number is 1
    println(findMissingNumberV2(list3.toIntArray())) // Output: 1
}