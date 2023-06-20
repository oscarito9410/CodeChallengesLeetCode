fun findFirstOccurrence(array: IntArray, target: Int): Int = array.binarySearchImpl(target)

fun IntArray.binarySearchImpl(target: Int): Int {
    var low = 0
    var high = size-1
    var middle:Int
    while (low <= high) {
        middle = low + ((high - low) / 2)
        when {
            target > this[middle] -> low = middle + 1 // element is greater than middle element of array, so it will be in right half of array
            target == this[middle] -> return middle
            target < this[middle] -> high = middle - 1
        }
    }
    return -1
}

fun main() {
    // Test case
    val array = intArrayOf(1, 2, 2, 3, 4, 4, 4, 5, 6)
    val target = 4
    val result = findFirstOccurrence(array, target)

    if (result != -1) {
        println("The first occurrence of $target is at index $result.")
    } else {
        println("The target $target is not found in the array.")
    }
}