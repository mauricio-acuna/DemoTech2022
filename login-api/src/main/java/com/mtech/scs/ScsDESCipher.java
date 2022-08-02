package com.mtech.scs;

public class ScsDESCipher {

	final static int cipherBlock = 8;

	String id;
	String key;
	DESCipher desCipher;

	public ScsDESCipher() {
		desCipher = new DESCipher("");
	}
	
	public ScsDESCipher(ScsKey scsKey) {
		this.id = scsKey.getId();
		this.key = scsKey.getKey();
		desCipher = new DESCipher(key);
	}

	public String encrypt(String data) {

		String encryptedText = "";
		String subS = "";
		int i, pos = 0;

		for (i = 0; i < data.length() / cipherBlock; i++) {
			pos = cipherBlock * i;
			// Para i = 5, 6 y 7
			// Son fijos porque este mismo fragmento es el que considera el
			// algoritmo de desencripci�n
			subS = data.substring(pos, pos + cipherBlock);
			if (i > 4 && i < 8) {
				encryptedText += (subS + subS);
			} else {
				encryptedText += desCipher.encryptString(subS);
			}
		}

		if ((data.length() / cipherBlock) <= i) {
			pos = cipherBlock * i;
			encryptedText += data.substring(pos)
					+ Utils.generateRandomString(true, cipherBlock);
		}
		encryptedText += id;
		return encryptedText;
	}
}
