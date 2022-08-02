package com.mtech.webservices.mappers;


import org.springframework.stereotype.Service;

import ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadorequest._1_0_0.LoginClienteSimplificado;
import ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadorequest._1_0_0.LoginClienteSimplificadoRequest;
import ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadorequest._1_0_0.LoginClienteSimplificadoRequest.Datos;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Id;

@Service
public class mtechRequestLoginServiceMapperCustomImpl extends mtechMapperCustomImpl {

	@Override
	public Object[] map(Object[] objects) {
		LoginClienteSimplificadoRequest request = new LoginClienteSimplificadoRequest();
		LoginClienteSimplificado loginClienteSimplificado = new LoginClienteSimplificado();
		
		String pinCSC = (String)objects[2];
		Datos datos = new Datos();
		Id idUserName = new Id();
		Id idNumber = new Id();
		
		
		idUserName.setValue((String)objects[0]);
		idNumber.setValue((String)objects[1]);

		datos.setIdUsuario(idUserName);
		datos.setNumeroDocumento(idNumber);
		datos.setPinCSC(pinCSC);
		
		request.setmtechHeader(buildESHeader(null));
		request.setDatos(datos);
		loginClienteSimplificado.setLoginClienteSimplificadoRequest(request);
		return new Object[]{loginClienteSimplificado};
	}
}