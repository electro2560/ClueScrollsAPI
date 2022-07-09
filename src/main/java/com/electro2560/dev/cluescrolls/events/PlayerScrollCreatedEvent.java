package com.electro2560.dev.cluescrolls.events;

import com.electro2560.dev.cluescrolls.api.CreationCause;
import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Fired when all the clues on a scroll have been completed issuing the rewards.
 * @since 4.8.6
 * @version 4.8.6
 */
public class PlayerScrollCreatedEvent extends ScrollEvent {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;

	private final CreationCause cause;

	public PlayerScrollCreatedEvent(final Player player, final String tierType, final UUID scrollUUID, final CreationCause cause){
		super(tierType, scrollUUID);

		this.player = player;
		this.cause = cause;
		
	}
	
	/**
	 * Returns the player involved in this event
	 * @return Player who is involved in this event
	 * @since 4.8.6
	 */
	public final Player getPlayer() {
		return player;
	}

	/**
	 * Retruns the cause of creation of this scroll
	 * @return Cause enum
	 * @since 4.8.6
	 */
	public final CreationCause getCause() { return cause; }
	
	//********************************************************************************************************************
	
	public HandlerList getHandlers() {
	    return handlers;
	}
	
	public static HandlerList getHandlerList() {
	    return handlers;
	}

}
