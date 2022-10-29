package tech.donglei.functions

object Demo01_function_as_param {

  def main(args: Array[String]): Unit = {

    named_function_as_param()

    anonymous_function_as_param()
  }

  def named_function_as_param(): Unit = {
    val list1 = (1 to 10).toList
    val func = (n: Int) => "*" * n
    val list2 = list1.map(func)

    println(list2)
  }

  def anonymous_function_as_param(): Unit = {
    val list1 = (1 to 10).toList

    val list2 = list1.map(x => "*" * x)
    val list3 = list1.map("*" * _)

    println("list2", list2)
    println("list3", list3)
  }
}
