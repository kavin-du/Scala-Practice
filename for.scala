object Demo {

    def main(args: Array[String]): Unit = {

        val names = List("adam", "david", "frank")
        val cNames = for(name <- names) yield(name.capitalize) // only first letter

        println(cNames)

        val namesUnderscore = List("_adam", "_david", "_frank")

        val capNames = for(name <- namesUnderscore) yield name.drop(1).capitalize
        println(capNames)
    }
}