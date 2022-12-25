package com.byung8.common.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {

/*
CREATE TABLE TB_FS_MEMBER (
  MBR_ID INT NOT NULL AUTO_INCREMENT
, MBR_EMLADDR VARCHAR(50) NOT NULL
, MBR_NM VARCHAR(50) NOT NULL
, MBR_GNDR CHAR(1) NOT NULL
, BRTH_DAY VARCHAR(8)
, HEIGHT FLOAT
, USE_YN CHAR(1) DEFAULT 'Y'
, REG_DT DATETIME DEFAULT CURRENT_TIMESTAMP
, UDP_DT DATETIME DEFAULT NULL
, PRIMARY KEY(MBR_ID)
, UNIQUE KEY(MBR_EMLADDR)
);
*/
	private int memberId;
	private String email;
	private String name;
	private int genderId;
	private String genderNm;
	private String birthday;
	private float height;
	private String password;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
