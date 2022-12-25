package com.byung8.fitness.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodCalorieBase {
	private String foodId;
	private String foodEngName;
	private String foodName;
	private String foodTypeId;
	private String foodTypeName;
	private String unitTypeId;
	private String unitTypeName;
	private float unitCalorieVal;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
