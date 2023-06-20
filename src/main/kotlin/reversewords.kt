fun reverseWords(str: String): String {
    if (str.isEmpty()) {
        return ""
    }
    val splitWords = str.trim().split(" ")
    val builder = StringBuilder()
    for (i in splitWords.count() - 1 downTo 0) {
        builder.append(splitWords[i])
        builder.append(" ")
    }
    return builder.toString()
}

fun main() {
    println(reverseWords("Hello World"))           // Expected output: "World Hello"
    println(reverseWords("  The sky is blue  "))  // Expected output: "blue is sky The"
    println(reverseWords("OpenAI GPT-3"))         // Expected output: "GPT-3 OpenAI"
}

