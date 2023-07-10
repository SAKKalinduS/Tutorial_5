package Lab5

import scala.io.StdIn

object Q4 {
  def main(args: Array[String]): Unit = {
    println("Enter a number")
    val n = StdIn.readInt()
    println(isEven(n))

  }

  def isEven(n: Int): String = n match {
    case x if x == 0 => "Number is Even"
    case _ => isOdd(n - 1)
  }

  def isOdd(n: Int): String = n match {
    case x if x == 0 => "Number is Odd"
    case _ => isEven(n - 1)
  }

}
