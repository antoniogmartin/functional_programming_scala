package week2

object Exercise2 extends App {
  def product(f: Int => Int)(a: Int, b: Int):Int =
    if (a>b) 1
    else f(a) * product(f)(a+1,b)

  def fact(n:Int) = product(x => x)(1,n)

  val res_fact=fact(5)
  print(res_fact+ "\ns") //120
  val res_prod=product(x => x*x)(3,5) //es igual que 3*3*4*4*5*5
  print(res_prod)

}
