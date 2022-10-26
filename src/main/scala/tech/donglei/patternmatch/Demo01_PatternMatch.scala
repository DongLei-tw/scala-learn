package tech.donglei.patternmatch

object Demo01_PatternMatch {

  def main(args: Array[String]): Unit = {

    val list = Vector("hadoop", 1, 123.45d, ("key", "value"))
    list.foreach(data => {
      val r = simpleMatch(data)
      println(r)
    })

    println("========")

    val inputs = Vector(1, 2, 3, 5, 8, 13)

    inputs.foreach(matchGuards)
  }

  def simpleMatch(data: Any): String = {
    val result1 = data match {
      case x: String => s"$x is a string data"
      case x: Int => s"$x is a Integer data"
      case x: Double => s"$x is a Double Data"
      case _ => "No match"
    }
    result1
  }

  def matchGuards(input: Int): Unit = {
    input match {
      // pattern match guards: if condition
      case x if x >= 0 && x <= 3 => println("in range [0-3]")
      case x if x >= 4 && x <= 8 => println("in range [4-8]")
      case _ => println("Out of range")
    }
  }
}
