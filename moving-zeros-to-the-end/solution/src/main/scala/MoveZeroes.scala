object MoveZeroes {
  def moveZeroes(lst: List[Int]): List[Int] = lst.filter(_!=0):::lst.filter(_==0)
}
