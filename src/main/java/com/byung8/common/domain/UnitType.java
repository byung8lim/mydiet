package com.byung8.common.domain;

import java.util.Arrays;

public enum UnitType {
	BASIC, EXTENDED, EMPTY;

	public static UnitType getType(String typeName) {
		return Arrays.stream(UnitType.values()).filter(payGroup -> payGroup.isEquals(typeName)).findAny().orElse(EMPTY);
	}
	
	public boolean isEquals(String typeName) {
		return name().equals(typeName);
	}

}
