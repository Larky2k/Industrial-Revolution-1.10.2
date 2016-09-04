package com.larky2k.irc.crafting;

import com.larky2k.irc.init.IRCInitBlocks;
import com.larky2k.irc.init.IRCInitItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class IRCRecipes {

	public static void initRecipes(){
		
		//Recipe
		
			//Tools and weapons
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.flintPickaxe), new Object [] { "Fp",	"HF", 'F', Items.FLINT, 'p', IRCInitItems.plantFibre, 'H', IRCInitItems.handle });
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.flintAxe), new Object [] { "Fp",	"H ", 'F', Items.FLINT, 'p', IRCInitItems.plantFibre, 'H', IRCInitItems.handle });
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.flintSpade), new Object [] { " F ",	" p ", " H ", 'F', Items.FLINT, 'p', IRCInitItems.plantFibre, 'H', IRCInitItems.handle });
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.flintHoe), new Object [] { "FF ",	" p ", " H ", 'F', Items.FLINT,	'p', IRCInitItems.plantFibre, 'H', IRCInitItems.handle });
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.flintSword), new Object [] { " S ",	" p ", " H ", 'S', IRCInitItems.flintBlade, 'p', IRCInitItems.plantFibre, 'H', IRCInitItems.handle	});
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.blacksmithHammer), new Object [] { "III", "IpI", " h ", 'I', Items.IRON_INGOT, 'p', IRCInitItems.plantFibre, 'h', IRCInitItems.handle });
			
			//Blade
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.flintBlade), new Object [] { "F",	"F", 'F', Items.FLINT });
		
			//Blocks
			GameRegistry.addRecipe(new ItemStack(IRCInitBlocks.copperBlock), new Object [] { "###",	"###", "###", '#', IRCInitItems.copperIngot	});
			GameRegistry.addRecipe(new ItemStack(IRCInitBlocks.steelBlock), new Object [] { "###",	"###", "###", '#', IRCInitItems.steelIngot	});
		
			//Coal dust
			GameRegistry.addRecipe(new ItemStack (Items.COAL, 1), new Object []{ "CC", "CC", 'C', IRCInitItems.coalDust });
		
			//Materials
			GameRegistry.addRecipe(new ItemStack (IRCInitItems.handle), new Object [] { " S", "S ", 'S', Items.STICK });
			
			//Misc
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.stoneBowl), new Object [] { "   ", "c c", " c ", 'c', Blocks.STONE_SLAB });
			GameRegistry.addRecipe(new ItemStack(IRCInitItems.pestleMortar), new Object [] { " s ",	"c  ", "S  ", 's', Items.STICK , 'c', Blocks.COBBLESTONE , 'S', IRCInitItems.stoneBowl });
				
		//Shapeless Recipe
			//Blocks -> Ingot's
			GameRegistry.addShapelessRecipe(new ItemStack(IRCInitItems.copperIngot, 9), new Object[]{ IRCInitBlocks.copperBlock });
			GameRegistry.addShapelessRecipe(new ItemStack(IRCInitItems.steelIngot, 9), new Object[]{ IRCInitBlocks.steelBlock });
			
			//Ingots -> Plate
			GameRegistry.addShapelessRecipe(new ItemStack(IRCInitItems.ironPlate, 1), new Object[]{ Items.IRON_INGOT, new ItemStack(IRCInitItems.blacksmithHammer, 1, OreDictionary.WILDCARD_VALUE) });
			GameRegistry.addShapelessRecipe(new ItemStack(IRCInitItems.copperPlate, 1), new Object[]{ IRCInitItems.copperIngot, new ItemStack(IRCInitItems.blacksmithHammer, 1, OreDictionary.WILDCARD_VALUE) });
			GameRegistry.addShapelessRecipe(new ItemStack(IRCInitItems.steelPlate, 1), new Object[]{ IRCInitItems.steelIngot, new ItemStack(IRCInitItems.blacksmithHammer, 1, OreDictionary.WILDCARD_VALUE) });
			
			//Forging
			GameRegistry.addShapelessRecipe(new ItemStack(IRCInitItems.bentoniteClay, 1), new Object [] { new ItemStack(IRCInitItems.bentoniteDust, 1), Items.CLAY_BALL });
			GameRegistry.addShapelessRecipe(new ItemStack(IRCInitBlocks.forgingSand, 1), new Object []{	new ItemStack(IRCInitItems.bentoniteClay, 1), IRCInitItems.coalDust, Blocks.SAND, Items.WATER_BUCKET });
			//GameRegistry.addRecipe(new ItemStack(IRCInitBlocks.bloomeryIdle), new Object [] { "bbb", "bfb", "ccc", 'b', Items.BRICK, 'f', Blocks.FURNACE , 'c', Blocks.COBBLESTONE});
			
			//Fuel
			GameRegistry.addShapelessRecipe(new ItemStack (IRCInitItems.coalDust, 4), new Object []{ Items.COAL	});
		
			//Food
			//GameRegistry.addShapelessRecipe(new ItemStack(IRCInitItems.foodFlour, 4), new Object[]{ Items.WHEAT, new ItemStack(IRCInitItems.pestleMortar, 1, OreDictionary.WILDCARD_VALUE) });
			//GameRegistry.addShapelessRecipe(new ItemStack (IRCInitItems.foodDough, 1), new Object []{ new ItemStack (IRCInitItems.foodFlour, 1), Items.WATER_BUCKET });
			//GameRegistry.addShapelessRecipe(new ItemStack (IRCInitItems.uncookedPasty, 1), new Object []{ new ItemStack (IRCInitItems.foodSwede, 1), IRCInitItems.beefSkirt, IRCInitItems.foodDough, Items.CARROT });
			//GameRegistry.addShapelessRecipe(new ItemStack (IRCInitItems.beefSkirt, 1), new Object []{ Items.BEEF, new ItemStack (Items.SHEARS, 2, OreDictionary.WILDCARD_VALUE) });
			
			//Misc
			GameRegistry.addShapelessRecipe(new ItemStack (Items.FLINT, 2), new Object []{ Blocks.GRAVEL });
		
	}

}	
	
	

