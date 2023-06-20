fun findLonely(nums: IntArray): List<Int> {
    val lonelyNumbers = mutableListOf<Int>()
    val frequencyMap = mutableMapOf<Int, Int>()
    nums.forEach {
        frequencyMap[it] = frequencyMap.getOrDefault(it, 0) + 1
    }
    nums.forEachIndexed { _, it ->
        val before = it - 1
        val after = it + 1
        if (frequencyMap[it] == 1) {
            val isLonely = !(frequencyMap.containsKey(before)
                    || frequencyMap.containsKey(after))
            if (isLonely) {
                lonelyNumbers.add(it)
            }
        }
    }
    return lonelyNumbers
}

fun main() {
    println(findLonely(intArrayOf(1, 3, 5, 3)))
}