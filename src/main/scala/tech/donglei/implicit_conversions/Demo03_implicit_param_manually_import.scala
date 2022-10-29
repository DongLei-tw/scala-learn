package tech.donglei.implicit_conversions

// Demo: implicit parameters + manually/explicit import
// Implicit parameter: if a param is following by the key word implicit, it's a implicit param
// Benefit: Don't need to pass value to implicit param. compiler will look up it

object Demo03_implicit_param_manually_import {

  // Requirement: define a show() function, wrap the passed in string with prefix and suffix
  // delimit: (prefix, suffix)
  def show(name: String)(implicit delimit: (String, String)): String = delimit._1 + name + delimit._2

  object ImplicitParam {
    // implicit val delimit_default = ("<<<", ">>>")
    implicit val delimit_default: (String, String) = "<<<" -> ">>>"
  }

  def main(args: Array[String]): Unit = {

    // Important: manually/explicit import
    import ImplicitParam.delimit_default

    println(show("Sam"))
    println(show("Sam")("((", "))"))
  }

}
