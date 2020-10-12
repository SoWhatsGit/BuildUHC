package me.sowhatsminecraft.BuildUHC.main;

import org.bukkit.plugin.java.JavaPlugin;

import me.sowhatsminecraft.BuildUHC.items.Arrows;
import me.sowhatsminecraft.BuildUHC.items.Blocks;
import me.sowhatsminecraft.BuildUHC.items.Bow;
import me.sowhatsminecraft.BuildUHC.items.Melee;
import me.sowhatsminecraft.BuildUHC.items.Stun;
import me.sowhatsminecraft.BuildUHC.items.XP;
import me.sowhatsminecraft.BuildUHC.items.armor.Helmet;

public class FFA extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new Melee(this);
		
		new Stun(this);
		
		new Bow(this);
		
		new Blocks(this);
		
		new XP(this);
		
		new Arrows(this);
		
		new Helmet(this);
		
		
	}

}
