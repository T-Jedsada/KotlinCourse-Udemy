package oo

data class Book(var title: String? = null,
                var author: String? = null,
                var publicationYear: Int? = null,
                var borrow: Boolean? = null) {

    fun borrow() = when (borrow) {
        true -> {
            println("Sorry, the book is already borrowed.")
            false
        }
        else -> {
            borrow = true
            true
        }
    }

    fun returnBook() = when (borrow) {
        true -> {
            borrow = false
            true
        }
        else -> {
            println("The book was not borrowed so it cannot be returned.")
            false
        }
    }

    fun print() = println("Book [title=$title, author=$author, publicationYear=$publicationYear]")
}

fun main(args: Array<String>) {
    val book = Book("The One Thing", "Gary Keller", 2013, false)
    book.returnBook()   // Does not work because we did not borrow it yet.
    book.borrow()       // Let's borrow it.
    book.borrow()       // We cannot borrow again without returning.
    book.returnBook()   // Let's return it.
    book.print()        // And print it out.
}