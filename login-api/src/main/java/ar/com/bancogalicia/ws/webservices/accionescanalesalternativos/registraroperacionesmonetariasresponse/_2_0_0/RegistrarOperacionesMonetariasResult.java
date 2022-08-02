
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registraroperacionesmonetariasresponse._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraroperacionesmonetariasresponse/2_0_0}RegistrarOperacionesMonetariasResponse"/>
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
    "registrarOperacionesMonetariasResponse"
})
@XmlRootElement(name = "RegistrarOperacionesMonetariasResult")
public class RegistrarOperacionesMonetariasResult {

    @XmlElement(name = "RegistrarOperacionesMonetariasResponse", required = true)
    protected RegistrarOperacionesMonetariasResponse registrarOperacionesMonetariasResponse;

    /**
     * Obtiene el valor de la propiedad registrarOperacionesMonetariasResponse.
     * 
     * @return
     *     possible object is
     *     {@link RegistrarOperacionesMonetariasResponse }
     *     
     */
    public RegistrarOperacionesMonetariasResponse getRegistrarOperacionesMonetariasResponse() {
        return registrarOperacionesMonetariasResponse;
    }

    /**
     * Define el valor de la propiedad registrarOperacionesMonetariasResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarOperacionesMonetariasResponse }
     *     
     */
    public void setRegistrarOperacionesMonetariasResponse(RegistrarOperacionesMonetariasResponse value) {
        this.registrarOperacionesMonetariasResponse = value;
    }

}
