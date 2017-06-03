package me.mdrunaway.survivalplugin;

// Imports
import me.mdrunaway.commands.CommandFarben;
import me.mdrunaway.commands.CommandSuizid;
import me.mdrunaway.commands.CommandTest;
import me.mdrunaway.listener.Event;
import me.mdrunaway.listener.Schilder_Listener;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class survivalplugin extends JavaPlugin 
	implements Listener
	{
	public void onEnable()
	{
		System.out.println("MD-Survivalplugin gestartet");
		getServer().getPluginManager().registerEvents(this, this);
		plugin = this;
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(schilder, this);
		pm.registerEvents(event, this);
}
	public void onDisable()
	{
		System.out.println("MD-Survivalplugin deaktiviert");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String args[])
	{
		// Variable Player wird definiert
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("Test"))
			return (new CommandTest(cmd, args, p, this)).execute();
		if(cmd.getName().equalsIgnoreCase("Farben"))
			return (new CommandFarben(cmd, args, p, this)).execute();
		if(cmd.getName().equalsIgnoreCase("Suizid"))
			return (new CommandSuizid(cmd, args, p, this)).execute();
		return true;
	}
	
	// Variablen Definitionen
	public static survivalplugin plugin;
	Command cmd;
	String args[];
	Player p;
	public final Schilder_Listener schilder = new Schilder_Listener(this);
	public final Event event = new Event(this);
	
}