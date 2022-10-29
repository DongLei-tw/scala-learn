package tech.donglei.implicit_conversions

import scala.language.implicitConversions

object Demo05_practice {

  class RichList(list: List[Int]) {
    def avg(): Option[Int] = {
      if (list.isEmpty)
        None
      else
        Some(list.sum / list.size)
    }
  }

  def main(args: Array[String]): Unit = {

    implicit def List2RichList(list: List[Int]): RichList = new RichList(list)

    val list = (1 to 10).toList

    println(list.avg())
  }

}
