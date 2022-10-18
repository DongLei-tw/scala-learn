package tech.donglei.oop

object Demo04_companion_object {

  // companion object: separate static fields and methods

  class Generals {
    // these are non-static fields

    def toWar() = println(s"General fight with ${Generals.armsName} weapon")
  }

  object Generals {
    private val armsName = "shotgun"
  }

  def main(args: Array[String]): Unit = {

    // create instance
    val generals = new Generals

    generals.toWar()
  }
}
