import scala.compiletime.ops.int
object Demo {

  // remove odd positions from a given list
  // definition of odd position is differnt in HR, and their compiler won't work 
  // without 'case' in filter
  def f(arr: List[Int]): List[Int] = arr.zipWithIndex.filter{case (elem, idx) => idx % 2 == 1}.map(_._1)

  def main(args: Array[String]): Unit = {
    val arr = List.range(20, 30)

      println(f(arr))
  }

}
