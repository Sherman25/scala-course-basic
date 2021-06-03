package quotes_hw.service

class ShakespearQuoter (var text: String = "To be or not to be") extends Quoter{
  def init(quote: String): Unit = {
    text = quote
  }

  override def printQuote: Unit = println(text)
}
