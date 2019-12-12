object exercise_3_3 extends App {
  def setHead(l: List[Int], h:Int) = l match {
    case Nil => Nil
    case head :: rest => h :: rest
  }

  println(setHead(List(1,2,3), 5))
}
