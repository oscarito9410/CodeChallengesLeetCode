fun pangrams(s: String): String {
    val alphabet = ('a'..'z').toList()
    val wordArray = s.map { it.toLowerCase() }.filter { !it.isWhitespace() }.toCharArray()
    val diff = alphabet.subtract(wordArray.asIterable())
    return if (diff.isEmpty()) {
        "pangram"
    } else {
        "not pangram"
    }
}

fun main(args: Array<String>) {
    println(pangrams("We promptly judged antique ivory buckles for the next prize    \n"))
    println(pangrams("We promptly judged antique ivory buckles for the prize    \n"))
}