package lectures.part1.basics

object ValuesVariablesTypes extends App{
//Val, nombre:, tipo, asignación, valor
//los valores que se crean con Val son constantes
//los tipos de valor en Val x: Int = 42; el Int es opcional
  val x = 78;
println(x);


val saludo: String = "Hola, usuario!";
println(saludo);

val aBoolean: Boolean = true;  //no puedes escribir un true c false con mayus
println(aBoolean);
val aChar: Char = 'd';
println(aChar)


println("////shorts & longs")
val aShort: Short = 2223;
val aLong: Long = 2333223323223322L   //decir que es L
val aFloat: Float = 2.0f;             //decir que es f
val aDouble: Double= 2.3440343;


println("//////Variables//////");
 var aVarible: Int = 0;
 aVarible=6;  //side effects
 println(aVarible)

 var greeting= "Hi, user!";
 println(greeting)
 greeting = "te amo"
 print(greeting)

}
