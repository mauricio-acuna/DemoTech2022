package com.mtech.scs;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtech.webservices.handlers.mtechSeedServiceHandler;
import com.mtech.webservices.mappers.mtechRequestSeedServiceMapperCustomImpl;
import com.mtech.webservices.mappers.mtechResponseSeedServiceMapperCustomImpl;

@Service
public class KeyProvider {

@Autowired
mtechRequestSeedServiceMapperCustomImpl requestSeedServiceMapper;

@Autowired
mtechResponseSeedServiceMapperCustomImpl responseSeedServiceMapper;

@Autowired
mtechSeedServiceHandler handlerSeed;

	public ScsKey getEncryptionKey() {
		Object seedRequest = null;
		Object seedResponse = null;

		// Rutina de encriptacion del PIN
		// ---------------------------------------------------------------------
		// Devolviendo la semilla
		// ---------------------------------------------------------------------
		String seedFormattedResponse = null;
		String idSessionFormattedResponse = null;
		Long time = System.currentTimeMillis();
		seedRequest = requestSeedServiceMapper.map(null)[0];
		seedResponse = handlerSeed.call(seedRequest);

		Object[] data = responseSeedServiceMapper
				.map(new Object[] { seedResponse });
		time =  System.currentTimeMillis() - time;
		if (time>5000) {
			System.out.println("**** CXF delayed **** seed " + time);
		} else {
			System.out.println("**** CXF time **** seed " + time);
		}
		seedFormattedResponse = (String) data[0];
		idSessionFormattedResponse = (String) data[1];

		ScsKey skey = extractKey(idSessionFormattedResponse,
				seedFormattedResponse);

		//TODO: Valor para desa, parametrizar
		DESCipher des = new DESCipher("I8U7Y6T5");
		String decryptedKey = des.decryptString(skey.getKey());

		skey = new ScsKey(decryptedKey, skey.getId());
		return skey;
	}

	private ScsKey extractKey(String idSession, String seed) {

		ScsKey keyToReturn = null;

		if (idSession != null && idSession.length() == 6 && seed != null
				&& seed.length() == 16) {
			// TODO: longitudes de idSession y seed configurables!
			keyToReturn = new ScsKey(seed, idSession);
		} 
		return keyToReturn;
	}

	public byte[] getVTPrismaEncryptionKey(){
		
		byte[] toReturn = null;
		try{
			String configKey = "FEDCBA98765432100123456789ABCDEF";
			// Concatenamos al final los primeros 16 bits de la llave original
			configKey = configKey.concat(configKey.substring(0, 16));
			toReturn = Hex.decodeHex(configKey.toCharArray());
		}
		catch(Exception exc){}
		return toReturn;
		
	}
}
