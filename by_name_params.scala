
object Demo {
    
    def ifBothTrue(cond1: => Boolean)(cond2: => Boolean)(f: => Unit): Unit = {
        if (cond1 && cond2) f
    }

    def main(args: Array[String]) = {
        val age = 19
        val num = 0

        // by keeping the third parameter group as by name parameter,
        // you can pass a block of code with curly braces
        ifBothTrue(age > 18)(num == 0) {
            println("both true") // pass anything here
        }
    }
}