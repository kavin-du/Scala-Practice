import java.util.Date
object Demo {
    def f1(timestamp: Long): Unit = {
        println(s"Timestamp: $timestamp")
    }

    // implicit conversion when the function in scope
    implicit def dateToLong(date: Date): Long = {
        date.getTime
    }
    
    def main(args: Array[String]) = {
        val date = new Date()
        f1(date)
    }
}
