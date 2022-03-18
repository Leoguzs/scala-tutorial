package lectures.part1.basics

object Expressions extends App {
  val x = 1 + 2; //expresion
  println(x)

  println(2 + 3 * 4);
  // + - * / & | << >> >>> (right shift with zero extensions)

  println(!(1 == x));


  println("////7Ejercicio con variable")
  var numero = 2;
  numero *=3;   // estos son side effects
  println(numero)

  numero *=2;
  println(numero)

  println("Instruction vs Expressions")
  println("Una instrucción es algo que le dices a la computadora que haga")
  println("Una Expression es algo que tiene un valor y/o tipo ")

  val aCondition = false;
  val aConditionedValue = if(aCondition) 5 else 3  //if expression regresa un valor
  println("Las expresiones condicionales regresan un valor: " +aConditionedValue)

  println(if(aCondition) 10 else 3);

///////////Esto no se usa/////////
println("Escala  no usa programacion imperativa, no usar ciclos!!!")
  var i = 0;
  val aWhile =while (i<10) {
    println(i)
    i+=1
  }
  ///////////Esto no se usa/////////

  println("Todo en Scala es una expresión!")

  var aVariable = 0;
  val aWeirdValue = (aVariable= 5)  //unidad = void, no regresa nada importante
  println(aWeirdValue)
  println("Side effects en Scala son expresiones regresando unit")
  println("Side effects: printLn, whiles, reassigning of vars = unit")


  println("Code blocks --> {} son expresiones, lo último del bloque es su valor")
  val aCodeBlock = {
    val y=1
    val z= y+1
    if(z>2) "Hello" else "Goodbye"
  } //podemos definir valores, escribir expresiones
  println(aCodeBlock)

  val a = 5
  println(if(a%2==0) "hola" else "adios" )

  val algunValor = {
    2<3
  }
  println(algunValor)

  var codeBlock2 = {
   if(4>1) 5 else 7
  }
  println(codeBlock2)

}