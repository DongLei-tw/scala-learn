package tech.donglei.implicit_conversions

import java.io.File
import scala.io.Source
import scala.language.implicitConversions

object Demo01_explicit_import {

  // 所谓隐式转换，指以 implicit 关键字声明的带有单个参数的方法
  // 该方法是[被自动调用]的，用来实现[自动将某种类型的数据转换成另外一种类型的数据]

  // Demo: 用过隐式转换，让File类的对象具备read的功能(实现将文本中的内容以字符串的形式读取出来)

  class RichFile(file: File) {
    // read file into a string
    def read(): String = Source.fromFile(file).mkString
  }

  // define the implicit conversion in an object
  object ImplicitDemo {
    implicit def file2RichFile(file: File): RichFile = new RichFile(file)
  }

  def main(args: Array[String]): Unit = {

    // Important: manually/explicit import implicit conversion
    import ImplicitDemo.file2RichFile

    val file = new File("./data/implicit_conversion_demo.txt")

    /*
    * Process:
    * 1. find read() from File class, call read if it has one.
    * 2. if it doesn't have, look up the implicit conversion has define the conversion
    * 3. if still doesn't have, raise exception
    * 4. if can convert the object to object of anther type, then look up whether the target type has the function has been defined
    *    otherwise raise exception
    * */

    println(file.read())
  }
}
