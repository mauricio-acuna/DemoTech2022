package com.mtech.webservices.handlers;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtech.config.ApplicationConfig;

import ar.com.mautech.ws.webservices.accionesseguridadomnichannel._1_0_0.AccionesSeguridadOmnichannel;
import ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillarequest._1_0_0.GenerarSemilla;
import ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillaresponse._1_0_0.GenerarSemillaResult;

@Service
public class mtechSeedServiceHandler {
	
	@Autowired
	ApplicationConfig applicationConfig;

	public Object call(Object request) {
		try {
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setServiceClass(getServiceClass());
			factory.setAddress(getUrl());
			//factory.setUsername(user.getUserName());
			//factory.setPassword(user.getPassword());
			AccionesSeguridadOmnichannel handler = (AccionesSeguridadOmnichannel)factory.create();
			GenerarSemillaResult result = handler.generarSemilla((GenerarSemilla)request);
			
			return result;			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	
	public String getUrl() {
		return applicationConfig.getEsbHostname() + ":" + applicationConfig.getEsbPort() +  "/accionesseguridadomnichannel/anonimo?wsdl";
	}

	public Class getServiceClass() {
		return AccionesSeguridadOmnichannel.class;
	}


	public String getClientMethodName() {
		return "generarSemilla";
	}

	public String getWebServiceHandlerName() {
		return "mtechSeedServiceHandler";
	}
}
