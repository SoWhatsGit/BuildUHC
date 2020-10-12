package me.sowhatsminecraft.BuildUHC.items.armor;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.sowhatsminecraft.BuildUHC.main.FFA;

public class Helmet implements CommandExecutor{
	private FFA plugin;
	public Helmet (FFA plugin){
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
			int upperbound = 7;
			int helmet = rand.nextInt(upperbound);
			switch (helmet) {
				case 0:
					ItemStack iron0 = new ItemStack(Material.IRON_HELMET);
					p.getInventory().addItem(iron0);
					break;
					
			}
		} else {
			p.sendMessage("You do not have permission!");
		} return false;
		
	}

}
