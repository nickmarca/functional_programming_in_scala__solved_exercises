object exercise_3_4 extends App {
  def drop[A](l: List[A], n: Int): List[A] = {
    l match {
      case Nil => Nil
      case _ :: rest =>if(n > 0) drop(rest, n - 1) else l
    }
  }

  println(drop[Int](List(1, 2, 3, 4, 5), 2))
}
