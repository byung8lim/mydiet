package com.byung8.common.exception;

import org.springframework.http.HttpStatus;

/**
 * 
 *
 */
public class Byung8Exception extends Exception {

	private static final long serialVersionUID = 2800990333710490224L;
	public static final int OK = HttpStatus.OK.value();
	public static final int BAD_REQUEST = HttpStatus.BAD_REQUEST.value();
	public static final int UNAUTHORIZED = HttpStatus.UNAUTHORIZED.value();
	public static final int FORBIDDEN = HttpStatus.FORBIDDEN.value();
	public static final int NOT_FOUND = HttpStatus.NOT_FOUND.value();
	public static final int METHOD_NOT_ALLOWED = HttpStatus.METHOD_NOT_ALLOWED.value();
	public static final int NOT_ACCEPTABLE = HttpStatus.NOT_ACCEPTABLE.value();
	public static final int PROXY_AUTHENTICATION_REQUIRED = HttpStatus.PROXY_AUTHENTICATION_REQUIRED.value();
	public static final int REQUEST_TIMEOUT = HttpStatus.REQUEST_TIMEOUT.value();
	public static final int CONFLICT = HttpStatus.CONFLICT.value();
	public static final int INTERNAL_SERVER_ERROR = HttpStatus.INTERNAL_SERVER_ERROR.value();
	public static final int NOT_IMPLEMENTED = HttpStatus.NOT_IMPLEMENTED.value();
	public static final int BAD_GATEWAY = HttpStatus.BAD_GATEWAY.value();
	
	private int statusCode;
	
	/**
	 */
	public Byung8Exception() {
		super();
		statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
	}

	/**
	 * @param message
	 */
	public Byung8Exception(String message) {
		super(message);
		statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
	}

	/**
	 * @param e
	 */
	public Byung8Exception(Exception e) {
		super(e);
		statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
	}
	
	/**
	 * @param message
	 * @param statusCode
	 */
	public Byung8Exception(String message, int statusCode) {
		super(message);
		setStatusCode(statusCode);
	}

	/**
	 * @param statusCode
	 */
	public void setStatusCode(int statusCode) {
		
		this.statusCode = statusCode;
	}
	
	/**
	 * @return int
	 */
	public int getStatusCode() {
		return statusCode;
	}
	
	/**
	 * @return String
	 */
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
