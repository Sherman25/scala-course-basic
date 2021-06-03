package quotes_hw.service
import scala.util.Random

class RandomQuoter extends Quoter {
  val random = new Random
  def generateRandomString(): String = {
    val length = random.between(1, 40)
    val sb = new StringBuilder
    for (i <- 1 to length) {
      sb.append(random.nextPrintableChar())
    }
    return sb.toString
  }

  override def printQuote: Unit = {
    println(generateRandomString)
  }
}
