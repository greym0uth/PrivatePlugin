package com.Grey.plugin;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	Player pl;
	Kick p;
	Thread kick;
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled.");
		
	}
	
	@Override
	public void onEnable() {
		
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled.");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		pl = (Player) sender;
		
		p = new Kick(pl);
		kick = new Thread(p);
		
		if (commandLabel.equalsIgnoreCase("message")) {
			player.sendMessage(ChatColor.GOLD + "You're a message!");
			player.setHealth(0);
			kick.start();
			
		}
		
		return false;
		
	}

}
