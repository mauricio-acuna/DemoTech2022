package com.mtech.config;

import javax.jms.JMSException;
import javax.jms.Message;

import org.springframework.jms.core.MessagePostProcessor;

public class MeesagePost implements MessagePostProcessor {

	public MeesagePost() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Message postProcessMessage(Message arg0) throws JMSException {
		// TODO Auto-generated method stub
		System.out.println(arg0.getJMSCorrelationID()); 
		return arg0;
	}

}
