import java.lang.StringBuilder

/**
 *
 * I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */

fun intToRoman(num: Int): String {
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
    return if (mapOfNumbers.containsKey(num)) {
        mapOfNumbers[num].orEmpty()
    } else {
        var number = num
        val romanNumber = StringBuilder("")
        for ((value, symbol) in mapOfNumbers) {
            while (number >= value) {
                romanNumber.append(symbol)
                number -= value
            }
        }
        return romanNumber.toString()
    }
}

fun main() {
    println(intToRoman(58))
}