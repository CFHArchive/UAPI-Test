package com.creatorfromhell.core.uapitest;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UServer;

public class UAPITest implements UPlugin {

	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable(UServer server) {
		server.getLoader().getEventFactory().registerListener(new PlayerListener());
	}

}