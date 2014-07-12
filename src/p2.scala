
object PE {
  // result: 4613732
  def main(args: Array[String]): Unit = {
    println(fibEvenSum(4000000))
  }

  def fibEvenSum(n: Long): Long = {
    var a = 1
    var b = 2
    var sum = 0
    while (b <= n) {
      if (b % 2 == 0) 
        sum += b

      val c = a + b
      a = b
      b = c
    }

    sum
  }
}
