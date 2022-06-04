import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.annotation.tailrec
import scala.math.pow
import scala.math.BigDecimal

object Solution {
  // cannot use var, val keywords

  // def ex(x: Double): Double = {

  //   @tailrec
  //   def singleTerm(x: Double, p: Int, acc: Double): Double = p match {
  //     case 0 => acc
  //     case _ => {
  //       println(s"$x^$p/$p!")
  //       singleTerm(x, p-1, acc + pow(x, p)/factorial(p))
  //     } 
  //   }

  //   singleTerm(x, 10, 1)
  // }


  def factorial(n: Int): BigDecimal = {

    @tailrec
    def go(a: BigDecimal, acc: BigDecimal): BigDecimal = a match {
      case BigDecimal.valueOf('1') => acc
      case _ => go(a-1, acc.multiply(a))
    }

    go(BigDecimal.valueOf(n), BigDecimal.valueOf(1))
  }

  


  def main(args: Array[String]) = {
    val stdin = scala.io.StdIn

    // val n = stdin.readLine.trim.toInt

    // for (nItr <- 1 to n) {
    //   val x = stdin.readLine.trim.toDouble
    // }

    for (n <- 1 to 20) {
      println(factorial(n))
    }

      // ex(nItr)
      // println(ex(20.000))
      // println(ex(5))
      // println(ex(0.5))
      // println(ex(-0.5))
  }
}
