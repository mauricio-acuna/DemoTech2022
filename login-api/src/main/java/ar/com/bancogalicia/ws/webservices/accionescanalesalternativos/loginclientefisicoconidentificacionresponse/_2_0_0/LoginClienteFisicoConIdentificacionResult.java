
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionresponse._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionresponse/2_0_0}LoginClienteFisicoConIdentificacionResponse"/>
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
    "loginClienteFisicoConIdentificacionResponse"
})
@XmlRootElement(name = "LoginClienteFisicoConIdentificacionResult")
public class LoginClienteFisicoConIdentificacionResult {

    @XmlElement(name = "LoginClienteFisicoConIdentificacionResponse", required = true)
    protected LoginClienteFisicoConIdentificacionResponse loginClienteFisicoConIdentificacionResponse;

    /**
     * Obtiene el valor de la propiedad loginClienteFisicoConIdentificacionResponse.
     * 
     * @return
     *     possible object is
     *     {@link LoginClienteFisicoConIdentificacionResponse }
     *     
     */
    public LoginClienteFisicoConIdentificacionResponse getLoginClienteFisicoConIdentificacionResponse() {
        return loginClienteFisicoConIdentificacionResponse;
    }

    /**
     * Define el valor de la propiedad loginClienteFisicoConIdentificacionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginClienteFisicoConIdentificacionResponse }
     *     
     */
    public void setLoginClienteFisicoConIdentificacionResponse(LoginClienteFisicoConIdentificacionResponse value) {
        this.loginClienteFisicoConIdentificacionResponse = value;
    }

}
