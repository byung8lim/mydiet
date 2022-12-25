package com.byung8.common.domain;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author 06919
 *
 */
public class Result implements IResult {

	private int code;

	private String message;

	private String txId;

	private Throwable throwable;

	private long timestamp;

	private Map<String, Object> result = new HashMap<>();

	public Map<String, Object> getResult() {
		return result;
	}

	public static final Result RESULT_OK = new Result("", OK, "ok");

	public static Result RESULT_OK(String txId) {
		return new Result(txId, OK, "ok");
	}

	public static Result RESULT_OK(String txId, String message) {
		return new Result(txId, OK, message);
	}

	public static Result RESULT_FAIL(String txId, Throwable throwable) {
		return new Result(txId, ERROR, throwable.getMessage(), throwable);
	}

	private Result() {
	}

	public Result(String txId) {
		this.timestamp = System.currentTimeMillis();
		this.txId = txId;
	}

	public Result(String txId, int code) {
		this.timestamp = System.currentTimeMillis();
		this.txId = txId;
		this.code = code;
	}

	public Result(String txId, int code, String message) {
		this.timestamp = System.currentTimeMillis();
		this.txId = txId;
		this.code = code;
		this.message = message;
	}

	public Result(String txId, int code, String message, Throwable throwable) {
		this.timestamp = System.currentTimeMillis();
		this.txId = txId;
		this.code = code;
		this.message = message;
		this.throwable = throwable;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public Throwable getException() {
		return throwable;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public boolean isOK() {
		return code == OK;
	}
	
	@Override
	public boolean isUnauthorized() {
		return code == UNAUTHORIZED;
	}

	@Override
	public String getTxId() {
		return txId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("	timestamp:").append(timestamp).append(",");
		sb.append("	txid:").append(txId).append(",");
		sb.append("	code:").append(code).append(",");
		sb.append("	message:").append(message);
		sb.append("}");
		return sb.toString();
	}

	@Override
	public Result putValue(String key, Object value) {
		if (value instanceof Exception) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			PrintStream pinrtStream = new PrintStream(out);

			((Exception) value).printStackTrace(pinrtStream);

			String stackTraceString = out.toString();
			result.put(key, stackTraceString);
		} else {
			result.put(key, value);
		}
		return this;
	}

	@Override
	public String toJson() {
		return toJson(true);
	}

	@Override
	public String toJson(boolean isPretty) {
		Gson gson = null;
		if (isPretty) {
			gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyyMMddHHmmss").create();
		} else {
			gson = new GsonBuilder().setDateFormat("yyyyMMddHHmmss").create();
		}
		
		if(getException() != null) {
			putValue(IResult.EXCEPTION, getException());
			setThrowable(null);
		}
		
		String json = gson.toJson(this);

		return json;
	}
	
	@Override
	public HttpStatus status() {
		if(code == UNAUTHORIZED) {
			return HttpStatus.UNAUTHORIZED;
		}	else if(code == OK) {
			return HttpStatus.OK;
		}	else if(code == ERROR) {
			return HttpStatus.EXPECTATION_FAILED;
		} else {
			return HttpStatus.OK;
		}
	}
	
	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

}
