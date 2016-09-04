package com.larky2k.irc.blocks.ores;

import java.util.Random;

import com.larky2k.irc.init.IRCInitBlocks;
import com.larky2k.irc.init.IRCInitItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class slate extends Block{

	public slate(Material materialIn, String name, CreativeTabs tab) {
		super(materialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		this.setHardness(1.5F);
		this.setResistance(7.5F);
		this.setHarvestLevel("pickaxe", 0);
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this ==  IRCInitBlocks.slate? IRCInitItems.slateSlab : Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random random) {
		return this == IRCInitBlocks.slate? 4 +random.nextInt(8): 1;	
	}	
}
