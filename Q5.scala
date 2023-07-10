package Lab5

import scala.io.StdIn

object Q5 {
  def main(args: Array[String]): Unit = {
    println("Enter a number")
    var num = StdIn.readInt()
    if (num==0){
      ""
    } else if (num % 2 == 0) {
      num = num - 2
    } else {
      num = num - 1
    }
    print(addition(num))
  }

  def addition(num: Int): Int = {
    var sum = 0
    if (num == 0) {
      return 0
    } else {
      sum = num + addition(num - 2)
    }
    return sum
  }

}
