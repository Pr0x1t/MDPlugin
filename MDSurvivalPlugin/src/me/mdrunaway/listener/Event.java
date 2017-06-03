package me.mdrunaway.listener;

import me.mdrunaway.survivalplugin.survivalplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class Event 
	implements Listener
{
public Event(survivalplugin Plugin)
{
	plugin = Plugin;

}
 @EventHandler
 public void onPlayerDropItem(PlayerDropItemEvent event) {
	 event.getPlayer().playSound( event.getPlayer().getLocation(), Sound.ENTITY_CHICKEN_EGG, 5F, 0.0F);
}
 @EventHandler
 public void onPlayerDeathEvent(PlayerDeathEvent event) {
event.setKeepInventory(true);
event.setKeepLevel(true);
event.setDeathMessage(ChatColor.GOLD + "[" + plugin.getName() + "] " + ChatColor.DARK_RED+ event.getEntity().getName() + " ist gestorben");
if(event.getEntity().getInventory().contains(Material.TORCH, 1)){
	event.getEntity().getWorld().getBlockAt(event.getEntity().getLocation()).setType(Material.TORCH);
	event.getEntity().getInventory().removeItem(new ItemStack[] { new ItemStack(Material.TORCH, 1) });
}
}
@EventHandler
public void onPlayerJoinEvent(PlayerJoinEvent event) {
event.getPlayer().sendMessage(ChatColor.GOLD + "[" + plugin.getName() + "] " + ChatColor.GREEN +"Viel Spaﬂ beim Survivaln");
event.setJoinMessage(ChatColor.GOLD + "[" + plugin.getName() + "] " + ChatColor.BLUE +  event.getPlayer().getDisplayName() + " hat das Spiel betreten");
System.out.println(event.getPlayer().getDisplayName() + " hat das Spiel betreten");
}
@EventHandler
public void onPlayerLeaveEvent(PlayerQuitEvent event) {
event.setQuitMessage(ChatColor.GOLD + "[" + plugin.getName() + "] " + ChatColor.GRAY + event.getPlayer().getDisplayName() + " hat das Spiel verlassen");
System.out.println(event.getPlayer().getDisplayName() + " hat das Spiel verlassen");
}

survivalplugin plugin;
Player player;
World world;
}
