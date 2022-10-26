package tech.donglei.traitdemo

object Demo05_AdaptorPattern {

  /*
  * When trait declares multiple methods, but we only need one or some of them
  * We need a Adaptor class to isolate the rest methods
  * */

  trait PlayLOL {
    def top()  // 上单
    def mid()  // 中单
    def adc()  // 输出/下路
    def support() // 辅助
    def jungle()  // 打野
    def schoolChild() // 小学生
  }

  // Abstract class to be the Adaptor
  // override all the methods from trait, but with empty implementation
  abstract class Player extends PlayLOL {
    override def top(): Unit = {}

    override def mid(): Unit = {}

    override def adc(): Unit = {}

    override def support(): Unit = {}

    override def jungle(): Unit = {}

    override def schoolChild(): Unit = {}
  }

  // Newbie player
  class GreenHand extends Player {
    override def support(): Unit = println("不死不回城...")
    override def schoolChild(): Unit = println("骂我就挂机...")
  }

  def main(args: Array[String]): Unit = {
    val greenHand = new GreenHand

    greenHand.support()
    greenHand.schoolChild()
  }
}
