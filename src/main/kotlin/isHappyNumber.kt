fun isHappy(n: Int): Boolean = when (val sum = if (n == 1) n else calculateSum(n)) {
    1 -> true
    4 -> false
    else -> isHappy(sum)
}

private fun calculateSum(n: Int): Int = n.toString().toList().map { Character.getNumericValue(it) }.sumBy { it * it }


fun main() {
    print(isHappy(5))
}