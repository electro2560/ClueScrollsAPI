package com.electro2560.dev.cluescrolls.api;

import java.util.Arrays;

/**
 * @version 3.4.7
 */
public class ClueConfigData {
	
	private final String configKey;
	private final DataType dataType;
	
	public ClueConfigData(String configKey, DataType dataType){
		this.configKey = configKey.toLowerCase();
		this.dataType = dataType;
	}

	public String getConfigKey() {
		return configKey;
	}

	public DataType getDataType() {
		return dataType;
	}

	/**
	 * @version 5.0.1
	 */
	public static final class Builder {
		ClueConfigData[] pairs = new ClueConfigData[0];

		public ClueConfigData[] build(){
			return pairs;
		}

		public ClueConfigData.Builder add(String key, DataType value) {
			pairs = Arrays.copyOf(pairs, pairs.length + 1);
			pairs[pairs.length - 1] = new ClueConfigData(key, value);
			return this;
		}

	}
	
}
