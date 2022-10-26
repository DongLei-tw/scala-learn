package tech.donglei.io

import java.io.{FileInputStream, FileOutputStream, ObjectInput, ObjectInputStream, ObjectOutputStream}

object Demo01_serialize_deserialize {

  val filename = "Demo01_serialize_deserialize"

  // If you want to serialize or deserialize you must extends Serializable
  // Or you can define it as case class
  class Person(var name: String, var age: Int) extends Serializable

  def main(args: Array[String]): Unit = {

    // Serialization
     val p = new Person("Sam", 22)
     val oos = new ObjectOutputStream(new FileOutputStream(s"./data/out/$filename.txt"))
     oos.writeObject(p)
     oos.close()

    // Deserialization
    val ois = new ObjectInputStream(new FileInputStream(s"./data/out/$filename.txt"))
    val p1: Person = ois.readObject().asInstanceOf[Person]
    println(p1.name, p1.age)
    ois.close()
  }
}
