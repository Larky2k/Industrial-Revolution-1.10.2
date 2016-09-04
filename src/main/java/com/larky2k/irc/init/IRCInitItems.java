package com.larky2k.irc.init;

import com.larky2k.irc.IRCGlobal;
import com.larky2k.irc.items.ingots.copperIngot;
import com.larky2k.irc.items.ingots.steelIngot;
import com.larky2k.irc.items.ingots.zincIngot;
import com.larky2k.irc.items.materials.bentoniteClay;
import com.larky2k.irc.items.materials.bentoniteDust;
import com.larky2k.irc.items.materials.coalDust;
import com.larky2k.irc.items.materials.flintBlade;
import com.larky2k.irc.items.materials.handle;
import com.larky2k.irc.items.materials.plantFibre;
import com.larky2k.irc.items.materials.slateSlab;
import com.larky2k.irc.items.materials.stoneBowl;
import com.larky2k.irc.items.plates.copperPlate;
import com.larky2k.irc.items.plates.ironPlate;
import com.larky2k.irc.items.plates.steelPlate;
import com.larky2k.irc.items.tools.IRCFlintAxe;
import com.larky2k.irc.items.tools.IRCFlintHoe;
import com.larky2k.irc.items.tools.IRCFlintPickaxe;
import com.larky2k.irc.items.tools.IRCFlintSpade;
import com.larky2k.irc.items.tools.IRCFlintSword;
import com.larky2k.irc.items.tools.IRCPestleMortar;
import com.larky2k.irc.items.tools.IRCblacksmithHammer;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IRCInitItems {
	
	//public static Item ;
	
	//Tools Material
	public static ToolMaterial FLINTTOOLS = EnumHelper.addToolMaterial("FLINTTOOLS", 1, 200, 6.0F, 2.0F, 6);
	public static ToolMaterial IRONTOOL = EnumHelper.addToolMaterial("IRONTOOL", 3, 700, 12.0F, 8.0F, 12);
	
	//Ingots
	public static Item copperIngot;
	public static Item zincIngot;
	public static Item steelIngot;
	
	//Plates
	public static Item copperPlate;
	public static Item ironPlate;
	public static Item steelPlate;
	
	//Materials
	public static Item bentoniteClay;
	public static Item bentoniteDust;
	public static Item coalDust;
	public static Item slateSlab;
	public static Item plantFibre;
	public static Item handle;
	public static Item flintBlade;
	public static Item stoneBowl;
	
	//Tools
	public static Item blacksmithHammer;
	public static Item flintAxe;
	public static Item flintHoe;
	public static Item flintPickaxe;
	public static Item flintSpade;
	public static Item flintSword;
	public static Item pestleMortar;
	
	public static void init() {
		
		// = new ("", IRCGlobal.ircCreativeTab);
		
		//Ingots
		copperIngot = new copperIngot("copperIngot", IRCGlobal.ircCreativeTab);
		zincIngot = new zincIngot("zincIngot", IRCGlobal.ircCreativeTab);
		steelIngot = new steelIngot("steelIngot", IRCGlobal.ircCreativeTab);
		
		//Plates
		copperPlate = new copperPlate("copperPlate", IRCGlobal.ircCreativeTab);
		ironPlate = new ironPlate("ironPlate", IRCGlobal.ircCreativeTab);
		steelPlate = new steelPlate("steelPlate", IRCGlobal.ircCreativeTab);
		
		//Materials
		plantFibre = new plantFibre("plantFibre", IRCGlobal.ircCreativeTab);
		handle = new handle("handle", IRCGlobal.ircCreativeTab);
		bentoniteDust = new bentoniteDust("bentoniteDust", IRCGlobal.ircCreativeTab);
		bentoniteClay = new bentoniteClay("bentoniteClay", IRCGlobal.ircCreativeTab);
		slateSlab = new slateSlab("slateSlab", IRCGlobal.ircCreativeTab);
		coalDust = new coalDust("coalDust", IRCGlobal.ircCreativeTab);
		flintBlade = new flintBlade("flintBlade", IRCGlobal.ircCreativeTab);
		stoneBowl = new stoneBowl("stoneBowl", IRCGlobal.ircCreativeTab);
		
		//Tools
		blacksmithHammer = new IRCblacksmithHammer("blacksmithHammer", IRCGlobal.ircCreativeTab);
		flintAxe = new IRCFlintAxe ("flintAxe", FLINTTOOLS , IRCGlobal.ircCreativeTab);
		flintHoe = new IRCFlintHoe("flintHoe", FLINTTOOLS, IRCGlobal.ircCreativeTab);
		flintPickaxe = new IRCFlintPickaxe("flintPickaxe", FLINTTOOLS, IRCGlobal.ircCreativeTab);
		flintSpade = new IRCFlintSpade("flintSpade", FLINTTOOLS, IRCGlobal.ircCreativeTab);
		flintSword = new IRCFlintSword("flintSword", FLINTTOOLS, IRCGlobal.ircCreativeTab);
		pestleMortar = new IRCPestleMortar("pestleMortar", IRCGlobal.ircCreativeTab);
		
		register();
	}
	
	public static void register() {
		
		//GameRegistry.register();
		
		//Ingots
		GameRegistry.register(copperIngot);
		GameRegistry.register(zincIngot);
		GameRegistry.register(steelIngot);
		
		//Plates
		GameRegistry.register(copperPlate);
		GameRegistry.register(ironPlate);
		GameRegistry.register(steelPlate);
		
		//Materials
		GameRegistry.register(plantFibre);
		GameRegistry.register(handle);
		GameRegistry.register(bentoniteDust);
		GameRegistry.register(bentoniteClay);
		GameRegistry.register(slateSlab);
		GameRegistry.register(coalDust);
		GameRegistry.register(flintBlade);
		GameRegistry.register(stoneBowl);
		
		//Tools
		GameRegistry.register(blacksmithHammer);
		GameRegistry.register(flintAxe);
		GameRegistry.register(flintHoe);
		GameRegistry.register(flintPickaxe);
		GameRegistry.register(flintSpade);
		GameRegistry.register(flintSword);
		GameRegistry.register(pestleMortar);
		
	}
	
	public static void render() {
	
		//renderItem();
		
		//Ingots
		renderItem(copperIngot);
		renderItem(zincIngot);
		renderItem(steelIngot);
		
		//Plates
		renderItem(copperPlate);
		renderItem(ironPlate);
		renderItem(steelPlate);
		
		//Materials
		renderItem(plantFibre);
		renderItem(handle);
		renderItem(bentoniteDust);
		renderItem(bentoniteClay);
		renderItem(slateSlab);
		renderItem(coalDust);
		renderItem(flintBlade);
		renderItem(stoneBowl);
		
		//Tools
		renderItem(blacksmithHammer);
		renderItem(flintAxe);
		renderItem(flintHoe);
		renderItem(flintPickaxe);
		renderItem(flintSpade);
		renderItem(flintSword);
		renderItem(pestleMortar);
		
	}
	
	private static void renderItem(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
