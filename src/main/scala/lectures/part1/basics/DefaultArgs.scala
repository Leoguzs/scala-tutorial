package lectures.part1.basics

object DefaultArgs extends App{

  def trFact(n: Int, accumulator: Int = 1): Int = {
    println("el default lo podemos usar cuando tengamos funciones \n" +
      "que necesiten parámetros que sean fijos o por default")
    if(n<=1) accumulator
    else trFact(n-1, n*accumulator)
  }

  val fact10= trFact(5)
  println(fact10)

  println("\nOtro ejemplo con una app de editado de fotos")

  def savePicture(format: String= "jpg", width: Int=1080, height: Int= 600): Unit =
    println("saving picture")

  println("\nCuando hacemos los parámetros por default, tenemos \n" +
    "que tener en cuenta que Scala se puede confundir, por lo que\n" +
    "cuando llamamos a la función, nombramos al argumento y su valor")
  savePicture(format = "png", 323, 244)
}
