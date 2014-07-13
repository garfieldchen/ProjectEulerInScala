object PE {
  // result:25164150 
  def main(args: Array[String]) {
    println(squareDiff(10))
    println(squareDiff(100))
  }

  def squareDiff(n: Int) = {
    var sum = 0
    for (i <- 1 to n) {
      for (j <- i + 1 to n)
        sum += 2 * i * j
    }

    sum
  }
}
