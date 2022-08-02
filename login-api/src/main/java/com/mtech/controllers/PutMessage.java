package com.mtech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtech.config.JmsConfig;
import com.mtech.config.MeesagePost;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/putMsg")
@Api(value="putmsg", description="sample put messsage")

public class PutMessage {

	 @Autowired
	 private JmsConfig conf;	
	
	 @RequestMapping(method = RequestMethod.POST)
	 @CrossOrigin
	 public String putMsg(@RequestBody String value) {
		 try {
			 //conf.jmsTemplate().convertAndSend("LOGIN_SEND", value);
			 conf.jmsTemplate().convertAndSend("LOGIN_TOPIC", value, new MeesagePost());
			 return "ok";			 
		 } catch (JmsException jmsE) {
			 jmsE.printStackTrace();
			 return "error";
		 }
 
	 }
}
