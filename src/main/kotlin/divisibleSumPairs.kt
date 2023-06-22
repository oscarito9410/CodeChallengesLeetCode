fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var pairs = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            if (i < j) {
                val sum = ar[i] + ar[j]
                if (sum % k == 0) {
                    pairs++
                }
            }
        }
    }
    return pairs
}

fun main() {
    val array = arrayOf(1, 3, 2, 6, 1, 2)
    println(divisibleSumPairs(array.size, 3, array))
}