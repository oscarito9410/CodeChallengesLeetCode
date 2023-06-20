import java.math.BigInteger

fun myAtoi(s: String): Int {
    var str = s.trim()
    return when {
        str.isEmpty() -> 0
        str.length in 0..200 -> {
            val isNegative = str[0] == '-'
            if (str[0] == '-' || str[0] == '+') {
                str = str.substring(1)
            }
            var finalDigit = ""
            for (it in str) {
                if (it.isDigit()) {
                    finalDigit += it
                }
                if (!it.isDigit() || it.isWhitespace()) {
                    break
                }
            }
            when {
                finalDigit.isEmpty() -> 0
                isNegative -> finalDigit.safeToInt(isNegative)
                else -> finalDigit.safeToInt(isNegative)
            }
        }
        else -> {
            0
        }
    }
}

fun String.safeToInt(isNegative: Boolean): Int {
    val number = if (isNegative) this.toBigInteger().negate() else this.toBigInteger()
    return when {
        number > BigInteger.valueOf(Int.MAX_VALUE.toLong()) -> Int.MAX_VALUE
        number < BigInteger.valueOf(Int.MIN_VALUE.toLong()) -> Int.MIN_VALUE
        else -> number.toInt()
    }
}

fun main() {
    println(
        myAtoi(
            "20000000000000000000"
        )
    )
}