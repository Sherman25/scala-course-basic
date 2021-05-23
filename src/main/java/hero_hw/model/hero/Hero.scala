package hero_hw.model.hero

import hero_hw.model.weapon.WeaponStrategy

import scala.util.Random

trait Hero {
  var hp = Random.between(5, 15)
  var power = Random.between(5, 15)
  val weaponStrategy = new WeaponStrategy(this: Hero)
  def decreasePower(delta: Int): Unit = power -= delta;
  def decreaseHp(delta: Int): Unit = hp -= delta;
  def isAlive(): Boolean = hp > 0;
  def die(): Unit = hp = 0;
  def kick(enemy: Hero): Unit = {
    weaponStrategy.kick(enemy)
  }
}
