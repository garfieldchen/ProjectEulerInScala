import scala.annotation.tailrec

object PE {
  def main(args: Array[String]) {
    println(listlcm(10))
    println(listlcm(20))
  }

  def listlcm(n: Long) ={
    (gcd(1, 2) /: (3.toLong to n)) ( (acc, i) => lcm(acc, i) )
  }

  def lcm(a: Long, b: Long) = a * b / gcd(a, b)

  def gcd(a: Long, b: Long) = gcd1(a max b, a min b)

  @tailrec def gcd1(a: Long, b: Long): Long = {
    val r = a % b
    if (r == 0) b else gcd1(b, r)
  }
}
