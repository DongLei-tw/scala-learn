package tech.donglei.implicit_conversions

object Demo04_implicit_param_auto_import {

  def show(name: String)(implicit delimit: (String, String)): String = delimit._1 + name + delimit._2

  def main(args: Array[String]): Unit = {

    // define implicit param in the current scope
    // it will be automatically/implicit import by compiler
    implicit val delimit_default: (String, String) = "<<<" -> ">>>"

    println(show("Sam"))
  }
}
