package com.larky2k.irc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class steelBlock extends Block {

	public steelBlock(Material materialIn, String name, CreativeTabs tab) {
		super(materialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		
	}
	
}
