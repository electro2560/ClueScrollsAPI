package com.electro2560.dev.cluescrolls.api;

import java.util.Arrays;

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

	/**
	 * @version 5.0.1
	 */
	public static final class Builder {
		ClueDataPair[] pairs = new ClueDataPair[0];

		public ClueDataPair[] build(){
			return pairs;
		}

		public Builder add(String key, String value) {
			pairs = Arrays.copyOf(pairs, pairs.length + 1);
			pairs[pairs.length - 1] = new ClueDataPair(key, value);
			return this;
		}

		public Builder add(String key, int value) {
			add(key, value + "");
			return this;
		}

		public Builder add(String key, long value) {
			add(key, value + "");
			return this;
		}

		public Builder add(String key, boolean value) {
			add(key, value + "");
			return this;
		}

	}
	
}
