package quotes_hw

import quotes_hw.service.{MessageQuoter, RandomQuoter, ShakespearQuoter}

object Main extends App{
  val sheakspearQuoter = new ShakespearQuoter()
  sheakspearQuoter.printQuote

  val randomQuoter = new RandomQuoter()
  randomQuoter.generateRandomString()
  randomQuoter.printQuote

  val messageQuoter = new MessageQuoter("This is MessageQuoter")
  messageQuoter.printQuote
}
