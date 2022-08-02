package com.mtech.config;

import org.springframework.stereotype.Service;

@Service
public class ApplicationConfig {

	private String esbHostname;
	private String esbPort;

	public ApplicationConfig() {
		try {
			esbHostname = System.getenv("LOGIN_CONFIG_esb_hostname");
			esbPort = System.getenv("LOGIN_CONFIG_esb_port");
			
		} catch (Exception e) {
			throw new RuntimeException("No se puede iniciar la aplicacion, no se puede cargar la configuracion");
		} 
	}

	public String getEsbHostname() {
		return esbHostname;
	}
	
	public String getEsbPort() {
		return esbPort;
	}	
}
