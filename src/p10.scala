
object PE {
  // result: 142913828922
  def main(args: Array[String]) {
    println(sumPrim(2000000))
  }

  def sumPrim(m: Long) ={
    var sum = 2L

    for( i <- 3L.until(m, 2)) {
      if (isPrim(i))
        sum += i
    }

    sum
  }

  //source from p7
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

