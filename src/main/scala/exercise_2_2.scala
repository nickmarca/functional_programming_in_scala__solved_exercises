object exercise_2_2 extends App {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean ={
    def go(as: Array[A], ordered: (A, A)  => Boolean, r: Boolean, index: Int): Boolean = {
      if(as.length == 0 || as.length == 1) {
        true
      } else if(index < as.length - 2) {
        val p = r && ordered(as(index), as(index + 1))
        go(as, ordered, p, index + 1)
      } else {
        r
      }
    }

    go(as, ordered, true, 0)
  }

  val r = isSorted[Int](Array(1, 6, 3, 4), (a, b) => a < b)

  println(r)
}
