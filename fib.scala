object Demo {
  // def hello(): Unit = println("hello there")
  def fib(n: Int): Int = {
    
    def go(n: Int, acc1: Int, acc2: Int): Int = {
      if(n < 1) return 0
      if(n < 2) return 1
      return acc1 + acc2
    }
    go(n, n-1, n-2)
  }

  def main(args: Array[String]): Unit = {
    for(i <- 0 to 10)
      printf("%d %d\n", i, fib(i))
  }
}
