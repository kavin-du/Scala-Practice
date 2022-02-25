object Demo {

    class Stack[A] {
        private var elements: List[A] = Nil

        def push(x: A): Unit =  {
            elements = x :: elements  // 1 :: List(2, 3) == List(1, 2, 3)
        }
        
        def peek: A = elements.head

        def pop(): A = {
            val currentTop = peek
            elements = elements.tail 
            currentTop
        }
    }

    def main(args: Array[String]): Unit = {
        val stack = new Stack[Int]

        stack.push(5)
        stack.push(10)

        println(stack.pop())
        println(stack.pop())
    }
}