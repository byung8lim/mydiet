package com.byung8.mydiet.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberDietHistory {
/*
CREATE TABLE TB_MEM_DIET (
  MBR_ID INT NOT NULL
, DIET_DT CHAR(8) NOT NULL
, DIET_TM CHAR(6) NOT NULL
, SEQ INT NOT NULL
, MEAL_TP_ID INT
, FD_ID INT
, FD_AMT_VAL FLOAT
, FD_CAL_VAL FLOAT
);
*/
	private int memberId;
	private String dietDate;
	private String diteTime;
	private int sequence;
	private int mealTypeId;
	private String mealTypeNm;
	private String foodId;
	private String foodNm;
	private float foodAmount;
	private float foodcalorie;
}
