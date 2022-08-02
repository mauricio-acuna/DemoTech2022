package com.mtech.webservices.handlers;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtech.config.ApplicationConfig;

import ar.com.mautech.ws.webservices.accionescanalesalternativos._2_0_0.AccionesCanalesAlternativos;
import ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadorequest._1_0_0.LoginClienteSimplificado;
import ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadoresponse._1_0_0.LoginClienteSimplificadoResult;

@Service
public class mtechLoginServiceHandler {

	@Autowired
	ApplicationConfig applicationConfig;
	
	public Object call(Object request) {
		try {
			Object req = ((Object[])request)[0];
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setServiceClass(getServiceClass());
			factory.setAddress(getUrl());
			//factory.setUsername(user.getUserName());
			//factory.setPassword(user.getPassword());
			AccionesCanalesAlternativos handler = (AccionesCanalesAlternativos)factory.create();
			LoginClienteSimplificadoResult result = handler.loginClienteSimplificado((LoginClienteSimplificado)req);
			
			return result;			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	
	public String getUrl() {
		return applicationConfig.getEsbHostname() + ":" + applicationConfig.getEsbPort() + "/accionescanalesalternativos/v2/anonimo?wsdl";
	}

	public Class getServiceClass() {
		return AccionesCanalesAlternativos.class;
	}


	public String getClientMethodName() {
		return "loginClienteSimplificado";
	}

	public String getWebServiceHandlerName() {
		return "mtechLoginServiceHandler";
	}	
	
}
