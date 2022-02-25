object Demo {
    def main(args: Array[String]): Unit = {
        val langs = List("Sinhala", "English", "Mandarine")

        println(langs.map(item => item.toUpperCase))
        println(langs.map(item => item.length))

        // shorhand notation
        println(langs.map(_.toUpperCase))
        println(langs.map(_.length))




        println(langs.flatMap(_.toLowerCase))
        // gives error -> result should be also iterable
        // println(langs.flatMap(_.length)) 
        
        val nums = List(2, 4, 6, 8, 10)
        println(nums.flatMap(e => List(e, e*2)))
        // println(nums.flatMap(e => e*2)) // error, result is not iterable

    }
}