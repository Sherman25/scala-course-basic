package quotes_hw.service

case class MessageQuoter(message: String) extends Quoter {
  override def printQuote: Unit = println(message)
}
