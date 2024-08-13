package com.electro2560.dev.cluescrolls.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

/**
 * @since 2.1.0
 * @version 4.8.6
 */
public abstract class ClueScrollsAPI {
	
	//Internal
	private static ClueScrollsAPI instance;
	
	/**
	 * Check if the ClueScrollsAPI implementation is available
	 * 
	 * @return true if ClueScrollsAPI available or false if not available
	 */
	public static boolean hasImplementation() {
		return instance != null;
	}

	/**
	 * To be used internally ClueScrolls
	 *
	 * @param instance
	 */
	public static void setImplementation(ClueScrollsAPI instance) {
		ClueScrollsAPI.instance = instance;
	}
	
	/**
	 * Access the ClueScrollsAPI
	 * 
	 * @return ClueScrollsAPI instance
	 */
	public static ClueScrollsAPI getInstance() {
		if(!hasImplementation()) throw new NullPointerException("ClueScrolls not found.");
	    
		return instance;
	}
	
	/**
	 * Get ClueScrolls version
	 * @return version
	 */
	public abstract String getVersion();
	
	/**
	 * Get a list of all tiers
	 * @return List of all tiers
	 */
	public abstract List<String> getTiers();
	
	/**
	 * Get a random tier cluescroll
	 * 
	 * Will obey bind option
	 * 
	 * @param player The player who will be given this scroll
	 * @return A cluescroll
	 * @version 4.8.6
	 * @since 2.1.8
	 */
	public abstract ItemStack getRandomScroll(String mystery, Player player);
	
	/**
	 * Generate a cluescroll of a random tier
	 * 
	 * Will obey bind option
	 * 
	 * @param type tier type
	 * @param player The player who will be given this scroll
	 * @return A cluescroll
	 * @version 4.8.6
	 * @since 2.1.8
	 */
	public abstract ItemStack getScroll(String type, Player player);

	/**
	 * Check if item is a scroll
	 *
	 * @param item An item
	 * @return True if this item is a scroll
	 * @version 4.9.0
	 * @since 4.9.0
	 */
	public abstract boolean isScroll(ItemStack item);

	/**
	 * Check if item is a crystal
	 *
	 * @param item An item
	 * @return True if this item is a crystal
	 * @version 4.9.0
	 * @since 4.9.0
	 */
	public abstract boolean isCrystal(ItemStack item);

	/**
	 * Get the tier of a scroll item
	 *
	 * @param item A scroll item
	 * @return The name of the tier or null if not a scroll item
	 * @version 4.9.0
	 * @since 4.9.0
	 */
	public abstract String getScrollTier(ItemStack item);

	/**
	 * Get the tier of a crystal item
	 *
	 * @param item A scroll item
	 * @return The name of the tier or null if not a crystal item
	 * @version 4.9.0
	 * @since 4.9.0
	 */
	public abstract String getCrystalTier(ItemStack item);
	
	/**
	 * To create a custom clue, you must pass your plugin, the name of the clue
	 * and an array of ClueConfigData. The name of your custom clue will be
	 * yourPlugin_clueName
	 * 
	 * The {@link ClueConfigData} represents the different types of data you may want a 
	 * user to be able to specify in their config under the data section of the clue.
	 * 
	 * To call to update any clues for a player, call {@link CustomClue#handle(Player, ClueDataPair...)}
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
	public abstract CustomClue registerCustomClue(Plugin plugin, String clueName, ClueConfigData... clueConfigData);

	/**
	 * To create a custom clue, you must pass your plugin, the name of the clue
	 * and an array of ClueConfigData. The name of your custom clue will be
	 * yourPlugin_clueName
	 *
	 * The {@link ClueConfigData} represents the different types of data you may want a
	 * user to be able to specify in their config under the data section of the clue.
	 *
	 * To call to update any clues for a player, call {@link CustomClue#handle(Player, ClueDataPair...)}
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
	 * @param customPrefix - Specify to use a different prefix than your plugin name
	 * @param clueName
	 * @param clueConfigData
	 */
	public abstract CustomClue registerCustomClue(Plugin plugin, String customPrefix, String clueName, ClueConfigData... clueConfigData);
	
}
