package com.mtech.webservices.mappers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mtech.webservices.mtechServiceMapperException;

import ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillarequest._1_0_0.GenerarSemilla;
import ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillarequest._1_0_0.GenerarSemillaRequest;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Id;

@Service
public class mtechRequestSeedServiceMapperCustomImpl extends mtechMapperCustomImpl {
	
	protected Logger logger = LoggerFactory.getLogger(mtechRequestSeedServiceMapperCustomImpl.class);
	
	@Override
	public Object[] map(Object[] objects) {

		GenerarSemilla generarSemilla = new GenerarSemilla() ;
		GenerarSemillaRequest generarSemillaRequest = new GenerarSemillaRequest();
		generarSemilla.setGenerarSemillaRequest(generarSemillaRequest);
		
		generarSemillaRequest.setmtechHeader(buildESHeader("1"));
		
		GenerarSemillaRequest.Datos datos = new GenerarSemillaRequest.Datos();
		generarSemillaRequest.setDatos(datos);
		Id id = new Id();
		//TODO: Este valor es solo para no pasar el dato en blanco y poder testear en HOMO
		id.setValue("9007");
		datos.setIdCliente(id);
		
		//TODO Pasar el armado de datos de cabecera en el header generator utils
		return new Object[]{generarSemilla};
	}
}