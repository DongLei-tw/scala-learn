package tech.donglei.trycatch

object Demo01_trycatch {

  def main(args: Array[String]): Unit = {
    try {
      val 1 = 10 / 0
    }
    catch {
       case ex: ArithmeticException => println("Math Exception")
       case ex: NullPointerException => println("Null Pointer Exception")
      // print exception type, details and the location where the exception was thrown
      case ex: Exception => ex.printStackTrace()
    }
    finally {
      println("release resource in final block")
    }
  }
}
