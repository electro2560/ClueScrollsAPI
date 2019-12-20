package com.electro2560.dev.cluescrolls.api;

/**
 * @version 3.4.7
 */
public class ClueConfigData {
	
	private String configKey;
	private DataType dataType;
	
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
	
}
