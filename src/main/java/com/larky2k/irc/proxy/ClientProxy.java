package com.larky2k.irc.proxy;

import com.larky2k.irc.init.IRCInitBlocks;
import com.larky2k.irc.init.IRCInitItems;
import com.larky2k.irc.world.IRCWorldGen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		
		IRCInitItems.render();
		IRCInitBlocks.render();
	}

	@Override
	public void event() {}
	
}
