
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para domicilioFisico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="domicilioFisico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Calle" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico60"/>
 *         &lt;element name="NumeroPuerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Piso" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token10" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token10" minOccurs="0"/>
 *         &lt;element name="NombreLocalidad" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico40"/>
 *         &lt;element name="CodigoPostal" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token10"/>
 *         &lt;element name="Barrio" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico30" minOccurs="0"/>
 *         &lt;element name="Partido" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico30" minOccurs="0"/>
 *         &lt;element name="CodigoProvincia" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token6" minOccurs="0"/>
 *         &lt;element name="CodigoPais" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domicilioFisico", propOrder = {
    "calle",
    "numeroPuerta",
    "piso",
    "departamento",
    "nombreLocalidad",
    "codigoPostal",
    "barrio",
    "partido",
    "codigoProvincia",
    "codigoPais"
})
public class DomicilioFisico {

    @XmlElement(name = "Calle", required = true)
    protected String calle;
    @XmlElement(name = "NumeroPuerta", required = true)
    protected String numeroPuerta;
    @XmlElement(name = "Piso")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String piso;
    @XmlElement(name = "Departamento")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String departamento;
    @XmlElement(name = "NombreLocalidad", required = true)
    protected String nombreLocalidad;
    @XmlElement(name = "CodigoPostal", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codigoPostal;
    @XmlElement(name = "Barrio")
    protected String barrio;
    @XmlElement(name = "Partido")
    protected String partido;
    @XmlElement(name = "CodigoProvincia")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codigoProvincia;
    @XmlElement(name = "CodigoPais")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codigoPais;

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    /**
     * Define el valor de la propiedad numeroPuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPuerta(String value) {
        this.numeroPuerta = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    /**
     * Define el valor de la propiedad nombreLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreLocalidad(String value) {
        this.nombreLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad barrio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * Define el valor de la propiedad barrio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarrio(String value) {
        this.barrio = value;
    }

    /**
     * Obtiene el valor de la propiedad partido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartido() {
        return partido;
    }

    /**
     * Define el valor de la propiedad partido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartido(String value) {
        this.partido = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    /**
     * Define el valor de la propiedad codigoProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProvincia(String value) {
        this.codigoProvincia = value;
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

}
