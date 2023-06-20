
fun findLongestSubstring(input: String): Int {
    var maxLength = 0
    var start = 0
    val visited = mutableMapOf<Char, Int>()
    input.forEachIndexed { index, item ->
        if (visited.containsKey(item)) {
            val previousIndex = visited.getOrDefault(item, 0) + 1
            start = maxOf(start, previousIndex)
        }
        visited[item] = index
        maxLength = maxOf(maxLength, index - start + 1)
    }
    return maxLength
}

fun main() {
    // Test cases
    val testCases = listOf(
        "abcabcbb",
        "pwwkew",
        // Add more test cases here
    )

    for (testCase in testCases) {
        val longestSubstringLength = findLongestSubstring(testCase)
        println("Input: $testCase")
        println("Longest Substring Length: $longestSubstringLength")
        println()
    }
}