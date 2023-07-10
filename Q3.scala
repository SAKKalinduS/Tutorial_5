package Lab5

import scala.io.StdIn

object Q3 {
  def main(args: Array[String]): Unit = {
    println("Enter a number")
    val num = StdIn.readInt()
    print(addition(num))
  }

  def addition(num: Int): Int = {
    var sum = 0
    if (num == 0) {
      return 0
    } else {
      sum = num + addition(num - 1)
    }
    return sum
  }

}
