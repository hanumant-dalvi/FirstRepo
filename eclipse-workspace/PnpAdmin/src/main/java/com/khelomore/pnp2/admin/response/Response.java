package com.khelomore.pnp2.admin.response;

public class Response {
	private String message;
	private String status;
	private String error;

	public Response(String message, String status, String error) {
		super();
		this.message = message;
		this.status = status;
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

}
