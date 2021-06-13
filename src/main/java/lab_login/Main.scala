package lab_login

object Main extends App{
  val login = NewLogin("Bob", "z12345A", "12345A")
  LoginValidator.validate(login)
}
