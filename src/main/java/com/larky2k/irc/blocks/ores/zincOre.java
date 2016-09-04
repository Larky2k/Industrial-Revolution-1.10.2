package com.larky2k.irc.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class zincOre extends Block {
	
	public zincOre(Material materialIn, String name, CreativeTabs tab) {
		super(materialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		this.setHarvestLevel("pickaxe", 1);
		
	}

}
