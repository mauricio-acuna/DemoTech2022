package com.mtech.webservices.mappers;



import org.springframework.stereotype.Service;

import ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadoresponse._1_0_0.LoginClienteSimplificadoResponse;
import ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadoresponse._1_0_0.LoginClienteSimplificadoResult;

@Service
public class mtechResponseLoginServiceMapperCustomImpl extends mtechMapperCustomImpl {

	@Override
	public Object[] map(Object[] objects) {
		String idPersona = "";
		String idAdhesion ="";
		LoginClienteSimplificadoResult result = (LoginClienteSimplificadoResult) objects[0];
		LoginClienteSimplificadoResponse response = result
				.getLoginClienteSimplificadoResponse();
		String codigoRespuesta = response.getmtechResultadoOperacion()
				.getSeveridad().value();
		String descripcionRespuesta = response.getmtechResultadoOperacion()
				.getDescripcion();
		if (response.getDatos() != null) {
			idPersona = Integer.valueOf(response.getDatos().getIdPersona().getValue()).toString();
			idAdhesion=response.getDatos().getIdAdhesion().getValue();
		}
		return new Object[] { codigoRespuesta, descripcionRespuesta, idPersona ,idAdhesion };
	}
}
