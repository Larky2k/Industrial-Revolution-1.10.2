package com.larky2k.irc.init;

import com.larky2k.irc.crafting.IRCRecipeRemover;

import net.minecraft.init.Items;

public class IRCInitRecipeRemove {
	
	public static void Init() {
		
		IRCRecipeRemover.RemoveCrafting(Items.WOODEN_AXE);
		IRCRecipeRemover.RemoveCrafting(Items.WOODEN_PICKAXE);
		IRCRecipeRemover.RemoveCrafting(Items.WOODEN_HOE);
		IRCRecipeRemover.RemoveCrafting(Items.WOODEN_SHOVEL);
		IRCRecipeRemover.RemoveCrafting(Items.WOODEN_SWORD);
	}

}
