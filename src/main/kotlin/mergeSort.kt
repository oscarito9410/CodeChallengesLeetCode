fun mergeSort(arr: IntArray): IntArray {
    if (arr.size <= 1) {
        return arr
    }
    val middle = arr.size / 2
    val left = arr.toList().subList(0, middle)
    val right = arr.toList().subList(middle, arr.size)
    return merge(
        mergeSort(left.toIntArray()).toList(),
        mergeSort(right.toIntArray()).toList()
    ).toIntArray()
}

fun merge(left: List<Int>, right: List<Int>): List<Int> {
    var indexLeft = 0
    var indexRight = 0
    val newList: MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
    return newList
}

fun main() {
    val arr = intArrayOf(4, 2, 9, 1, 7)
    val sortedArr = mergeSort(arr)
    println(sortedArr.contentToString()) // Output: [1, 2, 4, 7, 9]
}