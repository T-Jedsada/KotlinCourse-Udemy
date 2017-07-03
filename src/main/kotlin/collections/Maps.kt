package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(
            "John" to 23,
            "Jack" to 22,
            "Kotlin" to 5
    )
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)
    namesToAges.forEach { println("${it.key} is ${it.value} years old.") }

    val countryToInhabitants = mutableMapOf(
            "Germany" to 80_000_000,
            "Thailand" to 60_000_000,
            "Korea" to 12_000_000
    )

    countryToInhabitants.put("Australia", 23_000_000)
    countryToInhabitants.putIfAbsent("Korea", 300_000_000)

    println(countryToInhabitants)
    println(countryToInhabitants.contains("Korea"))
    println(countryToInhabitants.containsKey("USA"))
    println(countryToInhabitants.containsValue(5))

    println(countryToInhabitants["Korea"])
    println(countryToInhabitants.getOrDefault("USA", 0))
}