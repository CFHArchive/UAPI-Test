package com.creatorfromhell.core.uapitest;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UServer;

public class UAPITest implements UPlugin {

	@Override
	public void onDisable() {
		System.out.println("[UAPITest]Plugin enabled!");
	}

	@Override
	public void onEnable(UServer server) {
		System.out.println("[UAPITest]Plugin enabled!");
		server.getLoader().getEventFactory().registerListener(new PlayerListener());
	}

}