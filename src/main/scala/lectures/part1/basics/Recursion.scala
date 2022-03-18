package lectures.part1.basics

object Recursion extends App{

  def factorial(num: Int): Int=
    if(num <=1) num
    else {
      println("factorial de " + num)
      num * factorial(num-1)

    }

  println(factorial(5))

println("intentando con funcion de factorial mejor")

def anotherFactorial (n: Int): BigInt = {
  def factorialHelper(x: Int, accumulator: BigInt): BigInt =
    if (x <=1) accumulator
    else factorialHelper(x - 1, x * accumulator)  //tail recursion: usa la recursion como la ultima expresión

  factorialHelper(n, 1)
}

  println(anotherFactorial(500))

  //CUANDO NECESITES LOOPS, USE TAIL RECURSION

}

