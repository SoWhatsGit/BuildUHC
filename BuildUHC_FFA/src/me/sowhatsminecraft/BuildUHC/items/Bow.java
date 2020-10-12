package me.sowhatsminecraft.BuildUHC.items;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.sowhatsminecraft.BuildUHC.main.FFA;

public class Bow implements CommandExecutor {
	private FFA plugin;
	public Bow (FFA plugin) {
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
			int upperbound = 4;
			int ranged = rand.nextInt(upperbound);
			switch (ranged) {
				case 0:
					ItemStack bow = new ItemStack(Material.BOW);
					p.getInventory().addItem(bow);
					break;
				case 1:
					ItemStack bow1 = new ItemStack(Material.BOW);
					bow1.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
					p.getInventory().addItem(bow1);
					break;
				case 2:
					ItemStack bow2 = new ItemStack(Material.BOW);
					bow2.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
					p.getInventory().addItem(bow2);
					break;
				case 3:
					ItemStack bow3 = new ItemStack(Material.BOW);
					bow3.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
					p.getInventory().addItem(bow3);
					break;
				case 4:
					ItemStack bow4 = new ItemStack(Material.BOW);
					bow4.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
					p.getInventory().addItem(bow4);
			}
		} else {
			p.sendMessage("You do not have permission!");
		} return false;
		
	}

	
}
