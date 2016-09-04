package com.larky2k.irc.items.tools;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;


public class IRCFlintAxe extends ItemAxe {

	public IRCFlintAxe(String name, ToolMaterial material, CreativeTabs tab) {
		super(material, 2.0F, 6.0F);
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);

	}
	

}
