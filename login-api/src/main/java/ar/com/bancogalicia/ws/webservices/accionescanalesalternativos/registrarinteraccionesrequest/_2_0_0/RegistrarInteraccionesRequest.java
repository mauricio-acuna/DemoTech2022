
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registrarinteraccionesrequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.mtechHeader;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Codigo;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Codigov2;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Id;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.NumeroCuentav2;


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
 *                   &lt;element name="Interaccion">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
 *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CodigoIntertipo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
 *                             &lt;element name="CodigoEstado" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
 *                             &lt;element name="CodigoError" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo" minOccurs="0"/>
 *                             &lt;element name="IdCliente" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                             &lt;element name="FechaHoraInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="FechaHoraFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="StopDebit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
 *                                       &lt;element name="TarjetaCredito">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CodigoFormaPago" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="CuentaDebito">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
 *                                                 &lt;element name="Cuenta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}numeroCuentav2"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DatosDebin" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CodigoEnvio" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
 *                                       &lt;element name="Ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DatosTerminal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlRootElement(name = "RegistrarInteraccionesRequest")
public class RegistrarInteraccionesRequest {

    @XmlElement(name = "mtechHeader", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0", required = true)
    protected mtechHeader mtechHeader;
    @XmlElement(name = "Datos", required = true)
    protected RegistrarInteraccionesRequest.Datos datos;

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
     *     {@link RegistrarInteraccionesRequest.Datos }
     *     
     */
    public RegistrarInteraccionesRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarInteraccionesRequest.Datos }
     *     
     */
    public void setDatos(RegistrarInteraccionesRequest.Datos value) {
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
     *         &lt;element name="Interaccion">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
     *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CodigoIntertipo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
     *                   &lt;element name="CodigoEstado" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
     *                   &lt;element name="CodigoError" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo" minOccurs="0"/>
     *                   &lt;element name="IdCliente" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *                   &lt;element name="FechaHoraInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="FechaHoraFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="StopDebit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
     *                             &lt;element name="TarjetaCredito">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CodigoFormaPago" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CuentaDebito">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
     *                                       &lt;element name="Cuenta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}numeroCuentav2"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DatosDebin" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CodigoEnvio" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
     *                             &lt;element name="Ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DatosTerminal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "interaccion"
    })
    public static class Datos {

        @XmlElement(name = "Interaccion", required = true)
        protected RegistrarInteraccionesRequest.Datos.Interaccion interaccion;

        /**
         * Obtiene el valor de la propiedad interaccion.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarInteraccionesRequest.Datos.Interaccion }
         *     
         */
        public RegistrarInteraccionesRequest.Datos.Interaccion getInteraccion() {
            return interaccion;
        }

        /**
         * Define el valor de la propiedad interaccion.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarInteraccionesRequest.Datos.Interaccion }
         *     
         */
        public void setInteraccion(RegistrarInteraccionesRequest.Datos.Interaccion value) {
            this.interaccion = value;
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
         *         &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
         *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CodigoIntertipo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
         *         &lt;element name="CodigoEstado" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
         *         &lt;element name="CodigoError" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo" minOccurs="0"/>
         *         &lt;element name="IdCliente" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
         *         &lt;element name="FechaHoraInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="FechaHoraFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="StopDebit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
         *                   &lt;element name="TarjetaCredito">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CodigoFormaPago" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CuentaDebito">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
         *                             &lt;element name="Cuenta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}numeroCuentav2"/>
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
         *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DatosDebin" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CodigoEnvio" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
         *                   &lt;element name="Ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DatosTerminal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
            "idOperacion",
            "tipo",
            "codigoIntertipo",
            "codigoEstado",
            "codigoError",
            "idCliente",
            "fechaHoraInicio",
            "fechaHoraFin",
            "stopDebit",
            "observaciones",
            "datosDebin"
        })
        public static class Interaccion {

            @XmlElement(name = "IdOperacion")
            protected Id idOperacion;
            @XmlElement(name = "Tipo")
            protected int tipo;
            @XmlElement(name = "CodigoIntertipo", required = true)
            protected Codigo codigoIntertipo;
            @XmlElement(name = "CodigoEstado", required = true)
            protected Codigo codigoEstado;
            @XmlElement(name = "CodigoError")
            protected Codigo codigoError;
            @XmlElement(name = "IdCliente", required = true)
            protected Id idCliente;
            @XmlElement(name = "FechaHoraInicio", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaHoraInicio;
            @XmlElement(name = "FechaHoraFin")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaHoraFin;
            @XmlElement(name = "StopDebit")
            protected RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit stopDebit;
            @XmlElement(name = "Observaciones", required = true)
            protected String observaciones;
            @XmlElement(name = "DatosDebin")
            protected RegistrarInteraccionesRequest.Datos.Interaccion.DatosDebin datosDebin;

            /**
             * Obtiene el valor de la propiedad idOperacion.
             * 
             * @return
             *     possible object is
             *     {@link Id }
             *     
             */
            public Id getIdOperacion() {
                return idOperacion;
            }

            /**
             * Define el valor de la propiedad idOperacion.
             * 
             * @param value
             *     allowed object is
             *     {@link Id }
             *     
             */
            public void setIdOperacion(Id value) {
                this.idOperacion = value;
            }

            /**
             * Obtiene el valor de la propiedad tipo.
             * 
             */
            public int getTipo() {
                return tipo;
            }

            /**
             * Define el valor de la propiedad tipo.
             * 
             */
            public void setTipo(int value) {
                this.tipo = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoIntertipo.
             * 
             * @return
             *     possible object is
             *     {@link Codigo }
             *     
             */
            public Codigo getCodigoIntertipo() {
                return codigoIntertipo;
            }

            /**
             * Define el valor de la propiedad codigoIntertipo.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigo }
             *     
             */
            public void setCodigoIntertipo(Codigo value) {
                this.codigoIntertipo = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoEstado.
             * 
             * @return
             *     possible object is
             *     {@link Codigo }
             *     
             */
            public Codigo getCodigoEstado() {
                return codigoEstado;
            }

            /**
             * Define el valor de la propiedad codigoEstado.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigo }
             *     
             */
            public void setCodigoEstado(Codigo value) {
                this.codigoEstado = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoError.
             * 
             * @return
             *     possible object is
             *     {@link Codigo }
             *     
             */
            public Codigo getCodigoError() {
                return codigoError;
            }

            /**
             * Define el valor de la propiedad codigoError.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigo }
             *     
             */
            public void setCodigoError(Codigo value) {
                this.codigoError = value;
            }

            /**
             * Obtiene el valor de la propiedad idCliente.
             * 
             * @return
             *     possible object is
             *     {@link Id }
             *     
             */
            public Id getIdCliente() {
                return idCliente;
            }

            /**
             * Define el valor de la propiedad idCliente.
             * 
             * @param value
             *     allowed object is
             *     {@link Id }
             *     
             */
            public void setIdCliente(Id value) {
                this.idCliente = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraInicio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraInicio() {
                return fechaHoraInicio;
            }

            /**
             * Define el valor de la propiedad fechaHoraInicio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraInicio(XMLGregorianCalendar value) {
                this.fechaHoraInicio = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraFin.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraFin() {
                return fechaHoraFin;
            }

            /**
             * Define el valor de la propiedad fechaHoraFin.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraFin(XMLGregorianCalendar value) {
                this.fechaHoraFin = value;
            }

            /**
             * Obtiene el valor de la propiedad stopDebit.
             * 
             * @return
             *     possible object is
             *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit }
             *     
             */
            public RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit getStopDebit() {
                return stopDebit;
            }

            /**
             * Define el valor de la propiedad stopDebit.
             * 
             * @param value
             *     allowed object is
             *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit }
             *     
             */
            public void setStopDebit(RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit value) {
                this.stopDebit = value;
            }

            /**
             * Obtiene el valor de la propiedad observaciones.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObservaciones() {
                return observaciones;
            }

            /**
             * Define el valor de la propiedad observaciones.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObservaciones(String value) {
                this.observaciones = value;
            }

            /**
             * Obtiene el valor de la propiedad datosDebin.
             * 
             * @return
             *     possible object is
             *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.DatosDebin }
             *     
             */
            public RegistrarInteraccionesRequest.Datos.Interaccion.DatosDebin getDatosDebin() {
                return datosDebin;
            }

            /**
             * Define el valor de la propiedad datosDebin.
             * 
             * @param value
             *     allowed object is
             *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.DatosDebin }
             *     
             */
            public void setDatosDebin(RegistrarInteraccionesRequest.Datos.Interaccion.DatosDebin value) {
                this.datosDebin = value;
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
             *         &lt;element name="CodigoEnvio" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
             *         &lt;element name="Ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DatosTerminal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
                "codigoEnvio",
                "ip",
                "datosTerminal"
            })
            public static class DatosDebin {

                @XmlElement(name = "CodigoEnvio", required = true)
                protected Codigov2 codigoEnvio;
                @XmlElement(name = "Ip")
                protected String ip;
                @XmlElement(name = "DatosTerminal")
                protected Object datosTerminal;

                /**
                 * Obtiene el valor de la propiedad codigoEnvio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Codigov2 }
                 *     
                 */
                public Codigov2 getCodigoEnvio() {
                    return codigoEnvio;
                }

                /**
                 * Define el valor de la propiedad codigoEnvio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Codigov2 }
                 *     
                 */
                public void setCodigoEnvio(Codigov2 value) {
                    this.codigoEnvio = value;
                }

                /**
                 * Obtiene el valor de la propiedad ip.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIp() {
                    return ip;
                }

                /**
                 * Define el valor de la propiedad ip.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIp(String value) {
                    this.ip = value;
                }

                /**
                 * Obtiene el valor de la propiedad datosTerminal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getDatosTerminal() {
                    return datosTerminal;
                }

                /**
                 * Define el valor de la propiedad datosTerminal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setDatosTerminal(Object value) {
                    this.datosTerminal = value;
                }

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
             *         &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id" minOccurs="0"/>
             *         &lt;element name="TarjetaCredito">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CodigoFormaPago" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CuentaDebito">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
             *                   &lt;element name="Cuenta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}numeroCuentav2"/>
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
                "idOperacion",
                "tarjetaCredito",
                "cuentaDebito"
            })
            public static class StopDebit {

                @XmlElement(name = "IdOperacion")
                protected Id idOperacion;
                @XmlElement(name = "TarjetaCredito", required = true)
                protected RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.TarjetaCredito tarjetaCredito;
                @XmlElement(name = "CuentaDebito", required = true)
                protected RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.CuentaDebito cuentaDebito;

                /**
                 * Obtiene el valor de la propiedad idOperacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Id }
                 *     
                 */
                public Id getIdOperacion() {
                    return idOperacion;
                }

                /**
                 * Define el valor de la propiedad idOperacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Id }
                 *     
                 */
                public void setIdOperacion(Id value) {
                    this.idOperacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad tarjetaCredito.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.TarjetaCredito }
                 *     
                 */
                public RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.TarjetaCredito getTarjetaCredito() {
                    return tarjetaCredito;
                }

                /**
                 * Define el valor de la propiedad tarjetaCredito.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.TarjetaCredito }
                 *     
                 */
                public void setTarjetaCredito(RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.TarjetaCredito value) {
                    this.tarjetaCredito = value;
                }

                /**
                 * Obtiene el valor de la propiedad cuentaDebito.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.CuentaDebito }
                 *     
                 */
                public RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.CuentaDebito getCuentaDebito() {
                    return cuentaDebito;
                }

                /**
                 * Define el valor de la propiedad cuentaDebito.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.CuentaDebito }
                 *     
                 */
                public void setCuentaDebito(RegistrarInteraccionesRequest.Datos.Interaccion.StopDebit.CuentaDebito value) {
                    this.cuentaDebito = value;
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
                 *         &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
                 *         &lt;element name="Cuenta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}numeroCuentav2"/>
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
                    "codigoMoneda",
                    "cuenta"
                })
                public static class CuentaDebito {

                    @XmlElement(name = "CodigoMoneda")
                    protected Codigov2 codigoMoneda;
                    @XmlElement(name = "Cuenta", required = true)
                    protected NumeroCuentav2 cuenta;

                    /**
                     * Obtiene el valor de la propiedad codigoMoneda.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Codigov2 }
                     *     
                     */
                    public Codigov2 getCodigoMoneda() {
                        return codigoMoneda;
                    }

                    /**
                     * Define el valor de la propiedad codigoMoneda.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Codigov2 }
                     *     
                     */
                    public void setCodigoMoneda(Codigov2 value) {
                        this.codigoMoneda = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cuenta.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NumeroCuentav2 }
                     *     
                     */
                    public NumeroCuentav2 getCuenta() {
                        return cuenta;
                    }

                    /**
                     * Define el valor de la propiedad cuenta.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NumeroCuentav2 }
                     *     
                     */
                    public void setCuenta(NumeroCuentav2 value) {
                        this.cuenta = value;
                    }

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
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CodigoFormaPago" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
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
                    "numero",
                    "codigoFormaPago"
                })
                public static class TarjetaCredito {

                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "CodigoFormaPago")
                    protected Codigov2 codigoFormaPago;

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
                     * Obtiene el valor de la propiedad codigoFormaPago.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Codigov2 }
                     *     
                     */
                    public Codigov2 getCodigoFormaPago() {
                        return codigoFormaPago;
                    }

                    /**
                     * Define el valor de la propiedad codigoFormaPago.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Codigov2 }
                     *     
                     */
                    public void setCodigoFormaPago(Codigov2 value) {
                        this.codigoFormaPago = value;
                    }

                }

            }

        }

    }

}
