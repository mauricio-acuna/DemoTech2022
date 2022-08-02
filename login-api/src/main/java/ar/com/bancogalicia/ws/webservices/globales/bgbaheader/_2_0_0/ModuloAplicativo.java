
package ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0;

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
 *         &lt;element name="Idmtech" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdConsumidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idConsumidor",
    "idProveedor"
})
@XmlRootElement(name = "ModuloAplicativo")
public class ModuloAplicativo {

    @XmlElement(name = "Idmtech", required = true)
    protected String idmtech;
    @XmlElement(name = "IdConsumidor")
    protected String idConsumidor;
    @XmlElement(name = "IdProveedor")
    protected String idProveedor;

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
     * Obtiene el valor de la propiedad idConsumidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdConsumidor() {
        return idConsumidor;
    }

    /**
     * Define el valor de la propiedad idConsumidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdConsumidor(String value) {
        this.idConsumidor = value;
    }

    /**
     * Obtiene el valor de la propiedad idProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     * Define el valor de la propiedad idProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProveedor(String value) {
        this.idProveedor = value;
    }

}
