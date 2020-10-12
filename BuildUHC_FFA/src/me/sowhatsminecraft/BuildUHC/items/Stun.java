package me.sowhatsminecraft.BuildUHC.items;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.sowhatsminecraft.BuildUHC.main.FFA;

public class Stun implements CommandExecutor {
	private FFA plugin;
	public Stun (FFA plugin) {
		this.plugin = plugin;
		plugin.getCommand("kit").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
		}
		Player p = (Player) sender;
		if (p.hasPermission("op")) {
			Random rand = new Random();
			int upperbound = 1;
			int stun = rand.nextInt(upperbound);
			switch (stun) {
				case 0:
					ItemStack rod = new ItemStack(Material.FISHING_ROD);
					p.getInventory().addItem(rod);
					break;
				case 1:
					ItemStack snowballs = new ItemStack(Material.SNOW_BALL, 64);
					p.getInventory().addItem(snowballs);
					break;
			}
		} else {
			p.sendMessage("You do not have permission!");
		} return false;
		
	}

}
