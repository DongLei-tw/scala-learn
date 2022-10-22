package tech.donglei.traitdemo

object Demo01 {

  trait Logger {
    // abstract method
    def log(msg: String): Unit
  }

  class ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println(msg)
  }


  trait MessageSender {
    def send(msg: String):Unit
  }

  trait MessageReceiver {
    def receive(): Unit
  }

  class MessageWorker extends MessageSender with MessageReceiver {
    override def send(msg: String): Unit = println(s"Sending message: $msg")

    override def receive(): Unit = println("I've got your message")
  }

  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger

    logger.log("class extends single trait")

    // ---

    val worker = new MessageWorker
    worker.send("Hello world")
    worker.receive()

  }
}
