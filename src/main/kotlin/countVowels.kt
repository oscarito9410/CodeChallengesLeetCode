fun countVowels(word: String): Int {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    return word.count { char -> vowels.any { it == char } }
}

fun main() {
    println(countVowels("Hello")) // Output: 2
    println(countVowels("World")) // Output: 1
    println(countVowels("Kotlin")) // Output: 2
    println(countVowels("Programming")) // Output: 3
}