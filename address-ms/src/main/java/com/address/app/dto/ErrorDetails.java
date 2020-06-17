package com.address.app.dto;

import java.util.Date;

public class ErrorDetails {

	private Date timestamp;
	private String msg;
	private String status;
	private String error;

	public ErrorDetails() {
	}

	public ErrorDetails(Date timestamp, String msg, String status, String error) {
		this.timestamp = timestamp;
		this.msg = msg;
		this.status = status;
		this.error = error;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
