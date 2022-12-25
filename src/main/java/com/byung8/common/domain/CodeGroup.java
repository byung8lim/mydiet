package com.byung8.common.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CodeGroup {
	private int codeGroupId;
	private String codeGroupVal;
	private String codeGroupName;
	private String codeGroupNameEng;
	private String description;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
