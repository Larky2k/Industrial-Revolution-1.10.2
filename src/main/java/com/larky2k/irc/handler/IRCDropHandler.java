package com.larky2k.irc.handler;

import java.util.Random;

import com.larky2k.irc.init.IRCInitBlocks;
import com.larky2k.irc.init.IRCInitItems;
import com.larky2k.irc.items.tools.IRCFlintPickaxe;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class IRCDropHandler {
	
	@SubscribeEvent
	public void addBlockDrop (HarvestDropsEvent event) {
		if (event.getState().getBlock() == Blocks.COAL_ORE){
			
			Random rand = new Random();
			
			ItemStack holding = event.getHarvester().inventory.getStackInSlot(event.getHarvester().inventory.currentItem);
			if (holding != null && holding.getItem() instanceof ItemPickaxe){	
				event.getDrops().add(new ItemStack(IRCInitItems.coalDust, rand.nextInt(4)));
			}	
		}
	}

}	

