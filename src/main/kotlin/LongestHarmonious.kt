/**
 * Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
 */

/**
 * Create a HashMap to store the frequency of each number.
Initialize a variable maxLen to 0, which will hold the length of the longest harmonious subsequence.
Iterate over the array:
Update the frequency count in the HashMap.
Check if the HashMap contains the number plus 1 or the number minus 1.
If either of them is present, update maxLen to the maximum of its current value and the sum of the frequencies of the two numbers.
Return maxLen as the result.
 */
fun findLHS(nums: IntArray): Int {
    if (nums.isEmpty() || nums.toSet().size == 1) {
        return 0
    }
    var max = nums[0]
    val frequency = mutableMapOf<Int, Int>()
    nums.forEach {
        frequency[it] = frequency.getOrDefault(it, 0) + 1
    }
    frequency.keys.forEach {
        if (frequency.containsKey(it + 1)) {
            println("max is $max")
            max = maxOf(max, frequency[it]!! + frequency[it + 1]!!)
        }
    }
    return max
}

fun main() {
    // subsequence is [3,2,2,2,3].
    println(findLHS(intArrayOf(1,1,1,1,1)))
}