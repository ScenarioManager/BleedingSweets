package me.calebbassham.bleedingsweets

import me.calebbassham.scenariomanager.api.Scenario
import org.bukkit.Material
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.{EventHandler, Listener}
import org.bukkit.inventory.ItemStack

class BleedingSweets extends Scenario("BleedingSweets") with Listener {

  private val gold = new ItemStack(Material.GOLD_INGOT, 5)
  private val diamond = new ItemStack(Material.DIAMOND)
  private val book = new ItemStack(Material.BOOK)

  private val items = Seq(gold, diamond, book)

  @EventHandler
  def onPlayerDeath(e: PlayerDeathEvent): Unit = {
    items.foreach(item => e.getDrops.add(item))
  }

}
