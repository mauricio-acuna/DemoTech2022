
package ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillaresponse._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacion;
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacionLog;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Codigo;
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
 *                   &lt;element name="IdSesion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                   &lt;element name="Semilla" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Resultado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Codigo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlRootElement(name = "GenerarSemillaResponse")
public class GenerarSemillaResponse {

    @XmlElement(name = "mtechResultadoOperacion", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0", required = true)
    protected mtechResultadoOperacion mtechResultadoOperacion;
    @XmlElement(name = "Datos")
    protected GenerarSemillaResponse.Datos datos;
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
     *     {@link GenerarSemillaResponse.Datos }
     *     
     */
    public GenerarSemillaResponse.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerarSemillaResponse.Datos }
     *     
     */
    public void setDatos(GenerarSemillaResponse.Datos value) {
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
     *         &lt;element name="IdSesion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *         &lt;element name="Semilla" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Resultado">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Codigo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
     *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idSesion",
        "semilla",
        "resultado"
    })
    public static class Datos {

        @XmlElement(name = "IdSesion", required = true)
        protected Id idSesion;
        @XmlElement(name = "Semilla", required = true)
        protected String semilla;
        @XmlElement(name = "Resultado", required = true)
        protected GenerarSemillaResponse.Datos.Resultado resultado;

        /**
         * Obtiene el valor de la propiedad idSesion.
         * 
         * @return
         *     possible object is
         *     {@link Id }
         *     
         */
        public Id getIdSesion() {
            return idSesion;
        }

        /**
         * Define el valor de la propiedad idSesion.
         * 
         * @param value
         *     allowed object is
         *     {@link Id }
         *     
         */
        public void setIdSesion(Id value) {
            this.idSesion = value;
        }

        /**
         * Obtiene el valor de la propiedad semilla.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSemilla() {
            return semilla;
        }

        /**
         * Define el valor de la propiedad semilla.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSemilla(String value) {
            this.semilla = value;
        }

        /**
         * Obtiene el valor de la propiedad resultado.
         * 
         * @return
         *     possible object is
         *     {@link GenerarSemillaResponse.Datos.Resultado }
         *     
         */
        public GenerarSemillaResponse.Datos.Resultado getResultado() {
            return resultado;
        }

        /**
         * Define el valor de la propiedad resultado.
         * 
         * @param value
         *     allowed object is
         *     {@link GenerarSemillaResponse.Datos.Resultado }
         *     
         */
        public void setResultado(GenerarSemillaResponse.Datos.Resultado value) {
            this.resultado = value;
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
         *         &lt;element name="Codigo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
         *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "codigo",
            "nombre",
            "descripcion"
        })
        public static class Resultado {

            @XmlElement(name = "Codigo", required = true)
            protected Codigo codigo;
            @XmlElement(name = "Nombre", required = true)
            protected String nombre;
            @XmlElement(name = "Descripcion", required = true)
            protected String descripcion;

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link Codigo }
             *     
             */
            public Codigo getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigo }
             *     
             */
            public void setCodigo(Codigo value) {
                this.codigo = value;
            }

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
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

        }

    }

}
