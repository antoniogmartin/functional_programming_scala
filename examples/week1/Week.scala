package week1

object Week1 extends App {
  def abs(x: Double): Double = if( x<0 ) -x else x

  def sqrt(x: Double):Double ={
    def sqrtIter(guess: Double): Double= if(is_good_enough(guess)) guess else sqrtIter(improve(guess))
    def is_good_enough(guess: Double)=
      abs(guess*guess-x)/x <0.001
    def improve(guess: Double) = (guess+x/guess)/2

    sqrtIter(1.0)
  }
  print(sqrt(2))
}
