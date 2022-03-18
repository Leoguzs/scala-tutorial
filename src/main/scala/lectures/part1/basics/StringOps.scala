package lectures.part1.basics

object StringOps extends App {
  val str: String = "Hola, te amo, Diana"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("H"))
  println(str.replace("te amo", "huevos"))


  val texto = "2"
  //print(texto.toInt)
  println('a' +: texto :+ 'z')

  print(str.reverse)

  println(str.take(10))

  println("\nInterpolaciones: s")
  val name = "David"
  val age = 12
  val greeting= s"Hola, me llamo $name y tengo $age años"
  println(greeting)
  val anotherGreeting = s"Hola, me llamo $name y tendré ${age+1} años \n" +
  "el siguiente mes"
  println(anotherGreeting)

  println("\nInterpolaciones: F")
  println("\nInterpolaciones: la F te da más precisión")

  val speed = 1.2f
val myth  = f"$name puede comer $speed%2.2f hamburguesas or minuto"
println(myth)

  println("\nInterpolaciones: raw, puede imprimir los carácteres literalmente")
  println(raw"Esta es una \n linea abajo")
  val scaped = "Esta es una \n linea abajo"
  println(raw"$scaped")
}
