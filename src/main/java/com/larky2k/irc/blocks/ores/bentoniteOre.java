package com.larky2k.irc.blocks.ores;

import java.util.Random;

import com.larky2k.irc.init.IRCInitBlocks;
import com.larky2k.irc.init.IRCInitItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class bentoniteOre extends Block{
	
	public bentoniteOre(Material materialIn, String name, CreativeTabs tab) {
		super(materialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		this.setHarvestLevel("pickaxe", 1);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this == IRCInitBlocks.bentoniteOre ? IRCInitItems.bentoniteDust : Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random random) {
		return this == IRCInitBlocks.bentoniteOre ? 1 + random.nextInt(2) : 1;	
	}	
}
