package tech.donglei.partialfunction

object Demo01 {

  // PartialFunction - 偏函数
  // 对给定的输入参数类型，函数可接受该类型的任何值。换句话说，一个(Int) => String 的函数可以接收任意Int值，并返回一个字符串。
  // 对给定的输入参数类型，偏函数只能接受该类型的某些特定的值。一个定义为(Int) => String 的偏函数可能不能接受所有Int值为输入。
  // 被包在花括号内没有match的一组case语句，偏函数是PartialFunction[A, B]类型的实例对象

  def main(args: Array[String]): Unit = {

    val pf: PartialFunction[Int, String] = {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Unknown"
    }

    println(pf(1))
    println(pf(2))
    println(pf(3))
    println(pf(4))
    println(pf(5))

    println("------")

    partialFunctionWithMap()
  }

  def partialFunctionWithMap(): Unit = {

    val list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // partialfunction + map
    val list2 = list1.map {
      case x if x >=1 && x <=3 => "[1-3]"
      case x if x >=4 && x <=8 => "[4-8]"
      case _ => "[8-*]"
    }
    println(list2)
  }
}
