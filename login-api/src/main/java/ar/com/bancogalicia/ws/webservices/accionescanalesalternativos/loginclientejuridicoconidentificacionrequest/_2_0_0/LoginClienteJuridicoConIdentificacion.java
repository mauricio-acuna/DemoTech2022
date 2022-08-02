
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientejuridicoconidentificacionrequest._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientejuridicoconidentificacionrequest/2_0_0}LoginClienteJuridicoConIdentificacionRequest"/>
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
    "loginClienteJuridicoConIdentificacionRequest"
})
@XmlRootElement(name = "LoginClienteJuridicoConIdentificacion")
public class LoginClienteJuridicoConIdentificacion {

    @XmlElement(name = "LoginClienteJuridicoConIdentificacionRequest", required = true)
    protected LoginClienteJuridicoConIdentificacionRequest loginClienteJuridicoConIdentificacionRequest;

    /**
     * Obtiene el valor de la propiedad loginClienteJuridicoConIdentificacionRequest.
     * 
     * @return
     *     possible object is
     *     {@link LoginClienteJuridicoConIdentificacionRequest }
     *     
     */
    public LoginClienteJuridicoConIdentificacionRequest getLoginClienteJuridicoConIdentificacionRequest() {
        return loginClienteJuridicoConIdentificacionRequest;
    }

    /**
     * Define el valor de la propiedad loginClienteJuridicoConIdentificacionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginClienteJuridicoConIdentificacionRequest }
     *     
     */
    public void setLoginClienteJuridicoConIdentificacionRequest(LoginClienteJuridicoConIdentificacionRequest value) {
        this.loginClienteJuridicoConIdentificacionRequest = value;
    }

}
