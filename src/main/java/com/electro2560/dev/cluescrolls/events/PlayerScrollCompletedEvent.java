package com.electro2560.dev.cluescrolls.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Fired when all the clues on a scroll have been completed issuing the rewards.
 * @since 2.1.0
 * @version 2.1.0
 */
public class PlayerScrollCompletedEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;
	private String tierType;
	private int completedClues;
	
	public PlayerScrollCompletedEvent(final Player player, final String tierType, final int compeltedClues){
		
		this.player = player;
		
		this.tierType = tierType;
		this.completedClues = compeltedClues;
		
	}
	
	/**
	 * Returns the player involved in this event
	 * @return Player who is involved in this event
	 * @since 2.1.0
	 */
	public final Player getPlayer() {
		return player;
	}
	
	/**
	 * Returns the tier type as a string of the completed scroll
	 * @return Tier type
	 * @since 2.1.0
	 */
	public String getTierType() {
		return tierType;
	}

	/**
	 * Get the amount of clues that were on this scroll
	 * @return Clues completed
	 * @since 2.1.0
	 */
	public int getCompletedClues() {
		return completedClues;
	}
	
	//********************************************************************************************************************
	
	@Deprecated
	public HandlerList getHandlers() {
	    return handlers;
	}
	
	@Deprecated
	public static HandlerList getHandlerList() {
	    return handlers;
	}

}
