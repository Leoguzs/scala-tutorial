package lectures.part1.basics

object FunctionExercises extends App{
  def greeting (nombre: String, edad: Int): String = {
    "Hola, me llamo " + nombre + " y tengo" + edad + " años"
  }

  println(greeting("Leonardo", 25))

  def factorial (numero: Int): Int = {
    if(numero <2) 1 else numero * factorial(numero-1)
  }

  println(factorial(5))
}

