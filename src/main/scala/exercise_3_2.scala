object exercise_3_2 extends App {
  def tail(l: List[Int]) = l match {
    case head :: rest => rest
    case Nil => Nil
  }

  println(tail(List(1,2,3,4)))
}
