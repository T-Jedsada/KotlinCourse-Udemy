package oo

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(open val title: String,
                             open val genre: String,
                             open var publicationYear: Int,
                             open var borrowed: Boolean) : Lendable {
    override fun borrow() = when (borrowed) {
        true -> println("This item is already borrowed.")
        else -> borrowed = true
    }
}

class LibraryBook(override var title: String,
                  override var genre: String,
                  override var publicationYear: Int,
                  val author: String) : InventoryItem(title, genre, publicationYear, true) {

    fun read() = println("Reading a book by $author...")
}

class LibraryDVD(override var title: String,
                 override var genre: String,
                 override var publicationYear: Int,
                 val length: Int) : InventoryItem(title, genre, publicationYear, false) {
    fun watch() = println("Watching $title...")
}

fun main(args: Array<String>) {
    val book = LibraryBook("Kotlin", "drama", 2012, "Jack")
    book.read()
    book.borrow()

    val dvd = LibraryDVD("Vampire", "Music", 2016, 999)
    dvd.watch()
    dvd.borrow()
}