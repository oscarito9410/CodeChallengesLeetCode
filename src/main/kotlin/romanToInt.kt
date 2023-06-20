import java.lang.StringBuilder

val mapOfNumbers = mapOf(
    1000 to "M",
    900 to "CM",
    500 to "D",
    400 to "CD",
    100 to "C",
    90 to "XC",
    50 to "L",
    40 to "XL",
    10 to "X",
    9 to "IX",
    5 to "V",
    4 to "IV",
    1 to "I"
)

fun romanToInt(s: String): Int = if (mapOfNumbers.containsValue(s)) {
    mapOfNumbers.filterValues { it == s }.keys.first()
} else {
    var value = 0
    val digit = StringBuilder(s)
    mapOfNumbers.forEach { item ->
        while (digit.startsWith(item.value)) {
            value += item.key
            digit.delete(
                digit.indexOf(item.value),
                item.value.length
            )
        }
    }
    value
}

fun main() {
    /**
     * M = 1000, CM = 900, XC = 90 and IV = 4
     */
    println(romanToInt("LVIII"))
}