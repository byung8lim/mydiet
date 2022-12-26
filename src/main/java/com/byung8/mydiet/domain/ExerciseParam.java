package com.byung8.mydiet.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExerciseParam {
/*
		SELECT
		  a.EXC_ID as paramId
		, a.EXC_NM as paramName
		, a.EXC_NM_ENG as paramNameEng
		, a.DSC as description
		, a.UNIT_CAL_VAL as paramVal
		, a.AMT_UNT_ID as amountUnitId
		, (SELECT b.CMM_CD_NM FROM TB_CMM_CD b WHERE a.AMT_UNT_ID=b.CMM_CD_ID AND b.GRP_CD='05') as amountUnitName
		, a.USE_YN as useYn
		, a.REG_DT as regDt
		, a.UDP_DT as udpDt
		FROM TB_EXC_UNIT_CAL a
		WHERE a.USE_YN='Y';'
 */
	private String paramId;
	private String paramName;
	private String paramNameEng;
	private String description;
	private float paramVal;
	private String amountUnitId;
	private String amountUnitName;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
