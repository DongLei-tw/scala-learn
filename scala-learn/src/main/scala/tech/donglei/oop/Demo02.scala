package tech.donglei.oop

// Singleton Object Demo
object Demo02 {

  object PrintUtil {
    def printSpliter(): Unit = println("-" * 15)
  }

  def main(args: Array[String]): Unit = {
    PrintUtil.printSpliter()
  }
}
