package com.larky2k.irc.items.tools;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class IRCFlintSword extends ItemSword {

	public IRCFlintSword(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);
		
	}

}
