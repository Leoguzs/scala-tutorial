package lectures.part1.basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object RecursionExercises extends App {
  println("Recursividad normal:")

  def factorialNormal(n: Int): Int = {
    if (n <= 1) n
    else n * factorialNormal(n - 1)
  }

  println(factorialNormal(4))

  println("El truco para hacer funciones recursivas es usar acumuladores \n para guardar resultados intermedios, en lugar de llamar a la funcion \n recursivamente, a veces necesitarás más acumuladores")
  println("1. Concatena un string n veces")

  def concatString(texto: String, num: Int, accumulator: String): String = {
    if (num <= 0) accumulator
    else concatString(texto, num - 1, texto + accumulator)
  }

  println(concatString("Leonardo", 10, ""))

  println("Es primo tail recursive")

  def esPrimo(numero: Int): Boolean = {
    @tailrec
    def esPrimoTailRec(n: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (n <= 1) true
      else esPrimoTailRec(n - 1, numero % n != 0 && isStillPrime)
    }

    esPrimoTailRec(numero / 2, true)

  }

  println(esPrimo(2003))
  println(esPrimo(3))

  println("Numero de Fibonacci")

  def fibo(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }

      if (n <= 2) 1
      else fiboTailRec(2, 1, 1)
  }
  println(fibo(5)) //1, 1, 2, 3, 5, 8, 13


  def concatenarTexto(texto: String, n: Int, accumulator: String): String = {
    if(n<1) accumulator
    else concatenarTexto(texto, n-1, texto + accumulator)
  }
  println(concatenarTexto("leonardo", 0, ""))
}

