
package ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillarequest._1_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/accionesseguridadomnichannel/generarsemillarequest/1_0_0}GenerarSemillaRequest"/>
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
    "generarSemillaRequest"
})
@XmlRootElement(name = "GenerarSemilla")
public class GenerarSemilla {

    @XmlElement(name = "GenerarSemillaRequest", required = true)
    protected GenerarSemillaRequest generarSemillaRequest;

    /**
     * Obtiene el valor de la propiedad generarSemillaRequest.
     * 
     * @return
     *     possible object is
     *     {@link GenerarSemillaRequest }
     *     
     */
    public GenerarSemillaRequest getGenerarSemillaRequest() {
        return generarSemillaRequest;
    }

    /**
     * Define el valor de la propiedad generarSemillaRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerarSemillaRequest }
     *     
     */
    public void setGenerarSemillaRequest(GenerarSemillaRequest value) {
        this.generarSemillaRequest = value;
    }

}
