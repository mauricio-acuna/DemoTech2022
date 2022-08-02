package com.mtech.scs;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.commons.codec.binary.Hex;

public class ScsHSCipher {

	HSCipher hsCipher;

	public ScsHSCipher() {
		hsCipher = new HSCipher();
	}

	public String encryptScratchCard(String coord1, String corrd2) {

		String sHash1 = null;
		String sHash2 = null;
		String result = null;

		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		if (m != null) {
			m.reset();
			m.update(coord1.getBytes());
			sHash1 = new String(Hex.encodeHex(m.digest()));

			m.reset();
			m.update(corrd2.getBytes());
			sHash2 = new String(Hex.encodeHex(m.digest()));

			if (sHash1.length() != sHash2.length()) {
				result = "";
			}
			result = hsCipher.stringXorOperation(sHash1, sHash2);
		}
		return result;
	}

	public String encryptVirtualTokenSentitiveData(String data1, String data2, byte[] keyArrayBytes) {

		String result = "";
		try {
			String xorData = hsCipher.stringXorOperation(data1, data2);
			byte[] xorDatarrayBytes = Hex.decodeHex(xorData.toCharArray());

			DESedeKeySpec keySpec = new DESedeKeySpec(keyArrayBytes);
			SecretKeyFactory keyfactory = SecretKeyFactory
					.getInstance("DESede");
			SecretKey ky = keyfactory.generateSecret(keySpec);

			Cipher cipher = Cipher.getInstance("DESede/ECB/NoPadding");
			cipher.init(Cipher.ENCRYPT_MODE, ky);

			byte[] encrypted = cipher.doFinal(xorDatarrayBytes);
			result = Hex.encodeHexString(encrypted);
		} catch (Exception exc) {
		}

		return result;
	}
}
