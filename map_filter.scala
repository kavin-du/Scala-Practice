object Demo  {
    def main(args: Array[String]): Unit = {
      
        val intList = List(5, 6, 7, 8)
        val chars = Seq('a', 'b', 'c', 'd')

        def f(x: Int): String = if(x%2 == 0) "Even" else "Odd"

        def multiplyByTwo = (x: Int) => x * 2;

        println(intList.map(multiplyByTwo))
        println(intList.map(f))
        println(chars.map(ch => List(ch.toUpper, ch)))

        println("================")

        def isEven = (x: Int) => x % 2 == 0

        println(chars.filter(_.isUpper)) 
        println(chars.filterNot(_.isUpper))
        println(intList.filter(isEven)) // cannot call filter(isUpper)

    }
}