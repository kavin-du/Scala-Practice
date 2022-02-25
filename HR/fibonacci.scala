import scala.annotation.tailrec

object Solution {
    
  // def fibonacci(x:Int):Int = x match {
  //     case 0 => 0
  //     case 1 => 1
  //     case _ => fibonacci(x-1) + fibonacci(x-2)
  // }

  def fibonacci(x: Int): Int = {
    @tailrec
    def fibAcc(x: Int, a: Int, b: Int): Int = x match {
      case 0 => a
      case 1 => b
      case _ => fibAcc(x-1, b, a + b)
    }

    fibAcc(x, 0, 1)
  }

  def main(args: Array[String]) = {
    // println(fibonacci(readInt()))

    for(i <- 0 to 10) printf("%d ", fibonacci(i))

  }
}