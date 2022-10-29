package tech.donglei.implicit_conversions

import java.io.File
import scala.io.Source
import scala.language.implicitConversions

object Demo02_auto_import {

  //Demo: 通过隐式转换让File类具有read()功能

  class RichFile(file: File) {
    def read(): String = Source.fromFile(file).mkString
  }

  def main(args: Array[String]): Unit = {

    // define a implicit conversion to make File is able to read()
    // if the conversion is define in the current scope, then no need to import it
    implicit def file2RichFile(file: File): RichFile = new RichFile(file)

    val file = new File("./data/implicit_conversion_demo.txt")

    println(file.read())
  }

}
