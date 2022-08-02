package com.mtech.scs;

import java.security.InvalidParameterException;

public interface Scs {

	public abstract String encrypt(String userId, String password)throws InvalidParameterException;
	
	public abstract String encryptScratchCard(String col1, String row1, String value1, String col2, String row2, String value2);
	
	public abstract String encryptVirtualTokenSentitiveData(String documentType, String documentNumber, String pin);
}