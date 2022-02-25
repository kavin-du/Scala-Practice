
object Demo {

    def f(arr: List[Int]): Int = arr match {
        case Nil => 0
        case h :: t => h match {
            case h if h.abs % 2 == 1 => h + f(t)
            case _ => f(t)
        } 
    }

    def main(args: Array[String]) = {
        val arr: List[Int] = -1::2::3::4::5::Nil

        println(f(arr))
    }
}