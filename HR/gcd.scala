object Solution {
    
  def gcd(x: Int, y: Int): Int = {
    
    
  }
  

  def acceptInputAndComputeGCD(pair:List[Int]) = {
		println(gcd(pair.head,pair.reverse.head))
  } 

  def main(args: Array[String]) {
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)
  }
}