
object PE {
  import scala.collection.mutable.ArrayBuffer

  val buffer = new Array[Int](20)
  def parlindrome(n: Int): Boolean = {
    var size = 0
    var m = n
    while(m != 0) {
      buffer(size) = m % 10
      m /= 10
      size += 1
    }

    for (i <- 0 until (size/ 2)) {
      if (buffer(i) != buffer(size - i - 1))
        return false
    }

    true
  }

  case class ParLinResult(value: Int, a: Int, b: Int, count: Int) extends Exception

  def findParlin(little: Int, big: Int) = {
    var m1 = 0
    var m2 = 0

    var mx = 0
    var count = 0

    for (x <- big.to(little, -1)) {
      if (x*x < mx) 
        throw new ParLinResult(mx, m1, m2, count)

      for (y <- x.to(little, -1)) {
        count += 1
        val value = x * y
        if (parlindrome(value) && value > mx) {
          mx = value
          m1 = x
          m2 = y
        }
      }
    }

    (mx, m1, m2)
  }

  // result: 906609
  def main(args: Array[String]): Unit = {
    val fullCount: Double = (999 - 100) * (999 - 100)
    try {
      val (v, a, b) = findParlin(100, 999)
      println(s" found: $v = $a * $b, full: $fullCount")
    } catch {
      case ParLinResult(result, x, y, count) =>
        println(s" found: $result = $x * $y, count: $count, percentage: ${count / fullCount * 100} %")

    }
  }
}

