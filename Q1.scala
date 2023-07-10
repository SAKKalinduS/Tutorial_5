package Lab5

import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter a number")
    val num = StdIn.readInt()
    val answer = prime(num)
    println(answer)

  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case x => GCD(x, a % x)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case a if a == p => true
    case a if p == 1 => false
    case a if GCD(p, a) > 1 => false
    case a => prime(p, a + 1)
  }

}
