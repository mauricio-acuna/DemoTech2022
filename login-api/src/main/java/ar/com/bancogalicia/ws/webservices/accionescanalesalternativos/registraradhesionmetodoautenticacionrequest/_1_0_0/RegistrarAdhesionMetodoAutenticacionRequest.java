
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registraradhesionmetodoautenticacionrequest._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.mtechHeader;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Codigov2;
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
 *                   &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                   &lt;element name="MetodoAutenticacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
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
@XmlRootElement(name = "RegistrarAdhesionMetodoAutenticacionRequest")
public class RegistrarAdhesionMetodoAutenticacionRequest {

    @XmlElement(name = "mtechHeader", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0", required = true)
    protected mtechHeader mtechHeader;
    @XmlElement(name = "Datos", required = true)
    protected RegistrarAdhesionMetodoAutenticacionRequest.Datos datos;

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
     *     {@link RegistrarAdhesionMetodoAutenticacionRequest.Datos }
     *     
     */
    public RegistrarAdhesionMetodoAutenticacionRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarAdhesionMetodoAutenticacionRequest.Datos }
     *     
     */
    public void setDatos(RegistrarAdhesionMetodoAutenticacionRequest.Datos value) {
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
     *         &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *         &lt;element name="MetodoAutenticacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
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
        "metodoAutenticacion"
    })
    public static class Datos {

        @XmlElement(name = "IdPersona", required = true)
        protected Id idPersona;
        @XmlElement(name = "MetodoAutenticacion", required = true)
        protected Codigov2 metodoAutenticacion;

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
         * Obtiene el valor de la propiedad metodoAutenticacion.
         * 
         * @return
         *     possible object is
         *     {@link Codigov2 }
         *     
         */
        public Codigov2 getMetodoAutenticacion() {
            return metodoAutenticacion;
        }

        /**
         * Define el valor de la propiedad metodoAutenticacion.
         * 
         * @param value
         *     allowed object is
         *     {@link Codigov2 }
         *     
         */
        public void setMetodoAutenticacion(Codigov2 value) {
            this.metodoAutenticacion = value;
        }

    }

}
