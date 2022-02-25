object Solution extends App {

    def f(num:Int) : List[Int] = {
        val list = List.range(0, num)
        // print(list + "\n")
        return list
    }
    // val readInt = scala.io.StdIn.readInt()

    println(Array(f(10)))
}