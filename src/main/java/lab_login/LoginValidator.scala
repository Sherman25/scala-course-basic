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
    val answer = login match {
      case NewLogin("admin", _, _) => "Illegal username, can't be admin"
      case NewLogin(_, pass, _) if (pass.startsWith("z")) => s"Illegal password ${pass}, can't start with \'z\'"
      case NewLogin(username, pass, _) if (username == pass) => "Password username can't be equal"
      case NewLogin(_, pass, _) if (pass.forall(_.isDigit)) => "Password can't contain only digits"
      case NewLogin(_, pass, confPass) if (pass != confPass) => s"${pass} and ${confPass} are not equals"
      case NewLogin(_,_,_) => "Accept"
    }
    println(answer)
  }
}
