object Demo {
    import PrinterPool._

    def main(args: Array[String]): Unit = {
        val book = Book("Harry Potter", "234NDSK-F322")
        book.print()
    }
}

case class Book(name: String, isbn: String) 

object PrinterPool {
    // implicit convertion when class in scope
    implicit class Printer(book: Book) {
        def print(): Unit = {
            println("===================")
            println(s"Book name: ${book.name}")
            println(s"Book ISBN: ${book.isbn}")
            println("===================")
        }
    }
}