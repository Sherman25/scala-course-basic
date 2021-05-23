package hero_hw.service

import hero_hw.model.hero.{Elf, Hero, Hobbit, King, Knight}
import scala.util.Random

class HeroFactory {
  val heroes = List(new King(), new Knight(), new Hobbit(), new Elf())
  var random = new Random()

  def getRandomHero(): Hero = {
    return heroes(random.nextInt(heroes.length))
  }
}
