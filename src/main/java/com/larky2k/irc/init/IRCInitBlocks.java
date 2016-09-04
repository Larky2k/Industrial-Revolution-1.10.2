package com.larky2k.irc.init;

import com.larky2k.irc.IRCGlobal;
import com.larky2k.irc.blocks.copperBlock;
import com.larky2k.irc.blocks.steelBlock;
import com.larky2k.irc.blocks.zincBlock;
import com.larky2k.irc.blocks.ores.*;
import com.larky2k.irc.blocks.forgingSand;
import com.larky2k.irc.blocks.storage.crate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IRCInitBlocks {
	
	//public static Block
	
	//Ores
	public static Block copperOre;
	public static Block bentoniteOre;
	public static Block zincOre;
	public static Block slate;
	
	//Blocks
	public static Block copperBlock;
	public static Block zincBlock;
	public static Block steelBlock;
	public static Block forgingSand;
	
	//Storage
	public static Block crate;
	
	public static void init() {
		
		//Ores
		copperOre = new copperOre(Material.ROCK, "copperOre", IRCGlobal.ircCreativeTab);
		bentoniteOre = new bentoniteOre(Material.ROCK, "bentoniteOre", IRCGlobal.ircCreativeTab);
		zincOre = new zincOre(Material.ROCK, "zincOre", IRCGlobal.ircCreativeTab);
		slate = new slate(Material.ROCK, "slate", IRCGlobal.ircCreativeTab);
		
		//Blocks
		copperBlock = new copperBlock(Material.IRON, "copperBlock", IRCGlobal.ircCreativeTab);
		zincBlock = new zincBlock(Material.IRON, "zincBlock", IRCGlobal.ircCreativeTab);
		steelBlock = new steelBlock(Material.IRON, "steelBlock", IRCGlobal.ircCreativeTab);
		forgingSand = new forgingSand(Material.SAND, "forgingSand", IRCGlobal.ircCreativeTab);
		
		//Storage
		crate = new crate(Material.WOOD, "crate", 0, IRCGlobal.ircCreativeTab);
		register();
	}
	
	public static void register() {
		
		//registerBlock();
		
		//Ores
		registerBlock(copperOre);
		registerBlock(bentoniteOre);
		registerBlock(zincOre);
		registerBlock(slate);
		
		//Blocks
		registerBlock(copperBlock);
		registerBlock(zincBlock);
		registerBlock(steelBlock);
		registerBlock(forgingSand);
		
		//Stroage
		registerBlock(crate);
		
	}
	
	public static void render() {
		
		//renderItem(Item.getItemFromBlock());
		
		//Ores
		renderItem(Item.getItemFromBlock(copperOre));
		renderItem(Item.getItemFromBlock(bentoniteOre));
		renderItem(Item.getItemFromBlock(zincOre));
		renderItem(Item.getItemFromBlock(slate));
		
		//Blocks
		renderItem(Item.getItemFromBlock(copperBlock));
		renderItem(Item.getItemFromBlock(zincBlock));
		renderItem(Item.getItemFromBlock(steelBlock));
		renderItem(Item.getItemFromBlock(forgingSand));
		//Storage
		renderItem(Item.getItemFromBlock(crate));
		
	}
	
	public static void renderItem(Item item) {
	
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	
	}
	
	private static void registerBlock(Block block) {
		
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		
	}

}
