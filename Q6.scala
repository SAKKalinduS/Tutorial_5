package Lab5

import scala.io.StdIn
object Q6 {
  def main(args: Array[String]): Unit = {
    println("Enter the n: ")
    val n = StdIn.readInt()
    fibonacciSeq(n)
  }

  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case x if x == 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciSeq(n: Int): Unit = {
    if (n >= 0) {
      fibonacciSeq(n - 1)
      print(fibonacci(n) + "   ")
    }
  }
}
