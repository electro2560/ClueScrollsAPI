package com.electro2560.dev.cluescrolls.events;

import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Fired when a player completes a clue on one of their clue scrolls.
 * @since 2.1.0
 * @version 2.1.0
 */
public class PlayerClueCompletedEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;
	private String loreFormat;
	private String clueType;
	//private String data;
	//private String metadata;
	//Changed from int to double in v2.1.9
	private double amount;
	//private final int completed;
	
	//meta key : meta value
	Map<String, String> clueData;
	
	public PlayerClueCompletedEvent(final Player player, 
			final String loreFormat, final String clueType, /*final String data, final String metadata,*/ /*final int completed,*/ final double amount, Map<String, String> clueData){
		
		this.player = player;
		this.loreFormat = loreFormat;
		this.clueType = clueType;
		//this.data = data;
		//this.metadata = metadata;
		this.amount = amount;
		//this.completed = completed;
		this.clueData = clueData;
		
	}
	
	/**
	 * Returns the player involved in this event
	 * @return Player involved in this event
	 * @since 2.1.0
	 */
	public final Player getPlayer() {
		return player;
	}

	/**
	 * Returns lore format of clue as defined in the config
	 * <p>
	 * Example - &f* Kill %amount% skeleton: %completed%
	 * @return Lore format of clue
	 * @since 2.1.0
	 */
	public String getLoreFormat() {
		return loreFormat;
	}
	
	/**
	 * The type of the clue.
	 * <p>
	 * Example - break, place, enchant, fish, etc.
	 * @return Type of clue
	 * @since 2.1.0
	 */
	public String getClueType() {
		return clueType;
	}

	/**
	 * Returns the data of the clue as defined in the config
	 * @return Data of clue
	 * @since 2.1.0
	 */
	/*public String getData() {
		return data;
	}*/

	/**
	 * Returns the metadata of the clue as defined in the config
	 * @return Metadata of clue
	 * @since 2.1.0
	 */
	/*public String getMetadata() {
		return metadata;
	}*/

	/**
	 * Returns how many times the clue needed to be completed as defined in the config
	 * @return How many times the clue needed to be completed
	 * @since 2.1.0
	 */
	public double getAmount() {
		return amount;
	}
	
	/**
	 * Map of data key and data value as defined in config for that clue
	 * @return Map of keys and meta values from config that are on this clue
	 * @since 2.3.0
	 */
	public Map<String, String> getClueData(){
		return clueData;
	}
	
//	/**
//	 * Returns how many times the clue has been completed so far
//	 * @return How many times the clue has been completed 
//	 */
//	public final int getCompleted() {
//		return completed;
//	}
	
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
