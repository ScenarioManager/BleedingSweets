package me.calebbassham.bleedingsweets

import me.calebbassham.scenariomanager.api.ScenarioManagerInstanceKt
import org.bukkit.plugin.java.JavaPlugin

class BleedingSweetsPlugin extends JavaPlugin {

  override def onEnable(): Unit = {
    ScenarioManagerInstanceKt.getScenarioManager.registerScenario(new BleedingSweets(), this)
  }


}
