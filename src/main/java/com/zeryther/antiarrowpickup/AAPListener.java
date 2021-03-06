package com.zeryther.antiarrowpickup;

import org.bukkit.Bukkit;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class AAPListener implements Listener {

	public AAPListener() {
		Bukkit.getPluginManager().registerEvents(this, AAPPlugin.getInstance());
	}
	
	@EventHandler
	public void onProjectileHit(ProjectileHitEvent e){
		if(e.getEntity().getType() == EntityType.ARROW || e.getEntity().getType() == EntityType.SPECTRAL_ARROW || e.getEntity().getType() == EntityType.TIPPED_ARROW){
			e.getEntity().remove();
		}
	}

}
