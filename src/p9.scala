
object PE {
  // result: 31875000
  def main(args: Array[String]) {
    val (a, b, c) = findPyth(1000)
    println(s"$a * $b * $c = ${a * b * c}")
  }

  def findPyth(n: Int): (Int, Int, Int) = {
    for (i <- 1 until n) {
      for (j <- 1 until n - i) {
        val c = n - i - j
        if (i * i + j * j == c * c)
          return (i, j, c)
      }
    }
    null
  }
}

