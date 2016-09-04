package com.larky2k.irc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class forgingSand extends Block{
	
	public forgingSand(Material materialIn, String name, CreativeTabs tab) {
		super(materialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setSoundType(SoundType.SAND);
		
	}

}
