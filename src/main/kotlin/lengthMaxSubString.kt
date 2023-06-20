
fun lengthOfLongestSubstring(s: String): Int {
    var start = 0
    var end = 0
    var max = 0
    val setOfCharacters = mutableSetOf<Char>()
    while (end < s.length) {
        if (setOfCharacters.contains(s[end])) {
            setOfCharacters.remove(s[start])
            start++
        } else {
            setOfCharacters.add(s[end])
            max = maxOf(max, end - start + 1)
            end++
        }
    }
    return max
}

fun main() {
    print(lengthOfLongestSubstring("pwwkew"))
}