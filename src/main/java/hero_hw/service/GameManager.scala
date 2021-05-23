package hero_hw.service

object GameManager {
  def fightWithRandomHeroes(): Unit = {
    val heroFactory = new HeroFactory();
    var hero1 = heroFactory.getRandomHero()
    var hero2 = heroFactory.getRandomHero()

    while(hero1.isAlive() && hero2.isAlive()) {
      hero1.kick(hero2)
      hero2.kick(hero1)
    }
    if(hero1.isAlive()) {
      println(hero1.getClass.getSimpleName + " won")
    } else {
      println(hero2.getClass.getSimpleName + " won")
    }
  }
}
