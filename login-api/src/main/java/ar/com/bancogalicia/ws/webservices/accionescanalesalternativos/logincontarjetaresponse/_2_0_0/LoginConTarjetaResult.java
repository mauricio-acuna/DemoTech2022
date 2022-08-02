
package ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetaresponse._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/logincontarjetaresponse/2_0_0}LoginConTarjetaResponse"/>
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
    "loginConTarjetaResponse"
})
@XmlRootElement(name = "LoginConTarjetaResult")
public class LoginConTarjetaResult {

    @XmlElement(name = "LoginConTarjetaResponse", required = true)
    protected LoginConTarjetaResponse loginConTarjetaResponse;

    /**
     * Obtiene el valor de la propiedad loginConTarjetaResponse.
     * 
     * @return
     *     possible object is
     *     {@link LoginConTarjetaResponse }
     *     
     */
    public LoginConTarjetaResponse getLoginConTarjetaResponse() {
        return loginConTarjetaResponse;
    }

    /**
     * Define el valor de la propiedad loginConTarjetaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginConTarjetaResponse }
     *     
     */
    public void setLoginConTarjetaResponse(LoginConTarjetaResponse value) {
        this.loginConTarjetaResponse = value;
    }

}
