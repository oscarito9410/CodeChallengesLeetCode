
fun longestPalindromeV2(s: String): String {
    val letters = mutableSetOf<Char>()
    var pairsCounter = 0
    s.forEach { ch ->
        if (!letters.add(ch)) {
            // adding a letter returns false -> letter is already in set
            // increment counter and remove it (free up "space")
            pairsCounter++
        }
    }
    return letters.toString()
}

fun longestPalindrome(s: String): Int {
    val letters = mutableSetOf<Char>()
    var pairsCounter = 0
    s.forEach { ch ->
        if (!letters.add(ch)) {
            // adding a letter returns false -> letter is already in set
            // increment counter and remove it (free up "space")
            pairsCounter++
            letters.remove(ch)
        }
    }
    return pairsCounter * 2 + letters.isEmpty().let {
        // if empty then it means all letters are "paired"
        if (it) 0 else 1
    }
}

fun main() {
    // Test cases
    val input1 = "abccccdd"
    println("Input: $input1")
    println("Output: ${longestPalindromeV2(input1)}")

}