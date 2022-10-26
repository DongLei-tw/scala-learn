package tech.donglei.oop

object Demo07_instanceOf {

  class Person

  class Student extends Person {
    def sayHello() = println("Hello, Student!")
  }

  def main(args: Array[String]): Unit = {

    val p:Person = new Student

    // p.sayHello   We can not call sayHello here


    if (p.isInstanceOf[Student]) {
      // convert p to Student type
      val s = p.asInstanceOf[Student]
      s.sayHello()
    }

    // can convert to pattern match
    //  p match {
    //    case s: Student =>
    //      s.sayHello()
    //    case _ =>
    //  }

    println("is instance of person?", p.isInstanceOf[Person])

    println("is person class?", p.getClass == classOf[Person])

    println("is student class?", p.getClass == classOf[Student])
  }
}
