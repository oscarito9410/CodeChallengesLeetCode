/**
 * Initialize two variables, maxSum and currentSum, to track the maximum sum found so far and the current sum of the subarray, respectively. Set both variables to the value of the first element in the array.
Iterate through the array starting from the second element.
For each element, update the currentSum by taking the maximum value between the current element and the sum of the current element and the previous currentSum.
Update the maxSum by taking the maximum value between the current maxSum and the current currentSum.
Repeat steps 3 and 4 for all elements in the array.
 */

fun maxSubArraySum(array: IntArray): Int {
    var current = array[0]
    var max = array[0]
    val newArray = array.sliceArray(IntRange(1, array.size - 1))
    for (i in newArray.indices) {
        current = maxOf(newArray[i], current + newArray[i])
        max = maxOf(max, current)
    }
    return max
}

fun main() {
    // Test cases
    val array1 = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val result1 = maxSubArraySum(array1)
    println("Maximum subarray sum for array1: $result1") // Expected output: 6

    val array2 = intArrayOf(-1, -2, -3, -4)
    val result2 = maxSubArraySum(array2)
    println("Maximum subarray sum for array2: $result2") // Expected output: -1

    val array3 = intArrayOf(1, 2, 3, 4, 5)
    val result3 = maxSubArraySum(array3)
    println("Maximum subarray sum for array3: $result3") // Expected output: 15
}