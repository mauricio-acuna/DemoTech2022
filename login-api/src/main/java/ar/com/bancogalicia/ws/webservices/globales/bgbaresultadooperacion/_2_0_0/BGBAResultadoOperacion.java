
package ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Severidad" type="{http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0}severidad"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URLDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdRespuesta" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="nombreProveedor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "severidad",
    "codigo",
    "descripcion",
    "tipo",
    "urlDetalle",
    "idRespuesta"
})
@XmlRootElement(name = "mtechResultadoOperacion")
public class mtechResultadoOperacion {

    @XmlElement(name = "Severidad", required = true)
    protected Severidad severidad;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "URLDetalle")
    protected String urlDetalle;
    @XmlElement(name = "IdRespuesta")
    protected mtechResultadoOperacion.IdRespuesta idRespuesta;

    /**
     * Obtiene el valor de la propiedad severidad.
     * 
     * @return
     *     possible object is
     *     {@link Severidad }
     *     
     */
    public Severidad getSeveridad() {
        return severidad;
    }

    /**
     * Define el valor de la propiedad severidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Severidad }
     *     
     */
    public void setSeveridad(Severidad value) {
        this.severidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad urlDetalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLDetalle() {
        return urlDetalle;
    }

    /**
     * Define el valor de la propiedad urlDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLDetalle(String value) {
        this.urlDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad idRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link mtechResultadoOperacion.IdRespuesta }
     *     
     */
    public mtechResultadoOperacion.IdRespuesta getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * Define el valor de la propiedad idRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link mtechResultadoOperacion.IdRespuesta }
     *     
     */
    public void setIdRespuesta(mtechResultadoOperacion.IdRespuesta value) {
        this.idRespuesta = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="nombreProveedor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class IdRespuesta {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "nombreProveedor", required = true)
        protected String nombreProveedor;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreProveedor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreProveedor() {
            return nombreProveedor;
        }

        /**
         * Define el valor de la propiedad nombreProveedor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreProveedor(String value) {
            this.nombreProveedor = value;
        }

    }

}
