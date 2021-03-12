import scala.util.Random

object Main {


  def crazy8(a: Int, b: Int): LazyList[String] = {
    val chars = (33 to 47) ++ (58 to 126)

    val list :LazyList[String] = LazyList.range(a,b).map {
      case x if (x== 0)  => String.valueOf(x)
      case x if (x % 8 == 0) => chars(Random.nextInt(chars.length)).toChar.toString
      case x => String.valueOf(x)}

    list
  }

  //Golfed inlined version
  // Don't annotate types, use a range and IndexedSeq, Vector, eliminate variable declarations,spaces etc

  def S(a:Int,b:Int)= a to b map(x=>if(x%8==0)Random.nextInt(((33 to 47) ++ (58 to 126)).length).toChar.toString else String.valueOf(x))




  def main(args: Array[String]): Unit = {

    println(crazy8(0,20).toList)
    println(S(0,20))
  }
}