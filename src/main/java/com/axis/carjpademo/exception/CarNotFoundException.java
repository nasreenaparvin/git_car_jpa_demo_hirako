package com.axis.carjpademo.exception;

public class CarNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -465327L;

	public CarNotFoundException() {
		super();
		
	}

	public CarNotFoundException(String message) {
		super(message);
		
	}
	

}
