package com.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

	private static final long serialVersionUID = 8065041550471459355L;

	public UserServiceException(String message) {
		super(message);
		
	}

}
