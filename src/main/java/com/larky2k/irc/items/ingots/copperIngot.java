package com.larky2k.irc.items.ingots;

import com.larky2k.irc.IRCGlobal;
import com.larky2k.irc.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class copperIngot extends Item {
	
	public copperIngot(String name, CreativeTabs tab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);
	}
	
}
