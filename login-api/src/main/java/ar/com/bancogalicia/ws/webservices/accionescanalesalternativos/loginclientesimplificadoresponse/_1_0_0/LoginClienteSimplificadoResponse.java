
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadoresponse._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacion;
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacionLog;
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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0}mtechResultadoOperacion"/>
 *         &lt;element name="Datos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                   &lt;element name="IdAdhesion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0}mtechResultadoOperacionLog"/>
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
    "mtechResultadoOperacion",
    "datos",
    "mtechResultadoOperacionLog"
})
@XmlRootElement(name = "LoginClienteSimplificadoResponse")
public class LoginClienteSimplificadoResponse {

    @XmlElement(name = "mtechResultadoOperacion", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0", required = true)
    protected mtechResultadoOperacion mtechResultadoOperacion;
    @XmlElement(name = "Datos")
    protected LoginClienteSimplificadoResponse.Datos datos;
    @XmlElement(name = "mtechResultadoOperacionLog", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0", required = true)
    protected mtechResultadoOperacionLog mtechResultadoOperacionLog;

    /**
     * Obtiene el valor de la propiedad mtechResultadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link mtechResultadoOperacion }
     *     
     */
    public mtechResultadoOperacion getmtechResultadoOperacion() {
        return mtechResultadoOperacion;
    }

    /**
     * Define el valor de la propiedad mtechResultadoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link mtechResultadoOperacion }
     *     
     */
    public void setmtechResultadoOperacion(mtechResultadoOperacion value) {
        this.mtechResultadoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link LoginClienteSimplificadoResponse.Datos }
     *     
     */
    public LoginClienteSimplificadoResponse.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginClienteSimplificadoResponse.Datos }
     *     
     */
    public void setDatos(LoginClienteSimplificadoResponse.Datos value) {
        this.datos = value;
    }

    /**
     * Obtiene el valor de la propiedad mtechResultadoOperacionLog.
     * 
     * @return
     *     possible object is
     *     {@link mtechResultadoOperacionLog }
     *     
     */
    public mtechResultadoOperacionLog getmtechResultadoOperacionLog() {
        return mtechResultadoOperacionLog;
    }

    /**
     * Define el valor de la propiedad mtechResultadoOperacionLog.
     * 
     * @param value
     *     allowed object is
     *     {@link mtechResultadoOperacionLog }
     *     
     */
    public void setmtechResultadoOperacionLog(mtechResultadoOperacionLog value) {
        this.mtechResultadoOperacionLog = value;
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
     *         &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *         &lt;element name="IdAdhesion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
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
        "idPersona",
        "idAdhesion"
    })
    public static class Datos {

        @XmlElement(name = "IdPersona", required = true)
        protected Id idPersona;
        @XmlElement(name = "IdAdhesion", required = true)
        protected Id idAdhesion;

        /**
         * Obtiene el valor de la propiedad idPersona.
         * 
         * @return
         *     possible object is
         *     {@link Id }
         *     
         */
        public Id getIdPersona() {
            return idPersona;
        }

        /**
         * Define el valor de la propiedad idPersona.
         * 
         * @param value
         *     allowed object is
         *     {@link Id }
         *     
         */
        public void setIdPersona(Id value) {
            this.idPersona = value;
        }

        /**
         * Obtiene el valor de la propiedad idAdhesion.
         * 
         * @return
         *     possible object is
         *     {@link Id }
         *     
         */
        public Id getIdAdhesion() {
            return idAdhesion;
        }

        /**
         * Define el valor de la propiedad idAdhesion.
         * 
         * @param value
         *     allowed object is
         *     {@link Id }
         *     
         */
        public void setIdAdhesion(Id value) {
            this.idAdhesion = value;
        }

    }

}
