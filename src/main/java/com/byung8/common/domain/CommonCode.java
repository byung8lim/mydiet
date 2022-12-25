package com.byung8.common.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonCode {
	private int codeId;
	private String codeVal;
	private String codeName;
	private String codeNameEng;
	private String codeGroupVal;
	private String codeGroupName;
	private String description;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
