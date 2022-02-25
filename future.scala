import scala.concurrent.Future
import scala.io.Source
import concurrent.ExecutionContext.Implicits.global
import scala.util.Success
import scala.util.Failure

object Demo {
    
    def run(): Unit = {
        val f1 = Future {
            Source.fromURL("https://httpbin.org/uuid").mkString
        }

        // two in one
        f1 onComplete {
            case Success(result) => println(s"Successfull ==> $result")
            case Failure(e) => println(s"Error ${e.getMessage}")
        }

        /*

        // deprecated
        f1 onSuccess {
            case x: String => println(x)
        }

        // deprecated
        f1 onFailure {
            case e: Exception => println(s"Error ${e.getMessage}")
        }

        */
    }

    def main(args: Array[String]) = {
        run()
        while(true){}
    }
}