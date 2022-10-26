package tech.donglei.traitdemo

object Demo03 {

  trait Hero {
    var name = "Captain"
    var arms : String

    def eat()   = println("Eat & Drink")

    def toWar()
  }

  class Generals extends Hero {
    override var arms: String = "shield"

    override def toWar(): Unit = println(s"$name fights with $arms")
  }

  def main(args: Array[String]): Unit = {
    val generals = new Generals

    generals.eat()
    generals.toWar()
  }

}
