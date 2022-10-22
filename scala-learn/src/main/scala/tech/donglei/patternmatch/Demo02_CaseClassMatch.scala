package tech.donglei.patternmatch

object Demo02_CaseClassMatch {

  case class Customer(name: String, age: Int)

  case class Order(id: Int)

  def main(args: Array[String]): Unit = {
    val c: Any = Customer("Sam", 23)

    c match {
      case Customer(a, b) => println(s"It's an instance of Customer, name is $a, age is $b")
      case Order(id) => println(s"It's an instance of Order, id is $id")
      case _ => println("No match")
    }

  }

}
