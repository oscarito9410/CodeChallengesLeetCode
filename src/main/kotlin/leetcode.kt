fun removeDuplicates(nums: IntArray): Int {
    val mapOfItems = mutableMapOf<Int, Int>()
    for (num in nums) {
        mapOfItems[num] = mapOfItems.getOrDefault(num, 0) + 1
    }
    val exceededItems = mapOfItems.filter { it.value > 2 }
    var result = nums.size
    for (item in exceededItems) {
        var sizeToBeRemove = item.value - 2
        result -= sizeToBeRemove
        while (sizeToBeRemove > 0) {
            val selectedIndex = nums.indexOf(item.key)
            val newArray = nums.filterIndexed { index, _ ->  selectedIndex != index }.toIntArray()
            newArray.copyInto(nums)
            sizeToBeRemove--
        }
    }
    return result
}


fun main () {
    print(removeDuplicates(arrayOf(1,1,1,2,2,3).toIntArray()))
}