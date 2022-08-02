
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registraradhesionmetodoautenticacionrequest._1_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraradhesionmetodoautenticacionrequest/1_0_0}RegistrarAdhesionMetodoAutenticacionRequest"/>
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
    "registrarAdhesionMetodoAutenticacionRequest"
})
@XmlRootElement(name = "RegistrarAdhesionMetodoAutenticacion")
public class RegistrarAdhesionMetodoAutenticacion {

    @XmlElement(name = "RegistrarAdhesionMetodoAutenticacionRequest", required = true)
    protected RegistrarAdhesionMetodoAutenticacionRequest registrarAdhesionMetodoAutenticacionRequest;

    /**
     * Obtiene el valor de la propiedad registrarAdhesionMetodoAutenticacionRequest.
     * 
     * @return
     *     possible object is
     *     {@link RegistrarAdhesionMetodoAutenticacionRequest }
     *     
     */
    public RegistrarAdhesionMetodoAutenticacionRequest getRegistrarAdhesionMetodoAutenticacionRequest() {
        return registrarAdhesionMetodoAutenticacionRequest;
    }

    /**
     * Define el valor de la propiedad registrarAdhesionMetodoAutenticacionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarAdhesionMetodoAutenticacionRequest }
     *     
     */
    public void setRegistrarAdhesionMetodoAutenticacionRequest(RegistrarAdhesionMetodoAutenticacionRequest value) {
        this.registrarAdhesionMetodoAutenticacionRequest = value;
    }

}
