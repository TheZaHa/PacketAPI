package com.gmail.thezaha;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.thezaha.api.TabObject;

public class Main extends JavaPlugin {

//	public static void main(String[] args) {
//	}
	
	private Main plugin;
	public Main getPlugin() { return plugin; }
	
	@Override
	public void onDisable() {
		this.plugin = null;
		TabObject.destory();
		super.onDisable();
	}
	@Override
	public void onEnable() {
		this.plugin = this;
		super.onEnable();
	}
	
	
	@Override
	public boolean onCommand (CommandSender sender, Command command,
			String label, String[] args) {
		if(!command.getName().equalsIgnoreCase("test")) return false;
		Player p = (Player) sender;
		
		TabObject o = new TabObject();
		o.addSlot("§6--->>", "§aWelcome ! ^^", "§6<<---");
		o.addSlot("", "§c...", "");
		o.addSlot("", "Wsparcie 32 Znakow ^^ ...", "");
		o.addSlot("", "§aWitaj {player}".replace("{player}", p.getName()), "");
		
		if(args.length == 1) {
			if(args[0].equalsIgnoreCase("create")) {
				TabObject.setTab(p, o);
			}
			else if(args[0].equalsIgnoreCase("clear")) {
				TabObject.clearTab(p);
			}
			else if(args[0].equalsIgnoreCase("default")) {
				TabObject.defaultTab(p);
			}
		}
		return super.onCommand(sender, command, label, args);
	}
}
