val hm: HashMap<String, List<Char>> =
    hashMapOf(
        "2" to listOf('a','b','c'),
        "3" to listOf('d','e','f'),
        "4" to listOf('g','h','i'),
        "5" to listOf('j','k','l'),
        "6" to listOf('m','n','o'),
        "7" to listOf('p','q','r','s'),
        "8" to listOf('t','u','v'),
        "9" to listOf('w','x','y','z')
    )

fun letterCombinations(digits: String): List<String> {
    var results = mutableListOf<String>()
    for (digit: Char in digits) {
        if (results.isEmpty()) {
            val nextDigits: List<Char> = hm.get(digit.toString())!!
            nextDigits.forEach {
                results.add(it.toString())
            }
        } else {
            val newResults = mutableListOf<String>()
            for (result in results) {
                val nextDigits: List<Char> = hm.get(digit.toString())!!
                for (nextDigit in nextDigits) {
                    println(result.plus(nextDigit))
                    newResults.add(result.plus(nextDigit))
                }
            }
            results = newResults
        }
    }

    return results
}

fun main() {
    print(letterCombinations("234"))
}