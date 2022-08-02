package com.mtech.webservices.mappers;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.mtech.webservices.mtechServiceMapperException;

import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.mtechHeader;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.Equipo;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.IdCliente;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.IdMensaje;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.Identificadores;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.ModuloAplicativo;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.Operador;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.OrganizacionInterna;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.Origen;

public class mtechHeaderV2SpanishGenerator
		implements mtechHeaderGenerator<mtechHeader> {

	public static String mtech_HEADER_PARAMETERS_KEY = "mtechHeaderParametersKey";

	private static Long lastMillis = 0L;

	public mtechHeaderV2SpanishGenerator() {
		super();
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.banking.mtech.webservices.mappers.mtechHeaderGenerator#
	 * generateENHeader(java.lang.String)
	 */
	@Override
	public mtechHeader generateHeader(String hostId) {
		
		
		String idOperacion = "123";
		
		if (idOperacion.contains("-")){
			idOperacion = idOperacion.split("-")[1];
		}
		
		mtechHeader header = new mtechHeader();		
		ModuloAplicativo moduloAplicativo = new ModuloAplicativo();
		
		String operationId = String.valueOf(idOperacion) +  String.valueOf(getNextID());
		Identificadores identificadores = new Identificadores();
		Equipo equipo = new Equipo();
		try {
			equipo.setIp(InetAddress.getLocalHost().getHostAddress());
			equipo.setNombre(InetAddress.getLocalHost().getHostName());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}		

		moduloAplicativo.setIdmtech("1");
		
		moduloAplicativo.setIdConsumidor("2");
		
		moduloAplicativo.setIdProveedor("3");					

		// 1. IdMensaje
		IdMensaje idMensaje = new IdMensaje();
		idMensaje.setIdEsquema("sc2");
		idMensaje.setValue(operationId);

		//UUI - MessageUUI from UI 04a0ccb467a44af2b0d0bea7e5b19dec
		String idMensajeAnterior = operationId;
		IdMensaje idMensajeAnt = new IdMensaje();
		
		
		idMensajeAnterior = "11";
		idMensajeAnt.setIdEsquema("sc3");
		
		idMensajeAnt.setValue(idMensajeAnterior);

		IdMensaje idMensajeOp = new IdMensaje();
		idMensajeOp
				.setIdEsquema("sc4");
		idMensajeOp.setValue(operationId);

		identificadores.setIdMensaje(idMensaje);
		identificadores.setIdOperacion(idMensajeOp);
		identificadores.setIdMensajeAnterior(idMensajeAnt);

		header.setModuloAplicativo(moduloAplicativo);
		header.setIdentificadores(identificadores);
		
		Origen origen = getOdataHeader(hostId);		
		header.setOrigen(origen);
		header.setEquipo(equipo);

		return header;
	}

	private  Origen getOdataHeader(String hostId) {

		Origen origen = new Origen();
		OrganizacionInterna organizacionInterna = new OrganizacionInterna();
		ModuloAplicativo moduloAplicativoOrigen = new ModuloAplicativo();
		Operador operador = new Operador();
		Equipo equipo = new Equipo();
		
		
		XMLGregorianCalendar fecha = getCurrentTime();		
		
		origen.setFechaHoraCreacion(fecha);
			
//		String locationLatitude = httpHeaders.get("locationLatitude") != null
//				&& (String) httpHeaders.get("locationLatitude").get(0) != null ? httpHeaders
//				.get("locationLatitude").get(0) : "0.0";
//				
//		String locationLongitude = httpHeaders.get("locationLongitude") != null
//						&& (String) httpHeaders.get("locationLongitude").get(0) != null ? httpHeaders
//						.get("locationLongitude").get(0) : "0.0";
						
		String mtechId = "900007";
				
		String deviceIpAddress = getDeviceIpAddress();
		String deviceName = "";

		deviceName = "app1";

		
				
//		String deviceId = httpHeaders.get("deviceId") != null
//				&& (String) httpHeaders.get("deviceId").get(0) != null ? httpHeaders
//				.get("deviceId").get(0) : "No device id";
				
		String internalOrganizationId = "01";
				
		String internalOrganizationType = "02";
				
//		String operationType = httpHeaders.get("operationType") != null
//				&& (String) httpHeaders.get("operationType").get(0) != null ? httpHeaders
//				.get("operationType").get(0) : "No operation type";
//				
//		String appVersion = httpHeaders.get("appVersion") != null
//				&& (String) httpHeaders.get("appVersion").get(0) != null ? httpHeaders
//				.get("LocationLongitude").get(0) : "No app version";
//				
//		String appPlatform = httpHeaders.get("appPlatform") != null
//				&& (String) httpHeaders.get("appPlatform").get(0) != null ? httpHeaders
//				.get("appPlatform").get(0) : "No app platform";
//				origen.setFechaHoraCreacion(fecha);

		origen.setModuloAplicativo(moduloAplicativoOrigen);
		origen.setCanal("hb");
		organizacionInterna.setTipo(internalOrganizationType);
		organizacionInterna.setId(Long.parseLong(internalOrganizationId));
		origen.setOrganizacionInterna(organizacionInterna);
		
		equipo.setIp(deviceIpAddress);
		equipo.setNombre(deviceName);
		
		origen.setEquipo(equipo);
		
		if(hostId != null){
			IdCliente idCliente = new IdCliente();
			idCliente.setIdEsquema("sch05");
			idCliente.setValue(hostId);
			origen.setIdCliente(idCliente);
		}
		
		operador.setIdEsquema("sch06");
		operador.setValue("L0222222");
		origen.setOperador(operador);
		
		moduloAplicativoOrigen.setIdmtech(mtechId);
		
		String consumerId = "1";
		moduloAplicativoOrigen.setIdConsumidor(consumerId);
		moduloAplicativoOrigen.setIdProveedor("2");		
		
		return origen;
	}
	
	private XMLGregorianCalendar getCurrentTime() {
		Calendar calendar = Calendar.getInstance();
		GregorianCalendar c = new GregorianCalendar(calendar.get(Calendar.YEAR), (calendar.get(Calendar.MONTH)),
				calendar.get(Calendar.DATE), calendar.get(Calendar.HOUR), calendar.get(Calendar.MILLISECOND));

		c.setTimeInMillis(new Date().getTime());

		// fecha hora de envio
		XMLGregorianCalendar fecha = null;
		try {
			fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

			// System.out.println(fecha);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fecha;
	}

	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(cal.getTime());
	}

	public synchronized static Long getNextID() {
		Long millis = System.currentTimeMillis();
		if (millis == lastMillis) {
			lastMillis += 1L;
		} else {
			lastMillis = millis;
		}
		return millis + lastMillis;
	}
	
	private String getDeviceIpAddress() {
		String deviceIpAddress = "";
		String defaultDeviceIpAddress = "1.1.1.1";

		try {
			deviceIpAddress = "2.2.2.2";



			// Si no es 1.1.1.1
			if (!deviceIpAddress.equals(defaultDeviceIpAddress)) {
				String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
						+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
						+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
						+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

				Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
				Matcher matcher = pattern.matcher(deviceIpAddress);

				deviceIpAddress = (matcher.matches()) ? deviceIpAddress
						: defaultDeviceIpAddress;
			}
		} catch (Exception e) {
			deviceIpAddress = defaultDeviceIpAddress;
		}

		return deviceIpAddress;
	}
}
