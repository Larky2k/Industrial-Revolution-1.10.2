package com.larky2k.irc.items.tools;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IRCblacksmithHammer extends Item {

	public IRCblacksmithHammer(String name, CreativeTabs tab) {
		super();
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.maxStackSize = 1;
		this.setMaxDamage(100);
		this.setNoRepair();
		this.setCreativeTab(tab);
	
	}

}
