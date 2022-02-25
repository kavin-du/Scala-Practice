import scala.annotation.tailrec

object Demo {

    // def recur_sum(list: List[Int]): Int = list match {
    //     case Nil => 0  // empty list
    //     case _ => list.head + recur_sum(list.tail) // not straightforward
    // }
    
    // naive way of recursion
    def recur_sum(list: List[Int]): Int = list match {
        case Nil => 0  // empty list
        case h :: t => h + recur_sum(t)
    }
    // head and tail

    // optimized recursive way
    def sum_optimized(list: List[Int]): Int = {

        @tailrec
        def sum_with_accumulator(list: List[Int], acc1: Int): Int = list match {
            case Nil => acc  // empty list
            case head :: tail => sum_with_accumulator(tail, head + acc)
        }

        sum_with_accumulator(list, 0)
    }



    def main(args: Array[String]) = {
        val arr: List[Int] = 1::2::3::4::5::Nil
        // val result = recur_sum(arr)
        val result = sum_optimized(arr)
        println(result)
        assert(result == 15)
    }
}