object Parity {
  def findOutlier(integers: List[Int]): Int = {
    val odds = integers.map(x => x % 2 == 0)
    if (odds.count(_ == true) == 1) integers(odds.indexOf(true)) else integers(odds.indexOf(false))
  }
}
