import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Demo extends App {
  val f: Future[String] = Future {
    Thread.sleep(250)
    "Hello " + "guys"
  }

//  val resp = Await.result(f, 1 seconds)
//  println(resp)

  // main thread terminates before executing this
  // so add sleep after oncomplete
  f onComplete {
    case Success(value) => println(value)
    case Failure(e) => println(e)
  }

//  f.map(x => println(x + " mapped"))
  Thread.sleep(1000)

}