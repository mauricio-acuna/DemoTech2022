
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registraradhesionmetodoautenticacionresponse._1_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraradhesionmetodoautenticacionresponse/1_0_0}RegistrarAdhesionMetodoAutenticacionResponse"/>
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
    "registrarAdhesionMetodoAutenticacionResponse"
})
@XmlRootElement(name = "RegistrarAdhesionMetodoAutenticacionResult")
public class RegistrarAdhesionMetodoAutenticacionResult {

    @XmlElement(name = "RegistrarAdhesionMetodoAutenticacionResponse", required = true)
    protected RegistrarAdhesionMetodoAutenticacionResponse registrarAdhesionMetodoAutenticacionResponse;

    /**
     * Obtiene el valor de la propiedad registrarAdhesionMetodoAutenticacionResponse.
     * 
     * @return
     *     possible object is
     *     {@link RegistrarAdhesionMetodoAutenticacionResponse }
     *     
     */
    public RegistrarAdhesionMetodoAutenticacionResponse getRegistrarAdhesionMetodoAutenticacionResponse() {
        return registrarAdhesionMetodoAutenticacionResponse;
    }

    /**
     * Define el valor de la propiedad registrarAdhesionMetodoAutenticacionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarAdhesionMetodoAutenticacionResponse }
     *     
     */
    public void setRegistrarAdhesionMetodoAutenticacionResponse(RegistrarAdhesionMetodoAutenticacionResponse value) {
        this.registrarAdhesionMetodoAutenticacionResponse = value;
    }

}
