package com.herocraftonline.squallseed31.heroicdeath;

import org.bukkit.event.*;

public class HeroicDeathEvent extends Event implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private DeathCertificate dc;
	private boolean cancel;
	
	public HeroicDeathEvent(DeathCertificate dc)
	{
		this.dc = dc;
		this.cancel = false;
	}

	public DeathCertificate getDeathCertificate() {
		return dc;
	}

	public void setDeathCertificate(DeathCertificate dc) {
		this.dc = dc;
	}
	
	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
}
