package me.mdrunaway.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

// Imports
import me.mdrunaway.survivalplugin.survivalplugin;
public class CommandTest {

	public CommandTest(Command cmd, String args[], Player p, survivalplugin plugin)
	{
		this.cmd = cmd;
		this.args = args;
		this.p = p;
		this.plugin = plugin;
	}
	public boolean execute()
	{
		if(cmd.getName().equalsIgnoreCase("Test"))
			p.sendMessage("Das Command ist angekommen");
//	        p.setLevel(0);
//			p.sendMessage("Aktuell macht dieses Plugin folgendes:" + "EXP Löschen");
			return false;
}
	Command cmd;
	String args[];
	Player p;
	survivalplugin plugin;
}
