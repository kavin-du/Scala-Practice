object Solution {
    
  // def fibonacci(x:Int):Int = x match {
  //     case 0 => 0
  //     case 1 => 1
  //     case _ => fibonacci(x-1) + fibonacci(x-2)
  // }

  def fibonacci(x: Int): Int = x match {
    @tailrec
    def fibAcc(x: Int, acc: Int): Int = x match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(x-1) + fibonacci(x-2)
    }
    
    fibAcc(x, 0)
  }

  def main(args: Array[String]) = {
    // println(fibonacci(readInt()))

    for(i <- 0 to 5) printf("%d ", fibonacci(i))

  }
}