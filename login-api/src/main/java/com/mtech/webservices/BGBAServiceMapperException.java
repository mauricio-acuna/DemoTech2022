package com.mtech.webservices;

public class mtechServiceMapperException extends Exception {
	private int errorCode = 0;
	
	public mtechServiceMapperException(){
		super("Ocurrio un error al intentar mapear un campo del servicio.");
	}
	
	public mtechServiceMapperException(String message){
		super(message);
	}

	public mtechServiceMapperException(int errorCode, String message){
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode(){
		return this.errorCode;
	}
}
