
object Demo {

    def f(arr: List[Int]): List[Int] = arr match {
        case Nil => Nil
        case h :: t => h.abs :: f(t)
    }

    def main(args: Array[String]) = {
        val arr: List[Int] = -1::2::3::4::5::Nil

        println(f(arr))
    }
}