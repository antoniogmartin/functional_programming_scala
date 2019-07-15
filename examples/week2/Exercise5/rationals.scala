package week2.Exercise5

class Rational(x: Int, y: Int) {
  def numer = x

  def denom = y

  def add(other: Rational) =
    new Rational(numer * other.denom + other.numer * denom, other.denom + denom)

  def neg: Rational =
    new Rational(-numer, denom)

  override def toString() = numer + "/" + denom +"\n"
}

object rationals extends App {
  val x = new Rational(1, 2)
  println(x.numer)
  val y = new Rational(3, 4)
  val z = x.add(y)
  print(z.toString())

  // minus operation
  val k = new Rational(6,7)
  println(x.add(k.neg))

}
