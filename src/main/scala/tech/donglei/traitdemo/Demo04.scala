package tech.donglei.traitdemo

object Demo04 {

  trait Logger {
    def log(msg: String) = println(msg)
  }

  class User

  def main(args: Array[String]): Unit = {

    // you are not able to call trait method like this
    // val user2 = new User
    // user.log()

    // dynamically add trait in class instance
    val user = new User with Logger
    user.log("Dynamically add trait in object/class instance")
  }
}
