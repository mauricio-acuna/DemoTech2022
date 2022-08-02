
package ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillaresponse._1_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionesseguridadomnichannel/generarsemillaresponse/1_0_0}GenerarSemillaResponse"/>
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
    "generarSemillaResponse"
})
@XmlRootElement(name = "GenerarSemillaResult")
public class GenerarSemillaResult {

    @XmlElement(name = "GenerarSemillaResponse", required = true)
    protected GenerarSemillaResponse generarSemillaResponse;

    /**
     * Obtiene el valor de la propiedad generarSemillaResponse.
     * 
     * @return
     *     possible object is
     *     {@link GenerarSemillaResponse }
     *     
     */
    public GenerarSemillaResponse getGenerarSemillaResponse() {
        return generarSemillaResponse;
    }

    /**
     * Define el valor de la propiedad generarSemillaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerarSemillaResponse }
     *     
     */
    public void setGenerarSemillaResponse(GenerarSemillaResponse value) {
        this.generarSemillaResponse = value;
    }

}
