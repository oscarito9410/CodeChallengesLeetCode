fun IntArray.median(): Double = (this.sum() / this.size).toDouble()

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val merged = nums1 + nums2
    merged.sort()
    return merged.median()
}

fun main() {

}