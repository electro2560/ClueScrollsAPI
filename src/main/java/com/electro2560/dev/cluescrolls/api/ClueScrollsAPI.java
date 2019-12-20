package com.electro2560.dev.cluescrolls.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @since 2.1.0
 * @version 3.2.7
 */
public interface ClueScrollsAPI {
	
	/**
	 * Get a list of all tiers
	 * @return List of all tiers
	 */
	public List<String> getTiers();
	
	/**
	 * Get a random tier cluescroll
	 * 
	 * Will not obey bind option
	 * 
	 * @return A cluescroll
	 * @since 2.1.0
	 * @version 2.1.8
	 */
	public ItemStack getRandomScroll(String mystery);
	
	/**
	 * Get a random tier cluescroll
	 * 
	 * Will obey bind option
	 * 
	 * @param playerUUID String of player UUID who will be given this scroll
	 * @return A cluescroll
	 * @since 2.1.8
	 */
	public ItemStack getRandomScroll(String mystery, String playerUUID);
	
	/**
	 * Get a random tier cluescroll
	 * 
	 * Will obey bind option
	 * 
	 * @param playerUUID UUID of player who will be given this scroll
	 * @return A cluescroll
	 * @since 2.1.8
	 */
	public ItemStack getRandomScroll(String mystery, UUID playerUUID);
	
	/**
	 * Get a random tier cluescroll
	 * 
	 * Will obey bind option
	 * 
	 * @param player The player who will be given this scroll
	 * @return A cluescroll
	 * @since 2.1.8
	 */
	public ItemStack getRandomScroll(String mystery, Player player);
	
	/**
	 * Generate a cluescroll of a random tier
	 * 
	 * Will not obey bind option
	 * 
	 * @param type tier type
	 * @return A cluescroll
	 * @since 2.1.0
	 * @version 2.1.8
	 */
	public ItemStack getScroll(String type);
	
	/**
	 * Generate a cluescroll of a random tier
	 * 
	 * Will obey bind option
	 * 
	 * @param type tier type
	 * @param playerUUID String of player UUID who will be given this scroll
	 * @return A cluescroll
	 * @since 2.1.8
	 */
	public ItemStack getScroll(String type, String playerUUID);
	
	/**
	 * Generate a cluescroll of a random tier
	 * 
	 * Will obey bind option
	 * 
	 * @param type tier type
	 * @param playerUUID UUID of player who will be given ths scroll
	 * @return A cluescroll
	 * @since 2.1.8
	 */
	public ItemStack getScroll(String type, UUID playerUUID);
	
	/**
	 * Generate a cluescroll of a random tier
	 * 
	 * Will obey bind option
	 * 
	 * @param type tier type
	 * @param player The player who will be given this scroll
	 * @return A cluescroll
	 * @since 2.1.8
	 */
	public ItemStack getScroll(String type, Player player);
	
	/**
	 * Register your custom clue
	 * 
	 * @param customClue
	 * @since 3.2.7
	 */
	public void registerCustomClue(CustomClue customClue);
	
}
