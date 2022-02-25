object Demo {

    // replicate the list items n times keeping the order
    // List(1, 2, 3, 4) ==> List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4)

    def f(num: Int, arr: List[Int]): List[Int] = {
        arr.flatMap(x => List.fill(num)(x))
    }

    def main(args: Array[String]): Unit = {
        val items = List.range(1, 4)
        // println(items)
        println(f(3, items))
    }
}