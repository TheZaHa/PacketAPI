package com.gmail.thezaha;

/**
 *  Coming Soon ;) - For the present hidden ...
 **/

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *  Coming Soon ;) - For the present hidden ...
 **/

import com.gmail.thezaha.utils.Reflection;;

public class Main extends JavaPlugin {
	
	private Main plugin;
	public Main getPlugin() { return plugin; }
	
	@Override
	public void onDisable() {
		this.plugin = null;
                super.onDisable();
	}
	
	@Override
	public void onEnable() {
		this.plugin = this;
		Reflection.setVersion(Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3]);
		super.onEnable();
	}
	package com.gmail.thezaha;

/**
 *  Coming Soon ;) - For the present hidden ...
 **/

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *  Coming Soon ;) - For the present hidden ...
 **/

import com.gmail.thezaha.utils.Reflection;;

public class Main extends JavaPlugin {

	public static void main(String[] args) {
	}
	
	private Main plugin;
	public Main getPlugin() { return plugin; }
	
	@Override
	public void onDisable() {
		this.plugin = null;
		super.onDisable();
	}
	
	/**
 	*  Coming Soon ;) - For the present hidden ...
 	**/
	
	@Override
	public void onEnable() {
		this.plugin = this;
		Reflection.setVersion(Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3]);
		super.onEnable();
	}
	@Override
	public boolean onCommand (CommandSender sender, Command command,
			String label, String[] args) {
		if(!command.getName().equalsIgnoreCase("test")) return false;
		Player p = (Player) sender;
		String gracz = "test";
		
		if(args.length == 1) {
			if(args[0].equalsIgnoreCase("create")){
				/**
				 *  Coming Soon ;) - For the present hidden ...
				 **/
			}
			else if(args[0].equalsIgnoreCase("remove")){
				/**
				 *  Coming Soon ;) - For the present hidden ...
				 **/
			}
		}
		
		return super.onCommand(sender, command, label, args);
	}
}
	@Override
	public boolean onCommand (CommandSender sender, Command command,
			String label, String[] args) {
		if(!command.getName().equalsIgnoreCase("test")) return false;
		Player p = (Player) sender;
		String gracz = "test";
		
		if(args.length == 1) {
			if(args[0].equalsIgnoreCase("create")){
				/**
				 *  Coming Soon ;) - For the present hidden ...
				 **/
			}
			else if(args[0].equalsIgnoreCase("remove")){
				/**
				 *  Coming Soon ;) - For the present hidden ...
				 **/
			}
		}
		
		return super.onCommand(sender, command, label, args);
	}
}
