
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para numeroCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="numeroCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPaisfintech" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico3"/>
 *         &lt;element name="Idfintech" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico15"/>
 *         &lt;element name="Numero" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico35"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numeroCuenta", propOrder = {
    "idPaisfintech",
    "idfintech",
    "numero"
})
public class NumeroCuenta {

    @XmlElement(name = "IdPaisfintech", required = true)
    protected String idPaisfintech;
    @XmlElement(name = "Idfintech", required = true)
    protected String idfintech;
    @XmlElement(name = "Numero", required = true)
    protected String numero;

    /**
     * Obtiene el valor de la propiedad idPaisfintech.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaisfintech() {
        return idPaisfintech;
    }

    /**
     * Define el valor de la propiedad idPaisfintech.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaisfintech(String value) {
        this.idPaisfintech = value;
    }

    /**
     * Obtiene el valor de la propiedad idfintech.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdfintech() {
        return idfintech;
    }

    /**
     * Define el valor de la propiedad idfintech.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdfintech(String value) {
        this.idfintech = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

}
