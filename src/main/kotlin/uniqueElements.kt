fun uniqueElements(list: List<Int>): List<Int> {
    if (list.isEmpty()) {
        return emptyList()
    }
    val setNumbers = mutableSetOf<Int>()
    list.forEach {
        setNumbers.add(it)
    }
    return setNumbers.toList()
}

fun main() {

    val list1 = listOf(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)
    println(uniqueElements(list1)) // Output: [1, 2, 3, 4, 5]

    val list2 = listOf(5, 5, 5, 5, 5)
    println(uniqueElements(list2)) // Output: [5]

    val list3 = listOf(1, 2, 3, 4, 5)
    println(uniqueElements(list3)) // Output: [1, 2, 3, 4, 5]

    val list4 = emptyList<Int>()
    println(uniqueElements(list4)) // Output: []
}