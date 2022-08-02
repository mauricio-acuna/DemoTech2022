
package ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetarequest._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/logincontarjetarequest/2_0_0}LoginConTarjetaRequest"/>
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
    "loginConTarjetaRequest"
})
@XmlRootElement(name = "LoginConTarjeta")
public class LoginConTarjeta {

    @XmlElement(name = "LoginConTarjetaRequest", required = true)
    protected LoginConTarjetaRequest loginConTarjetaRequest;

    /**
     * Obtiene el valor de la propiedad loginConTarjetaRequest.
     * 
     * @return
     *     possible object is
     *     {@link LoginConTarjetaRequest }
     *     
     */
    public LoginConTarjetaRequest getLoginConTarjetaRequest() {
        return loginConTarjetaRequest;
    }

    /**
     * Define el valor de la propiedad loginConTarjetaRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginConTarjetaRequest }
     *     
     */
    public void setLoginConTarjetaRequest(LoginConTarjetaRequest value) {
        this.loginConTarjetaRequest = value;
    }

}
