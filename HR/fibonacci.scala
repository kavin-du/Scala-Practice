import scala.annotation.tailrec
import scala.io.StdIn.{readLine, readInt}

object Solution {
    // without tail recursion
  // def fibonacci(x:Int):Int = x match {
  //     case 0 => 0
  //     case 1 => 1
  //     case _ => fibonacci(x-1) + fibonacci(x-2)
  // }

  def fibonacci(x: Int): Int = {
    @tailrec
    def fibAcc(x: Int, a: Int, b: Int): Int = x match {
      case 1 => a
      case 2 => b
      case _ => fibAcc(x-1, b, a + b)
    }

    fibAcc(x, 0, 1)
  }

  def main(args: Array[String]) = {
    println(fibonacci(readInt()))

    // for(i <- 1 to 10) printf("%d ", fibonacci(i))

  }
}