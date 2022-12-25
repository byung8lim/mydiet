package com.byung8.common.domain;

import java.util.Arrays;

public enum RequestType {
	
	RegUnit, DelUnit, UnitList, RegFood, DelFood, FoodList, EMPTY;

	public static RequestType getType(String typeName) {
		return Arrays.stream(RequestType.values()).filter(payGroup -> payGroup.isEquals(typeName)).findAny().orElse(EMPTY);
	}
	
	public boolean isEquals(String typeName) {
		return name().equals(typeName);
	}
}
