object Feisbook {
  def likes(names: Array[String]): String = {
    names.length match{
      case 0 => "no one likes this"
      case 1 => s"${names(0)} likes this"
      case 2 => s"${names(0)} and ${names(1)} like this"
      case 3 => s"${names(0)}, ${names(1)} and ${names(2)} like this"
      case n if (n>3) => s"${names(0)}, ${names(1)} and ${names.length - 2} others like this"
    }
  }
}
