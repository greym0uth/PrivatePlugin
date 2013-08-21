package com.Grey.plugin;

import org.bukkit.entity.Player;

public class Kick implements Runnable {
	
	Player pl;
	
	public Kick(Player pl) {
		this.pl = pl;
		
	}

	public void run() {
		try {
			Thread.sleep(5000);
			
			pl.kickPlayer("You're a message!");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
}
