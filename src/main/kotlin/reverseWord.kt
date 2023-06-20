import java.lang.StringBuilder

fun reverseWordsA(s: String): String {
    val words = s.split(" ").filter { it.isNotBlank() }
    val reverseWord = StringBuilder("")
    for (i in words.size - 1 downTo 0) {
        val word = words[i]
        reverseWord.append(word)
        if (i != 0) {
            reverseWord.append(" ")
        }
    }
    return reverseWord.toString()
}

fun main() {
    print(reverseWordsA("  hello world  "))
}