package me.mdrunaway.listener;

import me.mdrunaway.survivalplugin.survivalplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Schilder_Listener 
	implements Listener
{
public Schilder_Listener(survivalplugin Plugin)
{
	plugin = Plugin;
	long time;
}
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event)	{
			Player p = event.getPlayer();
	if(event.getAction() == Action.RIGHT_CLICK_BLOCK) 
			if(event.getClickedBlock().getState() instanceof Sign) {
				Sign s= (Sign) event.getClickedBlock().getState();
				ItemStack item = p.getItemInHand();	
				if(s.getLine(0).equalsIgnoreCase("[Mülleimer]") || s.getLine(0).equalsIgnoreCase("[Wegwerfen]")){
					if(item == null || item.getType().getId() == 0) {	
						p.sendMessage(ChatColor.GOLD + "[" + plugin.getName() + "] " + ChatColor.RED + "Das kannst du nicht wegschmeissen!");
						event.setCancelled(true);
						} else {
							p.sendMessage(ChatColor.GOLD + "[" + plugin.getName() + "] " + ChatColor.RED + "Dein aktuell gehaltener Stack wurde gel�scht");
							System.out.println(event.getPlayer().getName() + " hat gerade weggeworfen: " + event.getPlayer().getInventory().getItemInHand());
							if(item == null || item.getType().getId() == 7 || item.getType().getId() == 56 || item.getType().getId() == 57 || item.getType().getId() == 264 || item.getType().getId() == 14 || item.getType().getId() == 41 || item.getType().getId() == 266 || item.getType().getId() == 15 || item.getType().getId() == 42) {
								System.out.println(event.getPlayer().getName() + " hat gerade folgendes Wertvolles weggeworfen: " + event.getPlayer().getInventory().getItemInHand());
				event.getPlayer().getInventory().remove(event.getItem());
							} else {
								event.getPlayer().getInventory().remove(event.getItem());
							}
			}
				}
			}
}
				
survivalplugin plugin;
Player player;
}
