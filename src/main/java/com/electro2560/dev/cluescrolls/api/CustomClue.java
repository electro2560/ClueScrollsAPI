package com.electro2560.dev.cluescrolls.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * @version 3.4.7
 */
public abstract class CustomClue {
	
	private final Plugin plugin;
	
	//Clue name will be registered as plugin_clueName
	private final String clueName;
	
	private final ClueConfigData[] clueConfigData;
	
	/**
	 * To create a custom clue, you must pass your plugin, the name of the clue
	 * and an array of ClueConfigData. The name of your custom clue will be
	 * yourPlugin_clueName
	 * 
	 * The {@link ClueConfigData} represents the different types of data you may want a 
	 * user to be able to specify in their config under the data section of the clue.
	 * 
	 * Once you have created the CustomClue object, call {@link ClueScrollsAPI#registerCustomClue(CustomClue)}
	 * in order to activate it.
	 * 
	 * To call to update any clues for a player, call {@link #handle(Player, ClueDataPair...)}
	 * passing in the name of the player to update and an array of ClueDataPairs.
	 * 
	 * {@link ClueDataPair} is similar to {@link ClueConfigData}. You create ClueDataPairs
	 * to specify the details of what action the user has completed that you'd like to
	 * update clues for. The {@link ClueDataPair#key} is the name of the data in the
	 * config for the clue, and is also the key you specified when setting up the ClueConfigData
	 * for this custom clue. If there is data you wish to ignore entirely, pass a ClueDataPair
	 * with it's {@link ClueDataPair#value} null.
	 * 
	 * @param plugin
	 * @param clueName
	 * @param clueConfigData
	 */
	public CustomClue(Plugin plugin, String clueName, ClueConfigData... clueConfigData) {
		this.plugin = plugin;
		this.clueName = clueName;
		this.clueConfigData = clueConfigData;
	}
	
	public Plugin getPlugin() {
		return plugin;
	}
	
	public String getClueName() {
		return clueName;
	}
	
	public ClueConfigData[] getClueConfigData() {
		return clueConfigData;
	}
	
	/**
	 * Call a clue for a player. You must specify all the clue data as registered for the clue.
	 * For clue data you would like to ignore or treat as a wild card, the ClueDataPair value
	 * can simply be null.
	 * 
	 * @param player
	 * @param clueDataPairs
	 */
	public abstract void handle(Player player, ClueDataPair... clueDataPairs);
	
	
}
