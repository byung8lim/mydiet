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
		  a.FDCL_ID      as fsUnitId 
		, a.FDCL_ENG_NM  as fsUnitNameEng
		, a.FDCL_NM      as fsUnitName
		, a.FD_TP_ID   as fsTypeId
		, (SELECT b.CMM_CD_NM FROM TB_CMM_CD b where a.FD_TP_ID=b.CMM_CD_ID) as fsTypeName
		, a.FD_UNIT_ID  as bsUnitIdId
		, (SELECT b.FS_NM FROM TB_FS_UNIT b where a.FD_UNIT_ID=b.FS_ID) as bsUnitName
		, a.UNT_CL_VAL as bsUnitVal
		, a.USE_YN     as useYn
		, a.REG_DT     as regDt
		, a.UDP_DT     as udpDt
 */
	private String fsUnitId;
	private String fsUnitNameEng;
	private String fsUnitName;
	private String fsTypeId;
	private String fsTypeName;
	private String bsUnitIdId;
	private String bsUnitName;
	private int bsUnitVal;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
