package me.calebbassham.bleedingsweets

import me.calebbassham.scenariomanager.api.ScenarioManagerInstance
import org.bukkit.plugin.java.JavaPlugin

class BleedingSweetsPlugin extends JavaPlugin {

  override def onEnable(): Unit = {
    ScenarioManagerInstance.getScenarioManager.registerScenario(new BleedingSweets(), this)
  }


}
