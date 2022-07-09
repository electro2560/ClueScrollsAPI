package com.electro2560.dev.cluescrolls.events;

import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Fired when all the clues on a scroll have been completed issuing the rewards.
 * @since 2.1.0
 * @version 4.8.6
 */
public class PlayerScrollCompletedEvent extends ScrollEvent {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;
	private final int completedClues;
	private boolean cancelRewards = false;

	public PlayerScrollCompletedEvent(final Player player, final String tierType, final UUID scrollUUID, final int compeltedClues) {
		super(tierType, scrollUUID);

		this.player = player;
		
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
	 * Get the amount of clues that were on this scroll
	 * @return Clues completed
	 * @since 2.1.0
	 */
	public final int getCompletedClues() {
		return completedClues;
	}

	/**
	 * Players will not receive rewards if this is true.
	 * The scroll will be removed from the player as usual.
	 *
	 * @return true if the rewards have been cancelled
	 * @since 4.8.6
	 */
	public boolean isCancelRewards() {
		return cancelRewards;
	}

	/**
	 * Setting to true will not give the player rewards.
	 * The scroll will be removed from the player as usual.
	 *
	 * @param cancel true if you wish to cancel this event
	 * @since 4.8.6
	 */
	public void setCancelRewards(boolean cancel) {
		this.cancelRewards = cancel;
	}

	//********************************************************************************************************************
	
	public HandlerList getHandlers() {
	    return handlers;
	}
	
	public static HandlerList getHandlerList() {
	    return handlers;
	}

}
