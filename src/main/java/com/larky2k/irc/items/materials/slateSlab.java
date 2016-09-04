package com.larky2k.irc.items.materials;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class slateSlab extends Item {
	
	public slateSlab(String name, CreativeTabs tab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);
	}

}
