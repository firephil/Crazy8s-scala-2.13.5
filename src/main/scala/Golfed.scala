import java.security.SecureRandom

// Play around with functions aliases to reduce characters => cryptic looking code

object Golfed {

  def S(x:Int) = String.valueOf(x:Int)
  def G(x:Int) = x.toChar.toString
  def Z(x:IndexedSeq[Int]) = x.length
  def R(x:Int) = new SecureRandom().nextInt(x)


  def f(a:Int,b:Int)= a to b map(x=>if(x%8==0)G(R(Z((33 to 47)++(58 to 126)))) else S(x))
}