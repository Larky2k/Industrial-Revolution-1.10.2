package com.larky2k.irc;

import com.larky2k.irc.init.IRCInitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IRCCreativeTab extends CreativeTabs {

	public IRCCreativeTab() {
		super("ircCreativeTab");
		setBackgroundImageName("ircCreativeTab.png");
	}
	
	@Override
	public Item getTabIconItem() {
		return IRCInitItems.copperIngot;
	}

}
