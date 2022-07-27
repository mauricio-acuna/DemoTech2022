package com.boot.restaurantapi.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.boot.restaurantapi.dtos.ErrorDto;

public class BookingException extends Exception {
	
	private final String code;
	
	private final int responseCode;
	
	private final List<ErrorDto> errorList = new ArrayList<>();

	public BookingException(String code, int responseCode, String message) {
		super(message);
		this.code = code;
		this.responseCode = responseCode;
		this.errorList.addAll(errorList);
	}	

	public BookingException(String code, int responseCode, String message, List<ErrorDto> errorList) {
	
		super(message);
		this.code = code;
		this.responseCode = responseCode;
		this.errorList.addAll(errorList);
	
	}	
	
}
