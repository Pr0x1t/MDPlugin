package me.mdrunaway.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;



// Imports
import me.mdrunaway.survivalplugin.survivalplugin;
public class CommandSuizid {

	public CommandSuizid(Command cmd, String args[], Player p, survivalplugin plugin)
	{
		this.cmd = cmd;
		this.args = args;
		this.p = p;
		this.plugin = plugin;
	}
	public boolean execute()
	{
		if(cmd.getName().equalsIgnoreCase("Suizid"))
			p.setHealth(0);
			p.sendMessage(ChatColor.GOLD + "[" + plugin.getName() + "]" + ChatColor.RED + " Du hast dich erfolgreich umgebracht!");
			System.out.println(p.getName() + " hat sich umgebracht");
			return true;
}
	Command cmd;
	String args[];
	Player p;
	survivalplugin plugin;
}
