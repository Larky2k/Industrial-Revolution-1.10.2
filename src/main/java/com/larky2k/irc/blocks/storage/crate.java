package com.larky2k.irc.blocks.storage;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class crate extends BlockContainer {
	
	public final int chestType;

	public crate(Material materialIn, String name, int type, CreativeTabs tab) {
		super(materialIn);
		this.chestType = type;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
