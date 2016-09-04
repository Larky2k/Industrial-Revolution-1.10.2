package com.larky2k.irc;

import org.apache.logging.log4j.Logger;

import com.larky2k.irc.crafting.IRCRecipes;
import com.larky2k.irc.handler.IRCCraftingHandler;
import com.larky2k.irc.handler.IRCDropHandler;
import com.larky2k.irc.handler.IRCGrassDrop;
import com.larky2k.irc.init.IRCInitBlocks;
import com.larky2k.irc.init.IRCInitItems;
import com.larky2k.irc.init.IRCInitRecipeRemove;
import com.larky2k.irc.proxy.CommonProxy;
import com.larky2k.irc.world.IRCWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = IRCGlobal.MODID, name = IRCGlobal.MODNAME, version = IRCGlobal.VERSION, acceptedMinecraftVersions = IRCGlobal.MCVERSION)

public class Main {
	
	@Instance(IRCGlobal.MODID)
	public static Main instance;
	
	@SidedProxy(clientSide = IRCGlobal.IRC_CLIENT_PROXY, serverSide = IRCGlobal.IRC_SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		logger = event.getModLog();
		IRCInitItems.init();
		IRCInitBlocks.init();
		IRCInitRecipeRemove.Init();
		proxy.init();
		GameRegistry.registerWorldGenerator(new IRCWorldGen(), 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		IRCRecipes.initRecipes();
		IRCGrassDrop.grassDrop();
		
		MinecraftForge.EVENT_BUS.register(new IRCCraftingHandler());
		MinecraftForge.EVENT_BUS.register(new IRCDropHandler());
		MinecraftForge.EVENT_BUS.register(new IRCGrassDrop());
		
		proxy.event();
	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
