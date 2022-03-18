package lectures.part1.basics

object CBNvsCBV extends App{
  def calledByValue (x: Long): Unit = {
    println("by value " + x)
    println("by value " + x)

  }


 def calledByName (x: => Long): Unit = {
   println("by name " + x)
   println("by name " + x)
 }

  println("Lamando por valor, toma el mismo y lo evalua UNA SOLA VEZ" +
    " y lo usa en la función, nada mas")
 calledByValue(System.nanoTime())
  println("\nSi ponemos una => le decimos al compilador que el \n" +
    "parámetro será llamado por su nombre, cada vez y por eso tarda más \n" +
    "evaluará conforme se va llamando")
 calledByName(System.nanoTime())

 def infinite(): Int  = 1 + infinite()
 def printFirst(x: Int, y: => Int)= println(x)

 printFirst(34, infinite()) //infinite() nunca será evaluado y el valor es una expresión
}
