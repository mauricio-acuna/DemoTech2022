package com.mtech.services;

import java.security.MessageDigest;
import java.util.Date;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

import com.mtech.entities.UserIds;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.*;
import com.nimbusds.jwt.*;

@Service
public class JWTToken {

	private JWSSigner signer;
	private SecretKey secretKey;
	
	public JWTToken() {
		try {
			
			
			byte[] passKeyBytes = "Pass1234".getBytes();
			
	        MessageDigest sha = MessageDigest.getInstance("SHA-256");
	        //SecretKeySpec secretKey;
	        byte[] digest = sha.digest(passKeyBytes);
	        secretKey = new SecretKeySpec(digest, "AES");

			
			
			
//			// Generate 256-bit AES key for HMAC as well as encryption
//			KeyGenerator keyGen = KeyGenerator.getInstance("AES");
//			keyGen.init(256);
//
//			secretKey = keyGen.generateKey();
			
			// Create HMAC signer
			signer = new MACSigner(secretKey.getEncoded());			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	public String getToken(UserIds ids) {
		
		try {
			JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
				    .subject(ids.getHostId())
				    .issueTime(new Date())
				    .issuer("https://c2id.com")
				    .claim("idHost", ids.getHostId())
				    .claim("idAdhesion", ids.getAccessionId())
				    .build();

				SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);

				// Apply the HMAC
				signedJWT.sign(signer);

				// Create JWE object with signed JWT as payload
				JWEObject jweObject = new JWEObject(
				    new JWEHeader.Builder(JWEAlgorithm.DIR, EncryptionMethod.A256GCM)
				        .contentType("JWT") // required to signal nested JWT
				        .build(),
				    new Payload(signedJWT));

				// Perform encryption
				jweObject.encrypt(new DirectEncrypter(secretKey.getEncoded()));

				// Serialise to JWE compact form
				String jweString = jweObject.serialize();
				
		    return jweString;			
		} catch (Exception e) {
			throw new RuntimeException(e); 
		}
	}
	
	public UserIds validateToken (String jwtToken) {
		try {
			JWEObject jweObject = JWEObject.parse(jwtToken);

			jweObject.decrypt(new DirectDecrypter(secretKey.getEncoded()));

			SignedJWT signedJWT = jweObject.getPayload().toSignedJWT();

			UserIds ids = new UserIds();
			ids.setHostId(signedJWT.getJWTClaimsSet().getClaim("idHost").toString());
			ids.setAccessionId(signedJWT.getJWTClaimsSet().getClaim("idAdhesion").toString());
			
			return ids;			
		} catch (Exception e) {
			throw new RuntimeException(e); 
		}
	}
}
