import scala.util.Try
import scala.io.Source
import scala.util.Success
import scala.util.Failure
object Demo {
    def getResource(url: String): Try[String] = {
        Try{
            Source.fromURL(url).mkString
        }
    }
    
    def main(args: Array[String]) = {
        val result = getResource("https://httpbin.org/uuid")
        result match {
            case Success(response) => println(s"Result > $response")
            case Failure(e) => println(s"Error! ${e.getMessage}")
        }

    }
}