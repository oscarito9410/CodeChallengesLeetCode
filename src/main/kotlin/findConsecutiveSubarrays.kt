fun findConsecutiveSubarrays(array: IntArray): List<List<Int>> {
    val nodes = mutableListOf<MutableList<Int>>()
    var node = mutableListOf<Int>()
    array.forEachIndexed { index, i ->
        val next = if (index + 1 < array.size) array[index + 1] else {
            array[index]
        }
        val complement = i + 1
        node.add(i)
        if (next != complement) {
            nodes.add(node)
            node = mutableListOf()
        }
    }
    return nodes
}

fun main() {
    // Test case
    val array = intArrayOf(1, 2, 3, 5, 6, 8, 9)
    val result = findConsecutiveSubarrays(array)

    println("Consecutive Subarrays:")
    for (subarray in result) {
        println(subarray)
    }
}