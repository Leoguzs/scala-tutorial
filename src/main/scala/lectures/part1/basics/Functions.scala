package lectures.part1.basics

object Functions extends App {
  println("Scala es un lenguaje funcional y orientado a objetos  \n")
  println("Definimos una funcion con la palabra 'Def'")

  //def nombre de funcion, (nombre: tipo)
  def aFunction(a: String, b: Int) = { //codeblock
    a + " " + b
  }

  println(aFunction("helo", 3))

  println("Las funciones sin parametros pueden ser llamadas sin paréntesis")

  def funcionSinParams(): Int = 33

  println(funcionSinParams())


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello", 5))

  println("Cuando necesites loops, usa recursion ")

  println("\n Usando unit (side effects): ")

  def functionWithSideEffects(aString: String): Unit =
    println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  println(aBigFunction(6))


  println("Funciones de ejercicio \n ")

  def greeting(name: String, age: Int): String = {
    "hola me llamo " + name + " y tengo " + age + " años"
  }
  println(greeting("leonardo", 25))

def factoring (number: Int): Int =
  if(number <2 && number > 0) number else number * factoring(number-1)

println(factoring(5))

def nuevoSaludo (nombre: String): String =
  "hola, me llamo " + nombre
  println(nuevoSaludo("Diana"))

  def fibonacci (num: Int): Int = {
    if(num <= 2) 1
    else fibonacci(num-1) + fibonacci(num-2)
  }
    println(fibonacci(8))

    def isPrime (numero: Int): Boolean = {
      if (numero % 2 == 0 && numero != 2) false
      else true
    }
      println(isPrime(37 *17))
}




