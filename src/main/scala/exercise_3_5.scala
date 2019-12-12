object exercise_3_5 extends App {
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Nil => Nil
      case head :: rest => if(f(head)) dropWhile(rest, f) else l
    }
  }

  println(dropWhile[Int](List(1, 2, 3, 4), x => x <= 5))
}
