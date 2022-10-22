package tech.donglei.traitdemo

object Demo02 {

  trait Logger {
    def log(msg: String):Unit
  }

  trait Warning {
    def warn(msg: String): Unit
  }

  object ConsoleLogger extends Logger with Warning {
    override def log(msg: String): Unit = println(s"INFO: $msg")
    override def warn(msg: String): Unit = println(s"WARN: $msg")
  }

  def main(args: Array[String]): Unit = {
    ConsoleLogger.log("This is an normal info message")
    ConsoleLogger.warn("This is an warning message")
  }

}
