package tech.donglei.oop


object Demo01_Class {

  def main(args: Array[String]): Unit = {

    class Person {
      // Init fields uses _
      var name:String = _
      var age: Int = _

      def printHello(msg: String) = println(msg)
    }

    class Customer(val name: String, val age: Int) {
      println("constructor is called!")

      // define Auxiliary constructor
      def this(attr: (String, Int)) {
        // calling the primary constructor
        this(attr._1, attr._2)
      }
    }

    val person = new Person

    person.name = "Sam"
    person.age = 18

    println(person.name, person.age)

    person.printHello("Hello world!")

    val c1 = new Customer("Sam", 20)
    val c2 = new Customer("Bob", 30)
    println(s"c1 name: ${c1.name}, age: ${c1.age}")
    println(s"c2 name: ${c2.name}, age: ${c2.age}")
  }
}
