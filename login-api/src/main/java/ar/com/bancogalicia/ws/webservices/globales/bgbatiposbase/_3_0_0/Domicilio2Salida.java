
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para domicilio2salida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="domicilio2salida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoUsoPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_2"/>
 *         &lt;element name="Calle" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_50"/>
 *         &lt;element name="CalleAbreviada" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_30" minOccurs="0"/>
 *         &lt;element name="NumeroPuerta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_6"/>
 *         &lt;element name="Piso" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_6" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_6" minOccurs="0"/>
 *         &lt;element name="Complemento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_30" minOccurs="0"/>
 *         &lt;element name="EntreCalle1" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_30" minOccurs="0"/>
 *         &lt;element name="EntreCalle2" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_30" minOccurs="0"/>
 *         &lt;element name="CodigoPostal" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric4" minOccurs="0"/>
 *         &lt;element name="CPA" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_8" minOccurs="0"/>
 *         &lt;element name="NombrePartido" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_30" minOccurs="0"/>
 *         &lt;element name="NombreLocalidad" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_30"/>
 *         &lt;element name="CodigoProvincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescripcionProvincia" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_20" minOccurs="0"/>
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescripcionPais" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_30" minOccurs="0"/>
 *         &lt;element name="EstadoGeoReferenciacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_2" minOccurs="0"/>
 *         &lt;element name="Latitud" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_11" minOccurs="0"/>
 *         &lt;element name="Longitud" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}alfanumerico_0_11" minOccurs="0"/>
 *         &lt;element name="SolicitoVerificacionDomicilio" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domicilio2salida", propOrder = {
    "codigoUsoPersona",
    "calle",
    "calleAbreviada",
    "numeroPuerta",
    "piso",
    "departamento",
    "complemento",
    "entreCalle1",
    "entreCalle2",
    "codigoPostal",
    "cpa",
    "nombrePartido",
    "nombreLocalidad",
    "codigoProvincia",
    "descripcionProvincia",
    "codigoPais",
    "descripcionPais",
    "estadoGeoReferenciacion",
    "latitud",
    "longitud",
    "solicitoVerificacionDomicilio"
})
public class Domicilio2Salida {

    @XmlElement(name = "CodigoUsoPersona", required = true)
    protected String codigoUsoPersona;
    @XmlElement(name = "Calle", required = true)
    protected String calle;
    @XmlElement(name = "CalleAbreviada")
    protected String calleAbreviada;
    @XmlElement(name = "NumeroPuerta", required = true)
    protected String numeroPuerta;
    @XmlElement(name = "Piso")
    protected String piso;
    @XmlElement(name = "Departamento")
    protected String departamento;
    @XmlElement(name = "Complemento")
    protected String complemento;
    @XmlElement(name = "EntreCalle1")
    protected String entreCalle1;
    @XmlElement(name = "EntreCalle2")
    protected String entreCalle2;
    @XmlElement(name = "CodigoPostal")
    protected Integer codigoPostal;
    @XmlElement(name = "CPA")
    protected String cpa;
    @XmlElement(name = "NombrePartido")
    protected String nombrePartido;
    @XmlElement(name = "NombreLocalidad", required = true)
    protected String nombreLocalidad;
    @XmlElement(name = "CodigoProvincia", required = true)
    protected String codigoProvincia;
    @XmlElement(name = "DescripcionProvincia")
    protected String descripcionProvincia;
    @XmlElement(name = "CodigoPais", required = true)
    protected String codigoPais;
    @XmlElement(name = "DescripcionPais")
    protected String descripcionPais;
    @XmlElement(name = "EstadoGeoReferenciacion")
    protected String estadoGeoReferenciacion;
    @XmlElement(name = "Latitud")
    protected String latitud;
    @XmlElement(name = "Longitud")
    protected String longitud;
    @XmlElement(name = "SolicitoVerificacionDomicilio")
    protected String solicitoVerificacionDomicilio;

    /**
     * Obtiene el valor de la propiedad codigoUsoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUsoPersona() {
        return codigoUsoPersona;
    }

    /**
     * Define el valor de la propiedad codigoUsoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUsoPersona(String value) {
        this.codigoUsoPersona = value;
    }

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
     * Obtiene el valor de la propiedad calleAbreviada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleAbreviada() {
        return calleAbreviada;
    }

    /**
     * Define el valor de la propiedad calleAbreviada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleAbreviada(String value) {
        this.calleAbreviada = value;
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
     * Obtiene el valor de la propiedad complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define el valor de la propiedad complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtiene el valor de la propiedad entreCalle1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntreCalle1() {
        return entreCalle1;
    }

    /**
     * Define el valor de la propiedad entreCalle1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntreCalle1(String value) {
        this.entreCalle1 = value;
    }

    /**
     * Obtiene el valor de la propiedad entreCalle2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntreCalle2() {
        return entreCalle2;
    }

    /**
     * Define el valor de la propiedad entreCalle2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntreCalle2(String value) {
        this.entreCalle2 = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoPostal(Integer value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad cpa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPA() {
        return cpa;
    }

    /**
     * Define el valor de la propiedad cpa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPA(String value) {
        this.cpa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePartido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePartido() {
        return nombrePartido;
    }

    /**
     * Define el valor de la propiedad nombrePartido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePartido(String value) {
        this.nombrePartido = value;
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
     * Obtiene el valor de la propiedad descripcionProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProvincia() {
        return descripcionProvincia;
    }

    /**
     * Define el valor de la propiedad descripcionProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProvincia(String value) {
        this.descripcionProvincia = value;
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
     * Obtiene el valor de la propiedad descripcionPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPais() {
        return descripcionPais;
    }

    /**
     * Define el valor de la propiedad descripcionPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPais(String value) {
        this.descripcionPais = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoGeoReferenciacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoGeoReferenciacion() {
        return estadoGeoReferenciacion;
    }

    /**
     * Define el valor de la propiedad estadoGeoReferenciacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoGeoReferenciacion(String value) {
        this.estadoGeoReferenciacion = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitud(String value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitud(String value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitoVerificacionDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitoVerificacionDomicilio() {
        return solicitoVerificacionDomicilio;
    }

    /**
     * Define el valor de la propiedad solicitoVerificacionDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitoVerificacionDomicilio(String value) {
        this.solicitoVerificacionDomicilio = value;
    }

}
