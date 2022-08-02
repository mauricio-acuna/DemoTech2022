
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registraroperacionesmonetariasrequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraroperacionesmonetariasrequest/2_0_0}RegistrarOperacionesMonetariasRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrarOperacionesMonetariasRequest"
})
@XmlRootElement(name = "RegistrarOperacionesMonetarias")
public class RegistrarOperacionesMonetarias {

    @XmlElement(name = "RegistrarOperacionesMonetariasRequest", required = true)
    protected RegistrarOperacionesMonetariasRequest registrarOperacionesMonetariasRequest;

    /**
     * Obtiene el valor de la propiedad registrarOperacionesMonetariasRequest.
     * 
     * @return
     *     possible object is
     *     {@link RegistrarOperacionesMonetariasRequest }
     *     
     */
    public RegistrarOperacionesMonetariasRequest getRegistrarOperacionesMonetariasRequest() {
        return registrarOperacionesMonetariasRequest;
    }

    /**
     * Define el valor de la propiedad registrarOperacionesMonetariasRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarOperacionesMonetariasRequest }
     *     
     */
    public void setRegistrarOperacionesMonetariasRequest(RegistrarOperacionesMonetariasRequest value) {
        this.registrarOperacionesMonetariasRequest = value;
    }

}
