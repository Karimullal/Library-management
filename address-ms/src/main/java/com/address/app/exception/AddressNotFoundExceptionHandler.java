package com.address.app.exception;

public class AddressNotFoundExceptionHandler extends Exception{
	
	private static final long serialVersionUID = 6414012889020498220L;

	public AddressNotFoundExceptionHandler() {
		super();
	}
	
	public AddressNotFoundExceptionHandler(String msg) {
		super(msg);
	}
}
