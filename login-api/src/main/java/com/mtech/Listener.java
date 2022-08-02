package com.mtech;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	@JmsListener(destination = "LOGIN_TOPIC")
	public void receiveMessage(final Message jsonMessage) throws JMSException {
		String messageData = null;
		System.out.println("A message was received");
		System.out.println("Received message " + jsonMessage);
		String response = null;
		if(jsonMessage instanceof TextMessage) {
			TextMessage textMessage = (TextMessage)jsonMessage;
			messageData = textMessage.getText();
			response  = messageData;
		}
		System.out.println(response);
	}

}