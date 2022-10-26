package tech.donglei.extractor

object Demo01_Extractor {

  class Student(var name: String, var age: Int)

  // define a extractor of class Student
  object Student {

    // apply: property value => instance
    def apply(name: String, age: Int): Unit = new Student(name, age)

    // unapply: instance => property value
    def unapply(student: Student): Option[(String, Int)] = {
      if (student == null)
        None
      else
        Some(student.name, student.age)
    }

  }

  def main(args: Array[String]): Unit = {

    val s1 = new Student("Sam", 23)

    val s2 = Student("Bob", 24)

    // normal approach
    println(s1.name, s1.age)
    println("-" * 15)

    // call unapply
    val result = Student.unapply(s1)
    println(result)
    println("-" * 15)

    // pattern match
    s1 match {
      // match case requires unapply function
      case Student(name, age) => println(s"name: $name, age: $age")
      case _ => println("Unmatched")
    }
  }
}
