package me.sowhatsminecraft.BuildUHC.items;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

import me.sowhatsminecraft.BuildUHC.main.FFA;

public class Blocks implements CommandExecutor {
	
	private FFA plugin;
	public Blocks (FFA plugin) {
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
			ItemStack wood = new ItemStack(Material.LOG, 48);
			ItemStack cobble = new ItemStack(Material.COBBLESTONE, 128);
			p.getInventory().addItem(wood);
			p.getInventory().addItem(cobble);
			ItemStack water = new ItemStack(Material.WATER_BUCKET);
			ItemStack lava = new ItemStack(Material.LAVA_BUCKET);
			p.getInventory().addItem(water);
			p.getInventory().addItem(water);
			p.getInventory().addItem(water);
			p.getInventory().addItem(lava);
			p.getInventory().addItem(lava);
			ItemStack anvil = new ItemStack(Material.ANVIL);
			ItemStack etable = new ItemStack(Material.ENCHANTMENT_TABLE);
			ItemStack books = new ItemStack(Material.BOOK, 3);
			p.getInventory().addItem(anvil);
			p.getInventory().addItem(etable);
			p.getInventory().addItem(books);
			ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemStack axe = new ItemStack(Material.IRON_AXE);
			p.getInventory().addItem(pick);
			p.getInventory().addItem(axe);	
		} else {
			p.sendMessage("You do not have permission!");
		} return false;
	}

}
