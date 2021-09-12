package com.electro2560.dev.cluescrolls.api;

/**
 * Different types of data that can be used for a clue
 * 
 * @version 3.8.9
 */
public enum DataType {
	
	MATERIAL, ENTITY_TYPE, HORSE_VARIANT, STRING, NUMBER_DECIMAL, NUMBER_INTEGER, NUMBER_LONG, NUMBER_BYTE, BUCKET_CONTENTS, DYE_COLOR, HORSE_STYLE, HORSE_COLOR, DAMAGE_CAUSE, POTION_TYPE, HARVEST_CROP, BOOLEAN, REGAIN_REASON, BANNER_PATTERN, ACTION, EQUIPMENT_SLOT, STATISTIC, STATISTIC_TYPE, INVENTORY_TYPE;
	
	/**
	 * Added v2.4.0
	 * @return true if {@link DataType} is a number
	 */
	public boolean isNumber(){
		switch (this) {
			case NUMBER_BYTE:
			case NUMBER_DECIMAL:
			case NUMBER_INTEGER:
			case NUMBER_LONG:
				return true;
			default:
				return false;
		}
	}
	
}
