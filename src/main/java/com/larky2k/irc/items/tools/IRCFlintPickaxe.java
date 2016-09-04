package com.larky2k.irc.items.tools;

import com.larky2k.irc.IRCGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class IRCFlintPickaxe extends ItemPickaxe {

	public IRCFlintPickaxe (String name, ToolMaterial material, CreativeTabs tab){
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(IRCGlobal.MODID, name);
		this.setCreativeTab(tab);
	}
}
