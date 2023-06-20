class NumArray(private val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        // edge cases
        return if (nums.size > left && right <= nums.size -1) {
            val range = nums.slice(IntRange(left, right))
            return range.sum()
        } else {
            0
        }
    }

}

/*
* Your NumArray object will be instantiated and called as such:
* var obj = NumArray(nums)
* var param_1 = obj.sumRange(left,right)
*/

fun main() {
    val nums = NumArray(intArrayOf(-2, 0, 3, -5, 2, -1))
    println(nums.sumRange(2, 5))
}


