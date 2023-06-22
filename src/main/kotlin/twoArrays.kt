fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    if (A.isEmpty() || B.isEmpty()) {
        return "NO"
    }
    val size = A.size
    val sortedA = A.sortedArray()
    val sortedB = B.sortedArrayDescending()

    for (i in 0 until size) {
        if (sortedA[i] + sortedB[i] < k) {
            return "NO"
        }
    }
    return "YES"
}