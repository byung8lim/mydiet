package com.byung8.common.domain;

import org.springframework.http.HttpStatus;

public interface IResult {
	
	public static final int OK = 0x00;
	
	public static final int ERROR = 0x04;
	
	public static final int UNAUTHORIZED = 401;
	
	public static final String EXCEPTION = "error";
	
	public int getCode();
	
	public Throwable getException();
	
	public String getTxId();

	public String getMessage();
	
	public boolean isOK();
	
	public Result putValue(String key, Object value);
	
	public String toJson(boolean isPretty);
	
	public String toJson();

	public boolean isUnauthorized();

	public HttpStatus status();
	
}
