package tech.donglei.functions

object Dome02_currying {

  def merge1(s1: String, s2: String) = s1 + s2

  // currying
  // f1: it's a function, merge 2 string
  def currying_merge(s1: String, s2: String)(f1: (String, String) => String) = f1(s1, s2)

  def main(args: Array[String]): Unit = {

    val str1 = merge1("abc", "xyz")
    println(s"str1: $str1:")
    println("*" * 15)

    val str2 = currying_merge("abc", "xyz")(_ + _)
    println(s"str2: $str2:")
    println("*" * 15)

    // more flexible when requirement of func changes
    val str3 = currying_merge("abc", "xyz")(_.toUpperCase() + _)
    println(s"str3: $str3:")
  }

}
