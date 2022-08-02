
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registrarinteraccionesrequest._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registrarinteraccionesrequest/2_0_0}RegistrarInteraccionesRequest"/>
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
    "registrarInteraccionesRequest"
})
@XmlRootElement(name = "RegistrarInteracciones")
public class RegistrarInteracciones {

    @XmlElement(name = "RegistrarInteraccionesRequest", required = true)
    protected RegistrarInteraccionesRequest registrarInteraccionesRequest;

    /**
     * Obtiene el valor de la propiedad registrarInteraccionesRequest.
     * 
     * @return
     *     possible object is
     *     {@link RegistrarInteraccionesRequest }
     *     
     */
    public RegistrarInteraccionesRequest getRegistrarInteraccionesRequest() {
        return registrarInteraccionesRequest;
    }

    /**
     * Define el valor de la propiedad registrarInteraccionesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarInteraccionesRequest }
     *     
     */
    public void setRegistrarInteraccionesRequest(RegistrarInteraccionesRequest value) {
        this.registrarInteraccionesRequest = value;
    }

}
