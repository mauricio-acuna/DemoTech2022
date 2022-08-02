package com.mtech.webservices.mappers;

import org.springframework.stereotype.Service;

import ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillaresponse._1_0_0.GenerarSemillaResult;

@Service
public class mtechResponseSeedServiceMapperCustomImpl extends mtechMapperCustomImpl{

	@Override
	public Object[] map(Object[] objects) {
		
		GenerarSemillaResult result = (GenerarSemillaResult) objects[0];
		return new Object[] {
				result.getGenerarSemillaResponse().getDatos().getSemilla(),
				result.getGenerarSemillaResponse().getDatos().getIdSesion()
						.getValue() };
	}

}
