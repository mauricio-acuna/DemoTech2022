package com.mtech.scs;
import java.math.BigInteger;

public class HSCipher {

	static final String[] scratchHexa = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
	static final String defaultScratchHexaValue = "16";

	public String stringXorOperation(String sHash1, String sHash2) {

		String char1 = null;
		String char2 = null;

		String currentSubStrHash1 = null;
		String currentSubStrHash2 = null;

		BigInteger i1 = null;
		BigInteger i2 = null;
		String result = "";

		for (int i = 0; i < sHash1.length(); i++) {
			// Supongo que estos valores sean para diferenciarlos de los
			// posibles valores que pueden estar en el arreglo
			// No los seteo a null porque luego hacen un xor entre ellos
			char1 = defaultScratchHexaValue;
			char2 = defaultScratchHexaValue;

			for (int j = 0; j < scratchHexa.length; j++) {

				currentSubStrHash1 = (i == (sHash1.length() - 1)) ? sHash1.substring(i) : sHash1.substring(i, i + 1);
				currentSubStrHash2 = (i == (sHash2.length() - 1)) ? sHash2.substring(i) : sHash2.substring(i, i + 1);

				if (currentSubStrHash1.equalsIgnoreCase(scratchHexa[j])) {
					char1 = String.valueOf(j);
				}
				if (currentSubStrHash2.equalsIgnoreCase(scratchHexa[j])) {
					char2 = String.valueOf(j);
				}

				if (!char1.equals(defaultScratchHexaValue) && !char2.equals(defaultScratchHexaValue)) {
					break;
				}
			}

			i1 = new BigInteger(char1);
			i2 = new BigInteger(char2);

			result = result + scratchHexa[Integer.parseInt(((i1.xor(i2)).toString()))];
		}
		return result;
	}
}
