package me.sowhatsminecraft.BuildUHC.items;

import me.sowhatsminecraft.BuildUHC.main.FFA;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.enchantments.Enchantment;
import java.util.Random;

public class Melee implements CommandExecutor {
	private FFA plugin;
	public Melee (FFA plugin) {
		this.plugin = plugin;
		plugin.getCommand("kit").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
		}
		Player p = (Player) sender;
		if (p.hasPermission("op")) {
			Random rand = new Random();
			int upperbound = 9;
			int melee = rand.nextInt(upperbound);
			switch (melee) {
				case 0:
					ItemStack iron0 = new ItemStack(Material.IRON_SWORD);
					p.getInventory().addItem(iron0);
					break;
				case 1:
					ItemStack iron1 = new ItemStack(Material.IRON_SWORD);
					iron1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
					p.getInventory().addItem(iron1);
					break;
				case 2:
					ItemStack iron2 = new ItemStack(Material.IRON_SWORD);
					iron2.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
					p.getInventory().addItem(iron2);
					break;
				case 3:
					ItemStack iron3 = new ItemStack(Material.IRON_SWORD);
					iron3.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
					p.getInventory().addItem(iron3);
					break;
				case 4:
					ItemStack iron4 = new ItemStack(Material.IRON_SWORD);
					iron4.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
					p.getInventory().addItem(iron4);
					break;
				case 5:
					ItemStack diamond0 = new ItemStack(Material.DIAMOND_SWORD);
					p.getInventory().addItem(diamond0);
					break;
				case 6:
					ItemStack diamond1 = new ItemStack(Material.DIAMOND_SWORD);
					diamond1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
					p.getInventory().addItem(diamond1);
					break;
				case 7:
					ItemStack diamond2 = new ItemStack(Material.DIAMOND_SWORD);
					diamond2.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
					p.getInventory().addItem(diamond2);
					break;
				case 8:
					ItemStack diamond3 = new ItemStack(Material.DIAMOND_SWORD);
					diamond3.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
					p.getInventory().addItem(diamond3);
					break;
				case 9:
					ItemStack diamond4 = new ItemStack(Material.DIAMOND_SWORD);
					diamond4.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
					p.getInventory().addItem(diamond4);
					break;
			
		}
		} else {
			p.sendMessage("You do not have permission");
		} return false;
			
		
				
				
				
				
				
				
				
		
		
		
	}

}
