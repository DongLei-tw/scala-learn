package tech.donglei.patternmatch

object Demo01_PatternMatch {

  def main(args: Array[String]): Unit = {

    val list = Vector("hadoop", 1, 123.45d, ("key", "value"))
    list.foreach(data => {
      val r = simpleMatch(data)
      println(r)
    })

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
}
