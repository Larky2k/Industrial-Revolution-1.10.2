package com.larky2k.irc.items.plates;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ironPlate extends Item {
	
	public ironPlate(String name, CreativeTabs tab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);
	}

}
