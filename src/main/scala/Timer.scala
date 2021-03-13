object Timer {


  def timePrint[R](f: => R): Unit = {

    println(timeString(f))
  }

  def time[R](f: => R): Long = {
    val t0 = System.nanoTime()
    val r = f
    val t1 = System.nanoTime()

    val time = (t1 - t0) / 1000

    time
  }

  def timeString[R](f: => R): String = {
    val t0 = System.nanoTime()
    val r = f
    val t1 = System.nanoTime()

    val nanos = t1 - t0

    val ms = nanos / 1000000d

    val st = ms.toString.slice(0, 5)

    val result = s"time taken $st ms , The result is: $r"

    result
  }

  def average[R](f: => R)(times: Int = 10): Unit = {

    val result = (for (a <- 1 to times) yield time(f)).sum

    //average time taken
    val average = result / (times * 1000d)
    println(s"time taken: $average ms ")
  }
}
