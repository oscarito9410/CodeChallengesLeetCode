fun twoSum(nums: IntArray, target: Int): IntArray {
    val result: IntArray = intArrayOf(0)
    for (i in 0 until nums.size -1) {
        for( j in i + 1  until nums.size) {
            val sum = nums[i] + nums[j]
            if (sum == target) {
                return intArrayOf(j, i).sorted().toIntArray()
            }
        }
    }
    return result
}

fun main() {
    println(twoSum(intArrayOf(3,2,4), target = 6).joinToString(","))
}