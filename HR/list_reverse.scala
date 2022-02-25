import scala.annotation.tailrec

object Demo {

    // def f(list: List[Int]): List[Int] = list match {
    //     case Nil => Nil
    //     case head::tail => f(tail) :+ head

    // }

    
    // optimized version
    def f(list: List[Int]): List[Int] = {
        @tailrec
        def f_accumu(list: List[Int], acc: List[Int]): List[Int] = list match {
            case Nil => acc
            case head::tail => f_accumu(tail, head :: acc)
        }
        
        f_accumu(list, Nil)
    }

    def main(args: Array[String]) = {
        val arr: List[Int] = 1::2::3::4::5::Nil

        println(f(arr))
    }
}