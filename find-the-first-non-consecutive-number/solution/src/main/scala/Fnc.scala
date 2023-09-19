import scala.util.control.Breaks.break

object Fnc {
  def firstNonConsecutive(values: Seq[Int]): Option[Int] = {
    val result:Int = (values.zipAll((values.head until values.head + values.length),0,0).map {case (a,b) => a==b}).indexOf(false)
    if (result == -1) None else Some(values(result))
  }
}
