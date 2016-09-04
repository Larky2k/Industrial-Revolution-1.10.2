package com.larky2k.irc.items.materials;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class stoneBowl extends Item {
	
	public stoneBowl(String name, CreativeTabs tab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);
	}

}
