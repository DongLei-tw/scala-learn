package tech.donglei.oop

// Singleton Object Demo
object Demo02_Singleton {

  object PrintUtil {
    def printSpliter(): Unit = println("-" * 15)
  }

  def main(args: Array[String]): Unit = {
    PrintUtil.printSpliter()
  }
}
