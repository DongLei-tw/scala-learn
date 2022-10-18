package tech.donglei.oop

object Demo08_abstract {

  abstract class Person {
    def sayHello()
  }

  def show(p: Person) = p.sayHello()

  def main(args: Array[String]): Unit = {

    // 匿名内部类 - Anonymous Inner Class
    // 当对成员方法仅调用一次的时候
    new Person {
      override def sayHello(): Unit = println("Hello, Scala")
    }.sayHello()

    // 通过匿名内部类的形式创建Person抽象类的子类对象
    // 作为方法的参数传递
    val p:Person = () => println("Hello, Scala 2")
    show(p)
  }
}
