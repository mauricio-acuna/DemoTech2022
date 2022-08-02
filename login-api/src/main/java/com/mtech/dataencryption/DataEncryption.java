package com.mtech.dataencryption;

public interface DataEncryption {

	byte[] encrypt(byte[] data) throws Exception;
	byte[] decrypt(byte[] data) throws Exception;

}