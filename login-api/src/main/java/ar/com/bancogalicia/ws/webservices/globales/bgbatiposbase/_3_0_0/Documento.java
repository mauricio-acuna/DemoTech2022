
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para documento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tipo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
 *         &lt;element name="Numero" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *         &lt;element name="Emisor" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documento", propOrder = {
    "tipo",
    "numero",
    "emisor"
})
public class Documento {

    @XmlElement(name = "Tipo", required = true)
    protected Codigo tipo;
    @XmlElement(name = "Numero", required = true)
    protected Id numero;
    @XmlElement(name = "Emisor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String emisor;

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setTipo(Codigo value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setNumero(Id value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisor(String value) {
        this.emisor = value;
    }

}
