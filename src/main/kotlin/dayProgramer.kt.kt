fun Int.isLeapYear(): Boolean = this % 400 == 0 || (this % 4 == 0 && this % 100 != 0)

fun dayOfProgrammer(year: Int): String {
    if (year in 1700..2700) {
        val day = if (year.isLeapYear()) {
            12
        } else {
            13
        }
        return "$day.09.$year"
    }
    return "Invalid year"
}

fun main() {
    println(dayOfProgrammer(2017)) // Output: "13.09.2017"
    println(dayOfProgrammer(2016)) // Output: "12.09.2016"
    println(dayOfProgrammer(2701)) // Output: "Invalid year"
}