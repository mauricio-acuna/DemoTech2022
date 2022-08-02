package com.mtech.controllers;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(value="publicKey-api", description="Devuelve la clave para encriptar usuario y pin desde el canal a la api")
public class PublicKeyController {

	@RequestMapping("/publicKey")
	public @ResponseBody Map<String,String> getKey() {
		Map<String,String> pubKey = new HashMap<String,String>();
		pubKey.put("publicKey", "-----BEGIN PUBLIC KEY-----" + 
				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA21Wf42cAECyBuSXJzOWa" + 
				"sumtaBcxthwZHhJiIweYTxAAKhxZju0IqpIyGd2nz/G3iyJTrEknxh1M4aG0nq9w" + 
				"4RZst5TQAcOqYiRBJy0ofsG3gEh9GwY/rShZ9czJP/x+LZHaRD24if/4afkGDEDH" + 
				"RnwpgqALkbP4wghaadZBvJYKDUeUh0b3lqsmsJl1feL3sGIidva89GzUbQF3CkhS" + 
				"97RiwLg6Uuf+FvNNFQHcGHpGkyHBiP57o2dugQe7FRCDeDTHOPHxvEBhzyFtF/Xc" + 
				"pC/7zxHF32GFngZqTFiF+QJiz8XEYomLy3vJD/j2hJgUcEch4rzY6mTwaMDfo1hp" + 
				"jQIDAQAB" + 
				"-----END PUBLIC KEY-----");
		pubKey.put("timestamp", new Timestamp(System.currentTimeMillis()).toString());
		
		return pubKey;
		
	}
}
