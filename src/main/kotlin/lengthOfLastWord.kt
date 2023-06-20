fun lengthOfLastWord(s: String): Int {
    val item = s.split(" ").last { it.isNotBlank() }
    return item.length
}

fun main() {
    println(lengthOfLastWord("   fly me   to   the moon  "))
}