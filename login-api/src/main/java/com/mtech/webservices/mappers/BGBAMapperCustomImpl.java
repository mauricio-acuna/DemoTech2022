package com.mtech.webservices.mappers;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.cxf.common.logging.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.mtechHeader;

import com.mtech.webservices.*;

public abstract class mtechMapperCustomImpl implements mtechServiceMapper {
	
	private static final Logger LOG = LogUtils.getLogger(mtechMapperCustomImpl.class);
	
	
	public mtechHeader buildESHeader(String customerId) {
		mtechHeaderGenerator<mtechHeader> headerGen = new mtechHeaderV2SpanishGenerator();
		return headerGen.generateHeader(customerId);
	}

//	public ar.com.mautech.ws.webservices.globales.mtechheader_en._2_0_0.mtechHeader buildENHeader(
//			String customerId) throws mtechServiceMapperException {
//
//		mtechHeaderGenerator<ar.com.mautech.ws.webservices.globales.mtechheader_en._2_0_0.mtechHeader> headerGen = new mtechHeaderV2EnglishGenerator(
//				appConfig);
//		return headerGen.generateHeader(customerId);
//	}

//	public ar.com.mautech.ws.webservices.globales.mtechheader._1_0_0.mtechHeader buildESHeaderV1(
//			String customerId) throws mtechServiceMapperException {
//
//		mtechHeaderGenerator<ar.com.mautech.ws.webservices.globales.mtechheader._1_0_0.mtechHeader> headerGen = new mtechHeaderV1Generator(
//				appConfig);
//		return headerGen.generateHeader(customerId);
//	}

	public String getExtraValues(Map datos, String value) {
		if (datos.get(value) == null) {
			return null;
		} else {
			return datos.get(value).toString();
		}
	}

	public Boolean getExtraValuesAsBoolean(Map datos, String value) {
		if (datos.get(value) == null) {
			return null;
		} else {
			if (datos.get(value).toString().equalsIgnoreCase("true")) {
				return true;
			}
			return false;
		}
	}


	// TODO ver si hay algun utilitario que implemente esta funcionalidad.
//	protected ExtendABean getExtendABeanCurrencyCode(String code) {
//		ExtendABean currencyCode = new ExtendABean();
//		currencyCode.setKey("CurrencyCode");
//		
//		if ("1".equals(code)){
//			currencyCode.setValue("ARS");
//		} else 
//		if ("2".equals(code)){
//			currencyCode.setValue("USD");
//		}
//		
//		return currencyCode;
//	}		

//	public String getClientIdForHeader(SecureUser secureUser){
//		String clientId = "";
//		
//		if (secureUser.getMap().get("HostId") != null && !"".equals(((String)secureUser.getMap().get("HostId")))){
//			clientId = (String)secureUser.getMap().get("HostId");
//		}else{
//			clientId = (String)secureUser.getMap().get("NUMERO_USUARIO");
//		}
//		
//		return clientId;
//	}
	
//	public SecureUser getSecureUser(){
//		SecureUser secureUser = null;
//		Map<String, List<String>> httpHeaders = (Map<String, List<String>>) ThreadContext.getContext().get("mtechHeaderParametersKey");
//
//		String tokenKey = (String)httpHeaders.get("tokenkey").get(0);
//
//		try {
//			cacheService.getWriteLock(CacheConstants.SECURE_USER, tokenKey);
//			secureUser = (SecureUser) cacheService.get(CacheConstants.SECURE_USER, tokenKey);
//			
//		} catch (Exception e) {	
//			LOG.log(Level.SEVERE,e.getMessage());
//		}finally {
//			try {
//				cacheService.releaseLock(CacheConstants.SECURE_USER, tokenKey);
//			} catch (CacheServiceException e) {
//				LOG.log(Level.SEVERE,e.getMessage());
//			}
//		}
//
//		return secureUser;
//	}
}
