package ar.com.mautech.ws.webservices.accionesseguridadomnichannel._1_0_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2017-05-16T15:59:10.702-03:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://ws.mautech.com.ar/webservices/accionesseguridadomnichannel/1_0_0", name = "AccionesSeguridadOmnichannel")
@XmlSeeAlso({ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillaresponse._1_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.globales.mtechtipossoporte._3_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillarequest._1_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AccionesSeguridadOmnichannel {

    @WebResult(name = "GenerarSemillaResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionesseguridadomnichannel/generarsemillaresponse/1_0_0", partName = "parameters")
    @WebMethod(operationName = "GenerarSemilla", action = "http://ws.mautech.com.ar/webservices/accionesseguridadomnichannel/generarsemilla")
    public ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillaresponse._1_0_0.GenerarSemillaResult generarSemilla(
        @WebParam(partName = "parameters", name = "GenerarSemilla", targetNamespace = "http://ws.mautech.com.ar/webservices/accionesseguridadomnichannel/generarsemillarequest/1_0_0")
        ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillarequest._1_0_0.GenerarSemilla parameters
    ) throws mtechResultadoOperacionFalla;
}
