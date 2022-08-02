
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadoresponse._1_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientesimplificadoresponse/1_0_0}LoginClienteSimplificadoResponse"/>
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
    "loginClienteSimplificadoResponse"
})
@XmlRootElement(name = "LoginClienteSimplificadoResult")
public class LoginClienteSimplificadoResult {

    @XmlElement(name = "LoginClienteSimplificadoResponse", required = true)
    protected LoginClienteSimplificadoResponse loginClienteSimplificadoResponse;

    /**
     * Obtiene el valor de la propiedad loginClienteSimplificadoResponse.
     * 
     * @return
     *     possible object is
     *     {@link LoginClienteSimplificadoResponse }
     *     
     */
    public LoginClienteSimplificadoResponse getLoginClienteSimplificadoResponse() {
        return loginClienteSimplificadoResponse;
    }

    /**
     * Define el valor de la propiedad loginClienteSimplificadoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginClienteSimplificadoResponse }
     *     
     */
    public void setLoginClienteSimplificadoResponse(LoginClienteSimplificadoResponse value) {
        this.loginClienteSimplificadoResponse = value;
    }

}
