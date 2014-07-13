object PE {
  def main(args: Array[String]) {
    println(findn(6))
    println(findn(10001))
  }

  def findn(n: Int): Long = {
    var i = 5L
    var count = n - 2
    while( count > 0) {
      //println(s"$i => ${isPrim(i)}")
      if (isPrim(i))
        count -= 1

      i += 2
    }

    i - 2
  }

  def isPrim(n: Long) = n match{
    case 1 => false
    case 2 => true
    case 3 => true
    case _ if (n % 3==0 || n % 2==0) => false
    case _ =>
      var top = n / 3
      var i = 5
      var result = true
      while ( result && i < top) {
        result = n % i != 0
        top = n / i
        i += 2
      }

      result
  }
}

