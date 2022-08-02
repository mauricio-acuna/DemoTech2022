
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientejuridicoconidentificacionresponse._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientejuridicoconidentificacionresponse/2_0_0}LoginClienteJuridicoConIdentificacionResponse"/>
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
    "loginClienteJuridicoConIdentificacionResponse"
})
@XmlRootElement(name = "LoginClienteJuridicoConIdentificacionResult")
public class LoginClienteJuridicoConIdentificacionResult {

    @XmlElement(name = "LoginClienteJuridicoConIdentificacionResponse", required = true)
    protected LoginClienteJuridicoConIdentificacionResponse loginClienteJuridicoConIdentificacionResponse;

    /**
     * Obtiene el valor de la propiedad loginClienteJuridicoConIdentificacionResponse.
     * 
     * @return
     *     possible object is
     *     {@link LoginClienteJuridicoConIdentificacionResponse }
     *     
     */
    public LoginClienteJuridicoConIdentificacionResponse getLoginClienteJuridicoConIdentificacionResponse() {
        return loginClienteJuridicoConIdentificacionResponse;
    }

    /**
     * Define el valor de la propiedad loginClienteJuridicoConIdentificacionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginClienteJuridicoConIdentificacionResponse }
     *     
     */
    public void setLoginClienteJuridicoConIdentificacionResponse(LoginClienteJuridicoConIdentificacionResponse value) {
        this.loginClienteJuridicoConIdentificacionResponse = value;
    }

}
