/**
 * In the context of finding the unique element in an array, the XOR operation can be used to cancel out the duplicate elements. By XORing all the elements in the array, the pairs of duplicate elements will result in 0, and the XOR of the unique element with 0 will yield the unique element itself.
 */

fun lonelyinteger2(a: Array<Int>): Int {
    // Write your code here
    var result = 0
    for(number in a) {
        result = result xor number
    }
    return result
}

fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    val mapOfItems = mutableMapOf<Int, Int>()
    a.forEach {
        if (mapOfItems.containsKey(it)) {
            mapOfItems[it] = mapOfItems[it]?.plus(1) ?: 0
        } else {
            mapOfItems[it] = 1
        }
    }
    return mapOfItems.filter { it.value == 1 }.map { it.value }.firstOrNull() ?: 1
}

fun main(args: Array<String>) {
    println("Hello World!")
}