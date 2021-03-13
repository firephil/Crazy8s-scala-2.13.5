import java.security.SecureRandom
import scala.collection.parallel.immutable.ParVector


object Main {

  // Use java's secure random as suggested by codacy quality checker
  val random = new SecureRandom()

  def crazy8(a: Int, b: Int): List[String] = {
    val chars = (33 to 47) ++ (58 to 126)

    val list :List[String] = List.range(a,b).map {
      case x if x== 0  => String.valueOf(x)
      case x if x % 8 == 0 => chars(random.nextInt(chars.length)).toChar.toString
      case x => String.valueOf(x)}

    list
  }

  // Testing the ParVector Performance
  def crazy8Parallel(a: Int, b: Int): ParVector[String] = {
    val chars = (33 to 47) ++ (58 to 126)

    val vec :ParVector[String] = ParVector.range(a,b).map {
      case x if x % 8 == 0 => chars(random.nextInt(chars.length)).toChar.toString
      case x => String.valueOf(x)}

    vec
  }

  //Golfed inlined version
  // Don't annotate types, use a range and IndexedSeq, Vector, eliminate variable declarations,spaces etc

  def S(a:Int,b:Int)= a to b map(x=>if(x%8==0)random.nextInt(((33 to 47) ++ (58 to 126)).length).toChar.toString else String.valueOf(x))




  def main(args: Array[String]): Unit = {
    Timer.average(crazy8(1, 100_0000))(10)
    Timer.average(crazy8Parallel(1,100_0000))(10)
  }
}