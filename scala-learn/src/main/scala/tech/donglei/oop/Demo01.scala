package tech.donglei.oop


object Demo01 {

  def main(args: Array[String]): Unit = {

    class Person {
      // Init fields uses _
      var name:String = _
      var age: Int = _

      def printHello(msg: String) = println(msg)
    }

    val person = new Person

    person.name = "Sam"
    person.age = 18

    println(person.name, person.age)

    person.printHello("Hello world!")
  }
}
