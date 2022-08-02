
package ar.com.mautech.ws.webservices.globales.mtechheader._1_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/1_0_0}Consumidor"/>
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
    "consumidor"
})
@XmlRootElement(name = "Consumidores")
public class Consumidores {

    @XmlElement(name = "Consumidor", required = true)
    protected Consumidor consumidor;

    /**
     * Obtiene el valor de la propiedad consumidor.
     * 
     * @return
     *     possible object is
     *     {@link Consumidor }
     *     
     */
    public Consumidor getConsumidor() {
        return consumidor;
    }

    /**
     * Define el valor de la propiedad consumidor.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumidor }
     *     
     */
    public void setConsumidor(Consumidor value) {
        this.consumidor = value;
    }

}
