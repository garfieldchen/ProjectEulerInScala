object PE {
  def both(multi: Int, limit: Int, except: Int) = {
    var sum = 0
    var i = 1
    var value = 0
    while ( value < limit) {

      if (except==0 || value % except != 0)
        sum += value

      value = i * multi
      i += 1
    }
    sum
  }

  // result: 233168
  def main(args: Array[String]): Unit = {
    println((1 until 1000).filter(n => n%3==0 || n%5 ==0).sum)

    // count = 999 / 3 + 999/5 =  333 + 199 = 532,
    // TODO, show to 532 - 999 / 15 = 532 - 66 = 466 ?
    println(both(3, 1000, 0) + both(5, 1000, 15))
  }
}
