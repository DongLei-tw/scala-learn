package tech.donglei.traitdemo

object Demo01 {

  trait Logger {
    // abstract method
    def log(msg: String): Unit
  }

  class ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println(msg)
  }

  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger

    logger.log("class extends single trait")
  }
}
