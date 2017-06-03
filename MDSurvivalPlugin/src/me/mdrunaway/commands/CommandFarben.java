package me.mdrunaway.commands;

import me.mdrunaway.survivalplugin.survivalplugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class CommandFarben
{

    public CommandFarben(Command cmd, String args[], Player p, survivalplugin plugin)
    {
        this.cmd = cmd;
        this.args = args;
        this.p = p;
        this.plugin = plugin;
    }

    public boolean execute()
    {
        if(cmd.getName().equalsIgnoreCase("Farben"))
        {
            p.sendMessage((new StringBuilder()).append(ChatColor.GOLD).append("[" + plugin.getName() + "]").append(ChatColor.GREEN).append(" Alle Farbcodes:").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.DARK_RED).append("&4 Dunkel Rot").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.RED).append("&C Rot").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.GOLD).append("&6 Gold").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.YELLOW).append("&e Gelb").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.DARK_GREEN).append("&2 Dunkel Gr\374n").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.GREEN).append("&a Gr\374n").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.AQUA).append("&b Aqua").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.DARK_AQUA).append("&3 Dunkel Aqua").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.DARK_BLUE).append("&1 Dunkelblau").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.BLUE).append("&9 Blau").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.LIGHT_PURPLE).append("&d Hellpink").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.DARK_PURPLE).append("&5 Dunkles Pink").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.WHITE).append("&f Wei\337").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.GRAY).append("&7 Grau").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.DARK_GRAY).append("&8 Dunkel Grau").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.BLACK).append("&0 Schwarz").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.GREEN).append("&k Chaos " + ChatColor.MAGIC + "123123123123").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.BOLD).append("&b Fett ").toString());
            p.sendMessage((new StringBuilder()).append(ChatColor.ITALIC).append("&i Kursiv ").toString());
        }
        return true;
    }

    Command cmd;
    String args[];
    Player p;
    survivalplugin plugin;
    Player target;
}
