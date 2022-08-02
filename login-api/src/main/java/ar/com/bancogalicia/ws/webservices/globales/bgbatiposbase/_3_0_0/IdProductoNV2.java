
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para idProductoNV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idProductoNV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoSubsistema" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric5"/>
 *         &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric2"/>
 *         &lt;element name="NumeroCuenta">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0>alfanumerico25">
 *                 &lt;attribute name="IdBackend" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "idProductoNV2", propOrder = {
    "codigoSubsistema",
    "codigoMoneda",
    "numeroCuenta"
})
public class IdProductoNV2 {

    @XmlElement(name = "CodigoSubsistema")
    protected int codigoSubsistema;
    @XmlElement(name = "CodigoMoneda")
    protected int codigoMoneda;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected IdProductoNV2 .NumeroCuenta numeroCuenta;

    /**
     * Obtiene el valor de la propiedad codigoSubsistema.
     * 
     */
    public int getCodigoSubsistema() {
        return codigoSubsistema;
    }

    /**
     * Define el valor de la propiedad codigoSubsistema.
     * 
     */
    public void setCodigoSubsistema(int value) {
        this.codigoSubsistema = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     * 
     */
    public int getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     * 
     */
    public void setCodigoMoneda(int value) {
        this.codigoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link IdProductoNV2 .NumeroCuenta }
     *     
     */
    public IdProductoNV2 .NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link IdProductoNV2 .NumeroCuenta }
     *     
     */
    public void setNumeroCuenta(IdProductoNV2 .NumeroCuenta value) {
        this.numeroCuenta = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0>alfanumerico25">
     *       &lt;attribute name="IdBackend" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class NumeroCuenta {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "IdBackend")
        protected String idBackend;

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
         * Obtiene el valor de la propiedad idBackend.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdBackend() {
            return idBackend;
        }

        /**
         * Define el valor de la propiedad idBackend.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdBackend(String value) {
            this.idBackend = value;
        }

    }

}
