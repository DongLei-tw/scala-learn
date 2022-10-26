package tech.donglei.oop

object Demo05_apply {

  class Person(var name: String = "", var age:Int = 0) {}

  object Person {
    def apply(name:String, age: Int): Person = new Person(name, age)
  }

  def main(args: Array[String]): Unit = {
    val person = new Person("Sam", 23)
    println(person.name, person.age)

    // if don't new a class, the apply method will be called
    val person2 = Person("Bob", 18)
    println(person2.name, person2.age)
  }

}
