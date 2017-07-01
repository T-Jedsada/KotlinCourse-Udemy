package oo

class MyBook(val title: String, val author: String, val publicationYear: Int, val price: Double) {
    override fun toString(): String {
        return "MyBook[title=$title, author=$author, publicationYear=$publicationYear, price:$price]"
    }
}

data class MyBookData(val title: String, val author: String, val publicationYear: Int, val price: Double) {

    fun somethings(){
        println("What do you want?")
    }
}

fun main(args: Array<String>) {
    val myBook = MyBook("Kotlin", "John", 2015, 99.00)
    println(myBook)

    val myBook1 = MyBook("Kotlin", "John", 2015, 99.00)
    println(myBook == myBook1)

    val myBookData = MyBookData("Kotlin", "John", 2015, 99.00)
    println(myBookData)
    myBookData.somethings()

    val myBookData1 = MyBookData("Kotlin", "John", 2015, 99.00)
    println(myBookData == myBookData1)

    val myBookData2 = myBookData.copy(title = "JAVA", price = 89.99)
    println(myBookData2)

    val (title, author, publicationYear, price) = myBookData2
    println(title)
    println(author)
    println(publicationYear)
    println(price)

    val hasOf = hashSetOf(myBook, myBook1)
    println(hasOf)

    val map = mutableMapOf<Int, MyBookData>()
    map.put(1, myBookData)
    map.forEach { k, v -> println("$k -> $v") }

    // safe put
    map.putIfAbsent(2, myBookData2)
    println(map.containsKey(3))
    println(map.values.contains(myBookData2))
}