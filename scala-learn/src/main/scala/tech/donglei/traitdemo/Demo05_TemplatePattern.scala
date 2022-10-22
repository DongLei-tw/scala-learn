package tech.donglei.traitdemo

object Demo05_TemplatePattern {

  // The process is known but the details of steps are different/unknown
  // Common part is define in parent class, different details will be implemented in derived classes

  // Define template class, should be abstract
  abstract class Template {
    def code(): Unit

    def getRuntime: Long = {
      val start = System.currentTimeMillis()
      code()
      val end = System.currentTimeMillis()

      end - start
    }

  }

  class ForDemo extends Template {
    override def code(): Unit = for (i <- 1 to 1000) println(s"Hello Scala, times ${i}")
  }

  def main(args: Array[String]): Unit = {
    val f = new ForDemo

    val millSec = f.getRuntime

    println(s"Sent $millSec")
  }

}
