package tech.donglei.oop

object Demo06_ClassInherit {

  class Person {
    var name = ""
    def sayHello = println("Hello, scala!")
  }

  // Student 是一个单例对象
  object Student extends Person { }

  def main(args: Array[String]): Unit = {

    Student.name = "Sam"
    println(Student.name)
    Student.sayHello
  }
}
