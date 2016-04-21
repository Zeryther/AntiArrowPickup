package com.zeryther.antiarrowpickup;

import org.bukkit.plugin.java.JavaPlugin;

public class AAPPlugin extends JavaPlugin {

	private static AAPPlugin instance;
	
	public AAPPlugin() {
		instance = this;
		
		registerListeners();
	}
	
	public static AAPPlugin getInstance(){
		return instance;
	}
	
	private void registerListeners(){
		new AAPListener();
	}

}
