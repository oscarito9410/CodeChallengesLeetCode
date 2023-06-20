/**
 *
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
 */

fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    val mapOfLetters = mutableMapOf<Char, Int>()
    letters.forEach {
        val compareResult = it.compareTo(target)
        if (compareResult >= 1) {
            mapOfLetters[it] = compareResult
        }
    }
    return if (mapOfLetters.isEmpty()) {
        letters.first()
    } else {
        mapOfLetters.entries.sortedBy { it.value }.first().key
    }
}

fun main() {
    print(
        nextGreatestLetter(
            charArrayOf('c', 'f', 'j'), 'a'
        )
    )

    print(
        nextGreatestLetter(
            charArrayOf('c', 'f', 'j'),
            'd'
        )
    )
}