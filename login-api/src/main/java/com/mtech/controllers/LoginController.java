package com.mtech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtech.dataencryption.DataEncryption;
import com.mtech.entities.mtechCredential;
import com.mtech.services.ValidatorUserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/login")
@Api(value="login-api", description="Api de login para canales")
public class LoginController {
	
	@Autowired
	private ValidatorUserService validator; 
	
	@Autowired
	private DataEncryption frontEndOmniDataEncryption;
	
	@RequestMapping(method = RequestMethod.POST)
	@CrossOrigin
	public String login(@RequestBody mtechCredential credential ) {
		try {
			if (credential.getEncripted()) {
				credential.setPin(new String (frontEndOmniDataEncryption.decrypt(credential.getPin().getBytes())));
				credential.setUserName(new String (frontEndOmniDataEncryption.decrypt(credential.getUserName().getBytes())));
			}
			return validator.validateUser(credential);			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
