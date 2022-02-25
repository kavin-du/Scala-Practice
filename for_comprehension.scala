object Demo {
    def main(args: Array[String]) = {
        val arr: List[Int] = List(23,24,15,45)

        val result = for(n <- arr) yield n*50

        println(result)
    }
}