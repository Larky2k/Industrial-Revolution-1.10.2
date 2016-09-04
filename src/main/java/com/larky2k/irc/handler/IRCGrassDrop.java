package com.larky2k.irc.handler;

import com.larky2k.irc.init.IRCInitItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class IRCGrassDrop {

	public static void grassDrop(){
	MinecraftForge.addGrassSeed(new ItemStack(IRCInitItems.plantFibre), 20);
	MinecraftForge.addGrassSeed(new ItemStack(Items.STICK), 20);
	}
}
