package com.electro2560.dev.cluescrolls.api;

/**
 * @version 3.4.7
 */
public class ClueDataPair {
	
	//String key on item
	public final String key;
			
	//The value we want to check
	public final String value;
			
	public ClueDataPair(String key, String value){
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
}
