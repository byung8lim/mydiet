package com.byung8.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberAuth {
	private int memberId;
	private String email;
	private String password;
	private String passwordConfirm;
}
