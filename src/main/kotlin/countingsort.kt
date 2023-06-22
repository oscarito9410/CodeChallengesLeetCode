fun countingSort(arr: Array<Int>): Array<Int> {
    // Write your code here
    val max = arr.maxOrNull() ?: 0
    val map = mutableMapOf<Int, Int>()
    val result = (0..max).toList().toTypedArray()
    arr.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }
    val aux = result.copyOf()
    map.forEach {
        val index = aux.indexOf(it.key)
        result[index] = it.value
    }
    return result
}

fun countingSortV2(arr: Array<Int>): Array<Int> {
    val max = arr.maxOrNull() ?: 0
    val counts = IntArray(max + 1)

    // Count the occurrences of each element
    arr.forEach { counts[it]++ }

    // Assign the counts to the result array
    val result = IntArray(arr.size)
    var currentIndex = 0
    counts.forEachIndexed { element, count ->
        repeat(count) {
            result[currentIndex] = element
            currentIndex++
        }
    }

    return result.toTypedArray()
}

fun main() {
    println(countingSortV2(arrayOf(1, 1, 3, 2, 1)).joinToString())
}