package me.sowhatsminecraft.BuildUHC.items;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.sowhatsminecraft.BuildUHC.main.FFA;

public class Arrows implements CommandExecutor {
	private FFA plugin;
	public Arrows (FFA plugin) {
		this.plugin = plugin;
		plugin.getCommand("kit").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
		}
		Player p = (Player) sender;
		if (p.hasPermission("op")) {
			Random rand = new Random();
			int upperbound = 52;
			int arrows = rand.nextInt(upperbound);
			ItemStack ammo = new ItemStack(Material.ARROW, (arrows+12));
			p.getInventory().addItem(ammo);
			
		} else {
			p.sendMessage("You do not have permission!");
		} return false;
		
	}

}
