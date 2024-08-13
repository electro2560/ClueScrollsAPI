package com.electro2560.dev.cluescrolls.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * @version 4.0.3
 */
public interface CustomClue {
	
	/**
	 * Returns the plugin that created this clue
	 * @return plugin
	 */
	public Plugin getPlugin();

	/**
	 * Returns the prefix used for this addon's custom clues
	 *
	 * Addons that do not register a custom prefix will use the name of the addon plugin
	 * @return prefix
	 */
	public String getPrefix();
	
	/**
	 * Returns the clue name
	 * @return clue name
	 */
	public String getClueName();
	
	/**
	 * Returns the array of clue config data
	 * @return clue config data
	 */
	public ClueConfigData[] getClueConfigData();
	
	/**
	 * Call a clue for a player. You must specify all the clue data as registered for the clue.
	 * For clue data you would like to ignore or treat as a wild card, the ClueDataPair value
	 * can simply be null.
	 * 
	 * @param player
	 * @param clueDataPairs
	 */
	public void handle(Player player, ClueDataPair... clueDataPairs);
	
	/**
	 * Call a clue for a player. You must specify all the clue data as registered for the clue.
	 * For clue data you would like to ignore or treat as a wild card, the ClueDataPair value
	 * can simply be null.
	 * 
	 * @param player
	 * @parm amount
	 * @param clueDataPairs
	 */
	public void handle(Player player, int amount, ClueDataPair... clueDataPairs);
	
}
