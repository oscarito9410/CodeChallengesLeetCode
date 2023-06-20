fun majorityElement(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }
    val mapOfElements = mutableMapOf<Int, Int>()
    var max = Int.MIN_VALUE
    var keyMax = Int.MIN_VALUE
    nums.forEach {
        mapOfElements[it] = mapOfElements.getOrDefault(it, 0) + 1
    }
    mapOfElements.forEach {
        if (it.value >= max) {
            max = it.value
            keyMax = it.key
        }
    }
    return keyMax
}