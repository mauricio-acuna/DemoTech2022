
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadorequest._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.mtechHeader;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Id;


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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}mtechHeader"/>
 *         &lt;element name="Datos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumeroDocumento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                   &lt;element name="PinCSC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IdUsuario" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
    "mtechHeader",
    "datos"
})
@XmlRootElement(name = "LoginClienteSimplificadoRequest")
public class LoginClienteSimplificadoRequest {

    @XmlElement(name = "mtechHeader", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0", required = true)
    protected mtechHeader mtechHeader;
    @XmlElement(name = "Datos", required = true)
    protected LoginClienteSimplificadoRequest.Datos datos;

    /**
     * Obtiene el valor de la propiedad mtechHeader.
     * 
     * @return
     *     possible object is
     *     {@link mtechHeader }
     *     
     */
    public mtechHeader getmtechHeader() {
        return mtechHeader;
    }

    /**
     * Define el valor de la propiedad mtechHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link mtechHeader }
     *     
     */
    public void setmtechHeader(mtechHeader value) {
        this.mtechHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link LoginClienteSimplificadoRequest.Datos }
     *     
     */
    public LoginClienteSimplificadoRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginClienteSimplificadoRequest.Datos }
     *     
     */
    public void setDatos(LoginClienteSimplificadoRequest.Datos value) {
        this.datos = value;
    }


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
     *         &lt;element name="NumeroDocumento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *         &lt;element name="PinCSC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IdUsuario" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
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
        "numeroDocumento",
        "pinCSC",
        "idUsuario"
    })
    public static class Datos {

        @XmlElement(name = "NumeroDocumento", required = true)
        protected Id numeroDocumento;
        @XmlElement(name = "PinCSC", required = true)
        protected String pinCSC;
        @XmlElement(name = "IdUsuario")
        protected Id idUsuario;

        /**
         * Obtiene el valor de la propiedad numeroDocumento.
         * 
         * @return
         *     possible object is
         *     {@link Id }
         *     
         */
        public Id getNumeroDocumento() {
            return numeroDocumento;
        }

        /**
         * Define el valor de la propiedad numeroDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link Id }
         *     
         */
        public void setNumeroDocumento(Id value) {
            this.numeroDocumento = value;
        }

        /**
         * Obtiene el valor de la propiedad pinCSC.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCSC() {
            return pinCSC;
        }

        /**
         * Define el valor de la propiedad pinCSC.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCSC(String value) {
            this.pinCSC = value;
        }

        /**
         * Obtiene el valor de la propiedad idUsuario.
         * 
         * @return
         *     possible object is
         *     {@link Id }
         *     
         */
        public Id getIdUsuario() {
            return idUsuario;
        }

        /**
         * Define el valor de la propiedad idUsuario.
         * 
         * @param value
         *     allowed object is
         *     {@link Id }
         *     
         */
        public void setIdUsuario(Id value) {
            this.idUsuario = value;
        }

    }

}
