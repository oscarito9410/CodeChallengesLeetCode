fun findCommonElements(list1: List<Int>, list2: List<Int>): List<Int> = list1.intersect(list2).toList()

fun findCommonElementsV2(list1: List<Int>, list2: List<Int>): List<Int> {
    val commonElements = mutableSetOf<Int>()
    list1.forEach {
        if (list2.contains(it)) {
            commonElements.add(it)
        }
    }
    return commonElements.toList()
}


fun main() {
    // Test cases
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)

    val commonElements = findCommonElementsV2(list1, list2)
    println("Common Elements: $commonElements")
}