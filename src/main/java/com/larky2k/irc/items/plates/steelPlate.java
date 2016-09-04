package com.larky2k.irc.items.plates;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class steelPlate extends Item {
	
	public steelPlate(String name, CreativeTabs tab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);
	}

}
