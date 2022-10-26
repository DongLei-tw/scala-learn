package tech.donglei.traitdemo

object Demo08_class_extends_trait {

  class Message {
    def printMsg() = println("Scala sucks!")
  }

  trait Logger extends Message

  class ConsoleLogger  extends Logger

  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger
    logger.printMsg()
  }
}
