package com.byung8.common.domain;

import lombok.Data;

@Data
public class Response {
	private boolean success;
	private String message;
	private String provider;
	private String guest;
}
