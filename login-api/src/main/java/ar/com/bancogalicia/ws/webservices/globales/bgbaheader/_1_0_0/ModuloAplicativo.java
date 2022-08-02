
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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/1_0_0}Idmtech"/>
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/1_0_0}IdInterno"/>
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
    "idmtech",
    "idInterno"
})
@XmlRootElement(name = "ModuloAplicativo")
public class ModuloAplicativo {

    @XmlElement(name = "Idmtech", required = true)
    protected String idmtech;
    @XmlElement(name = "IdInterno", required = true)
    protected String idInterno;

    /**
     * Obtiene el valor de la propiedad idmtech.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdmtech() {
        return idmtech;
    }

    /**
     * Define el valor de la propiedad idmtech.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdmtech(String value) {
        this.idmtech = value;
    }

    /**
     * Obtiene el valor de la propiedad idInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInterno() {
        return idInterno;
    }

    /**
     * Define el valor de la propiedad idInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInterno(String value) {
        this.idInterno = value;
    }

}
