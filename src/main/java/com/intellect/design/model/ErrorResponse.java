package com.intellect.design.model;

public class ErrorResponse {
	private String code = "";
	private String field = "";
	private String message = "";
	
	public ErrorResponse(String code, String field, String message) {
		this.code = code;
		this.field = field;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}