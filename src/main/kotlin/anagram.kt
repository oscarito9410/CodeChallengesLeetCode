fun isAnagram(word: String, secondWord: String): Boolean {
    if (word.length != secondWord.length)
        return false
    val sortedWord = word.toCharArray().sorted()
    val sortedSecondWord = secondWord.toCharArray().sorted()
    return sortedWord == sortedSecondWord
}

fun main() {
    println(isAnagram("listen", "silent")) // Output: true
    println(isAnagram("hello", "world")) // Output: false
    println(isAnagram("iceman", "cinema")) // Output: true
    println(isAnagram("restful", "fluster")) // Output: true
    println(isAnagram("abc", "cba")) // Output: true
    println(isAnagram("rat", "car"))
}