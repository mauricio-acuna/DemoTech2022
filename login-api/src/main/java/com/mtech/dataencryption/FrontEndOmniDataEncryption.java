package com.mtech.dataencryption;

	import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mtech.dataencryption.exception.DataEncryptionException;

@Service
public class FrontEndOmniDataEncryption implements DataEncryption {

	private Logger logger = LoggerFactory
			.getLogger(FrontEndOmniDataEncryption.class);

	private Cipher cipher;

	private PrivateKey privateKey;

	private PublicKey publicKey;

	@Override
	public synchronized byte[] encrypt(byte[] data) throws DataEncryptionException {
		try {
			initialize();
			
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			return cipher.doFinal(data);
		} catch (Exception e) {
			throw new DataEncryptionException(e);
		}
	}

	public synchronized byte[] decrypt(byte[] data) throws DataEncryptionException {
		try {
			initialize();
			
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			return cipher.doFinal(data);
		} catch (Exception e) {
			throw new DataEncryptionException(e);
		}
	}


	private byte[] readFile(String path) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		byte[] bytes = new byte[fis.available()];
		fis.read(bytes);
		fis.close();
		return bytes;
	}

	private synchronized void initialize() throws Exception{
		logger.info("Initializing FrontEndDataEncryptionImpl");

		cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		try{
		// PRIVATE KEY
		byte[] a = readFile("dataEncryption.privateKey");
		privateKey = KeyFactory.getInstance("RSA").generatePrivate(
				new PKCS8EncodedKeySpec(a));

		// PUBLIC KEY
		byte[] b = readFile("dataEncryption.publicKey");
		publicKey = KeyFactory.getInstance("RSA").generatePublic(
				new X509EncodedKeySpec(b));
		
		} catch(Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}
}