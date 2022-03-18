package part2oop

object oppBasics extends App {
val leonardo = new Person("Leonardo", 25)
println(leonardo.age)
}

//constructor: cada instancia debe ser construida pasandole un nombre y la edad
class Person(val name: String, val age: Int) {
 //val school = "FES Acatlán - UNAM"
 //def greeting():String = "Helo puma student"
}

//los parámetros de mi clase NO son campos a los que podamos acceder
//los podemos convertir en campos si les ponemos val o var antes
