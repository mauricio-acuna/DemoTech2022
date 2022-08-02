package com.mtech.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtech.entities.UserIds;
import com.mtech.services.JWTToken;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/checkToken")
@Api(value="checkToken-api", description="Api para testear el token")
public class CheckToken {
	
	@Autowired
	private JWTToken jwtToken;	

	@RequestMapping(method = RequestMethod.POST)
	public String check(@RequestBody String token ) {
		//UserIds ids = jwtToken.validateToken(token.get("token").toString());
		UserIds ids = jwtToken.validateToken(token);
		return "IdHost: " + ids.getHostId() + " IdAdhesion: " + ids.getAccessionId();
	}
}
