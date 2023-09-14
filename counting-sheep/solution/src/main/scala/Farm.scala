object Farm {

  def countSheep(sheep: Array[Boolean]): Int = {
    var n = 0
    for (aux: Boolean <- sheep) {
      if (aux) n+=1
    }
    n
  }
}