import scala.annotation.tailrec

object exercise_2_1 extends App {
  def fib_(n: Int): Int = {
    if(n <= 1) {
      n
    } else {
      fib_(n - 1) + fib_(n - 2);
    }
  }

  def fib(n: Int): Int = {
    @tailrec
    def go(a: Int, b: Int, n: Int): Int = {
      if(n > 0) go(b, a + b, n - 1)
      else a
    }

    go(0, 1, n)
  }

  println(fib(5))
}
