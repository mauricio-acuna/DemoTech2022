package com.mtech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtech.entities.mtechCredential;
import com.mtech.entities.UserIds;
import com.mtech.scs.Scs;
import com.mtech.webservices.handlers.mtechLoginServiceHandler;
import com.mtech.webservices.handlers.mtechSeedServiceHandler;
import com.mtech.webservices.mappers.mtechRequestLoginServiceMapperCustomImpl;
import com.mtech.webservices.mappers.mtechRequestSeedServiceMapperCustomImpl;
import com.mtech.webservices.mappers.mtechResponseLoginServiceMapperCustomImpl;
import com.mtech.webservices.mappers.mtechResponseSeedServiceMapperCustomImpl;

@Service
public class ValidatorUserService {

	@Autowired
	private JWTToken token;
	
	@Autowired
	private Scs scs;
	
	@Autowired
	mtechRequestLoginServiceMapperCustomImpl requestMapperLogin;
	
	@Autowired
	mtechLoginServiceHandler handlerlogin; 
	
	@Autowired
	mtechResponseLoginServiceMapperCustomImpl responseMapperLogin; 
	
	public String validateUser(mtechCredential credential) {
		
		String tokenScs = scs.encrypt(credential.getDni(), credential.getPin());
		Long time = System.currentTimeMillis();
		Object reqLogin = requestMapperLogin.map(new Object[] {credential.getUserName(),credential.getDni(),tokenScs});
		Object respLogin = handlerlogin.call(reqLogin);
		Object[] datosLogin = responseMapperLogin.map(new Object[] {respLogin});
		time =  System.currentTimeMillis() - time;
		if (time>5000) {
			System.out.println("**** CXF delayed **** loginsimplificado " + time);
		} else {
			System.out.println("**** CXF time **** loginsimplificado " + time);
		}		
		//System.out.println(datosLogin[0].toString());
		
		UserIds ids = new UserIds();
		ids.setHostId(datosLogin[2].toString());
		ids.setAccessionId(datosLogin[3].toString()); // "456"
		return token.getToken(ids);
	}
}
