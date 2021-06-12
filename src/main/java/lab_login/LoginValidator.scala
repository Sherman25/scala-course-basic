package lab_login

object LoginValidator {
  /*
  * Name can't be "admin"
  * Password can't start from "z"
  * Password can't be equal to username
  * Password can't contains only digits
  * ConfirmPassword should equal password
  */

  def validate(login: NewLogin): Unit = {
    if(login.username.equals("admin")) {
      println("Illegal username, can't be admin")
      return
    }
    if(login.password.startsWith("z")) {
      println("Illegal password, can't start with \"z\"")
      return
    }
    if(login.password.equals(login.username)) {
      println("Illegal password, can't be equal")
      return
    }
    if(login.password.forall(_.isDigit)) {
      println("Illegal password, can't contain only digits")
      return
    }
    if(!login.password.equals(login.confirmPassword)) {
      println("The password and confirm password are not equal")
      return
    }

    else println("Accepted")
  }
}
