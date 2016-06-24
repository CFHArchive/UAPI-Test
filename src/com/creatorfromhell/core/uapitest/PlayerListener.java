package com.creatorfromhell.core.uapitest;

import com.creatorfromhell.core.uapi.event.EventHandler;
import com.creatorfromhell.core.uapi.event.UListener;
import com.creatorfromhell.core.uapi.event.player.PlayerJoinEvent;

public class PlayerListener implements UListener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		System.out.println("[UAPITest]" + event.getPlayer().getDisplayName() + "joined");
	}
}