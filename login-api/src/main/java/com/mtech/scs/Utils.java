package com.mtech.scs;

import java.util.Random;

public class Utils {

	static final String candidateAlphanumericChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	static final String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String generateRandomString(boolean alphanumeric, int length) {

		String availableCharacters = (alphanumeric) ? candidateAlphanumericChars : candidateChars;
		
		StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(availableCharacters.charAt(random.nextInt(availableCharacters.length())));
	    }

	    return sb.toString();
	}

	public static String hexEncode(byte[] data) {

		String hexEncoded = String.format("%" + data.length * 2 + "s", "").replace(' ', '0');
		String hexString = "";

		for (int i = 0; i < data.length; i++) {
			hexString = "0" + Integer.toHexString(data[i]);

			hexEncoded = hexEncoded.substring(0, (i * 2))
					+ hexString.substring(hexString.length() - 2)
					+ hexEncoded.substring((i * 2) + 2);
		}
		return hexEncoded;
	}

	public static byte[] hexDecode(String hexEncoded) {

		byte[] hexDecoded = new byte[hexEncoded.length() / 2];
		String sub = "";
		
		for (int i = 0; i < hexDecoded.length; i++) {
			sub = hexEncoded.substring(i * 2, i * 2 + 2);
			hexDecoded[i] = (byte) Integer.parseInt(sub, 16);
		}
		return hexDecoded;
	}
}
