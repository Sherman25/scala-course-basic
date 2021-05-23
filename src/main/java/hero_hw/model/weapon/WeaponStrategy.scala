package hero_hw.model.weapon

import hero_hw.model.hero.Hero

import scala.util.Random

class WeaponStrategy(hero: Hero) {
  val random = new Random()
  def kick(defender: Hero): Unit = {
    val damage = random.between(0, hero.power)
    println(s"${hero.getClass.getSimpleName} kick with a sword to ${defender.getClass.getSimpleName} for ${damage} hp")
    defender.decreaseHp(damage)
  }
}
