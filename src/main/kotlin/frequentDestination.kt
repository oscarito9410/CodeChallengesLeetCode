fun findMostFrequentDestination(tickets: List<String>): String {
    val mapOfTickets = tickets.map { it.substringBefore("-") }.groupBy { it }.mapValues {
        it.value.size
    }
    val max = mapOfTickets.maxOf { it.value }
    return mapOfTickets.filter { it.value == max }.keys.first()
}

fun main() {
    val tickets = listOf("JFK-LAX", "LAX-SFO", "SFO-JFK", "JFK-ORD", "ORD-JFK", "JFK-LAX")
    val mostFrequentDestination = findMostFrequentDestination(tickets)
    println(mostFrequentDestination) // Output: "JFK"
}