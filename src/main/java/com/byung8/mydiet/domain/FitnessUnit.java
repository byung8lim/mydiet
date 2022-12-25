package com.byung8.mydiet.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FitnessUnit {
/*
  a.FS_ID      as fsUnitId 
, a.FS_VAL     as fsValue
, a.FS_NM_ENG  as fsUnitNameEng
, a.FS_NM      as fsUnitName
, a.FS_DTL     as description
, a.FS_TP_ID   as fsTypeId
, (SELECT b.CD_NM FROM TB_CMM_CD b where a.FS_TP_ID=b.CD_ID) as fsTypeName
, a.BS_UNT_ID  as bsUnitIdId
, (SELECT b.CD_NM FROM TB_CMM_CD b where a.BS_UNT_ID=b.CD_ID) as bsUnitName
, a.BS_UNT_VAL as bsUnitVal
, a.FS_UNT_VAL as fsUnitVal
, a.USE_YN     as useYn
, a.REG_DT     as regDt
, a.UDP_DT     as udpDt
 */
	private int fsUnitId;
	private int fsValue;
	private String fsUnitNameEng;
	private String fsUnitName;
	private String description;
	private int fsTypeId;
	private String fsTypeName;
	private int bsUnitId;
	private String bsUnitName;
	private int bsUnitVal;
	private int fsUnitVal;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
