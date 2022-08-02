
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registrarinteraccionesresponse._2_0_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacion;
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacionLog;


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
 *                   &lt;element name="NumeroInteraccion" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlRootElement(name = "RegistrarInteraccionesResponse")
public class RegistrarInteraccionesResponse {

    @XmlElement(name = "mtechResultadoOperacion", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0", required = true)
    protected mtechResultadoOperacion mtechResultadoOperacion;
    @XmlElement(name = "Datos")
    protected RegistrarInteraccionesResponse.Datos datos;
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
     *     {@link RegistrarInteraccionesResponse.Datos }
     *     
     */
    public RegistrarInteraccionesResponse.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarInteraccionesResponse.Datos }
     *     
     */
    public void setDatos(RegistrarInteraccionesResponse.Datos value) {
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
     *         &lt;element name="NumeroInteraccion" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "numeroInteraccion"
    })
    public static class Datos {

        @XmlElement(name = "NumeroInteraccion", required = true)
        protected BigInteger numeroInteraccion;

        /**
         * Obtiene el valor de la propiedad numeroInteraccion.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumeroInteraccion() {
            return numeroInteraccion;
        }

        /**
         * Define el valor de la propiedad numeroInteraccion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumeroInteraccion(BigInteger value) {
            this.numeroInteraccion = value;
        }

    }

}
