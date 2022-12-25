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
	  a.PRM_ID as paramId
	, a.PRM_NM as paramName
	, a.PRM_NM_ENG as paramNameEng
	, a.PRM_DTL as description
	, a.PRM_VAL as paramVal
	, a.AMT_UNT_ID as amountUnitId
	, (SELECT b.CD_NM FROM TB_CMM_CD b WHERE a.AMT_UNT_ID=b.CD_ID AND b.GRP_VAL='05') as amountUnitName
	, a.ANT_UNT_VAL amountUnitVal
	, a.USE_YN as useYn
	, a.REG_DT as regDt
	, a.UDP_DT as udpDt
	FROM TB_EXC_PARM a
	WHERE a.USE_YN='Y';
	AND a.PRM_NM LIKE ${paramName}||'%'
 */
	private int paramId;
	private String paramName;
	private String paramNameEng;
	private String description;
	private float paramVal;
	private int amountUnitId;
	private String amountUnitName;
	private int amountUnitVal;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
