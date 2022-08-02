
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para telefonoBasicoCodigoDeUso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="telefonoBasicoCodigoDeUso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoDeUso" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_2"/>
 *         &lt;element name="CodigoPais" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token10" minOccurs="0"/>
 *         &lt;element name="CodigoArea" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token10"/>
 *         &lt;element name="Numero" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token30"/>
 *         &lt;element name="Interno" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token10" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="celular" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telefonoBasicoCodigoDeUso", propOrder = {
    "codigoDeUso",
    "codigoPais",
    "codigoArea",
    "numero",
    "interno"
})
public class TelefonoBasicoCodigoDeUso {

    @XmlElement(name = "CodigoDeUso", required = true)
    protected String codigoDeUso;
    @XmlElement(name = "CodigoPais")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codigoPais;
    @XmlElement(name = "CodigoArea", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codigoArea;
    @XmlElement(name = "Numero", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numero;
    @XmlElement(name = "Interno")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interno;
    @XmlAttribute(name = "celular")
    protected String celular;

    /**
     * Obtiene el valor de la propiedad codigoDeUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDeUso() {
        return codigoDeUso;
    }

    /**
     * Define el valor de la propiedad codigoDeUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDeUso(String value) {
        this.codigoDeUso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define el valor de la propiedad codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoArea() {
        return codigoArea;
    }

    /**
     * Define el valor de la propiedad codigoArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoArea(String value) {
        this.codigoArea = value;
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

    /**
     * Obtiene el valor de la propiedad interno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterno() {
        return interno;
    }

    /**
     * Define el valor de la propiedad interno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterno(String value) {
        this.interno = value;
    }

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

}
