
package ar.com.mautech.ws.webservices.globales.mtechheader._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idOperacionUnico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idOperacionUnico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdNumerador" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/1_0_0}alfanumerico3"/>
 *         &lt;element name="Id" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/1_0_0}alfanumerico32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idOperacionUnico", propOrder = {
    "idNumerador",
    "id"
})
public class IdOperacionUnico {

    @XmlElement(name = "IdNumerador", required = true)
    protected String idNumerador;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Obtiene el valor de la propiedad idNumerador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumerador() {
        return idNumerador;
    }

    /**
     * Define el valor de la propiedad idNumerador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumerador(String value) {
        this.idNumerador = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
