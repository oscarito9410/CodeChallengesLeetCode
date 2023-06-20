import kotlin.math.floor

/**
 * The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
 */
fun percentageLetter(s: String, letter: Char): Int {
    val sizeString = s.length
    val totalLetters = s.count { it == letter }
    return floor((totalLetters / sizeString.toDouble()) * 100).toInt()
}

fun main() {
    println(percentageLetter("sgawtb", 's'))
}