package tech.donglei.traitdemo

object Demo07_ResponsibilityChainPattern {

  // Trait extends trait

  // Given same method appears in multiple trait
  // Given the method calls the same methods from its parent (super.method)
  // When a class extends all of the traits
  // Then the methods are called in sequence
  // Thus, it's a chain of responsibilities


  // Demo: Sequence of validations in a process of Payment

  // Handler: the high level process, process data (the actual pay logic).
  trait Handler {
    def handle(data: String) = {
      println("The final process...")
      println(data)
    }
  }

  trait DataValidHandler extends Handler {
    override def handle(data: String): Unit = {
      println("Verify data!")

      // Importance: call parent handle method
      super.handle(data)
    }
  }

  trait SignatureValidHandler extends Handler {
    override def handle(data: String): Unit = {
      println("Verify user signature!")

      // Importance: call parent handle method
      super.handle(data)
    }
  }

  // The actual sequence is from Right to Left: Signature Validation -> Data Validation
  class Payment extends DataValidHandler with SignatureValidHandler {
    def pay(data: String) = {

      println("User starts a pay request...")

      // call the handler from its parent class
      super.handle(data)
    }
  }

  def main(args: Array[String]): Unit = {
    val payment = new Payment

    payment.pay("Pay Sam $1000")
  }
}
