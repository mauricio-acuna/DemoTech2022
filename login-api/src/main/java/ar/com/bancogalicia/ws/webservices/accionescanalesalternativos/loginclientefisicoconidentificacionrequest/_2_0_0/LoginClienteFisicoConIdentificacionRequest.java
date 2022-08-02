
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionrequest._2_0_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.mtechHeader;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Documento;
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
 *                   &lt;element name="TipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CantidadClientes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                   &lt;element name="DetallesClientes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetalleCliente" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                                       &lt;element name="NombreYApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Documento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}documento" maxOccurs="2"/>
 *                                       &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SegmentoOrigen" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="Empleadomtech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AdhesionCanalesAlternativos" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Estado" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoAdhesion"/>
 *                                                 &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                 &lt;element name="EstadoMigracion" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoMigracion"/>
 *                                                 &lt;element name="IdClaveSistemaCentralSeguridad" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                                                 &lt;element name="AceptacionTerminosCondiciones" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
 *                                                 &lt;element name="ClienteEfectuaOperacionesRiesgo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
 *                                                 &lt;element name="FechaCambio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="CantidadIntentosFallidosPin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                                 &lt;element name="Bloqueo" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CantidadCambioPin" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric3"/>
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PIN" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SistemaCentralSeguridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CanalesAlternativos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InformacionCampania" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
 *                   &lt;element name="InformacionAlertas" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
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
@XmlRootElement(name = "LoginClienteFisicoConIdentificacionRequest")
public class LoginClienteFisicoConIdentificacionRequest {

    @XmlElement(name = "mtechHeader", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0", required = true)
    protected mtechHeader mtechHeader;
    @XmlElement(name = "Datos", required = true)
    protected LoginClienteFisicoConIdentificacionRequest.Datos datos;

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
     *     {@link LoginClienteFisicoConIdentificacionRequest.Datos }
     *     
     */
    public LoginClienteFisicoConIdentificacionRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginClienteFisicoConIdentificacionRequest.Datos }
     *     
     */
    public void setDatos(LoginClienteFisicoConIdentificacionRequest.Datos value) {
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
     *         &lt;element name="TipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CantidadClientes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *         &lt;element name="DetallesClientes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetalleCliente" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *                             &lt;element name="NombreYApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Documento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}documento" maxOccurs="2"/>
     *                             &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SegmentoOrigen" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="Empleadomtech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AdhesionCanalesAlternativos" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Estado" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoAdhesion"/>
     *                                       &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="EstadoMigracion" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoMigracion"/>
     *                                       &lt;element name="IdClaveSistemaCentralSeguridad" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *                                       &lt;element name="AceptacionTerminosCondiciones" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
     *                                       &lt;element name="ClienteEfectuaOperacionesRiesgo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
     *                                       &lt;element name="FechaCambio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="CantidadIntentosFallidosPin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                                       &lt;element name="Bloqueo" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="CantidadCambioPin" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric3"/>
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
     *         &lt;element name="PIN" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SistemaCentralSeguridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CanalesAlternativos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InformacionCampania" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
     *         &lt;element name="InformacionAlertas" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
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
        "tipoTransaccion",
        "cantidadClientes",
        "detallesClientes",
        "pin",
        "informacionCampania",
        "informacionAlertas"
    })
    public static class Datos {

        @XmlElement(name = "TipoTransaccion", required = true)
        protected String tipoTransaccion;
        @XmlElement(name = "CantidadClientes", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger cantidadClientes;
        @XmlElement(name = "DetallesClientes", required = true)
        protected LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes detallesClientes;
        @XmlElement(name = "PIN")
        protected LoginClienteFisicoConIdentificacionRequest.Datos.PIN pin;
        @XmlElement(name = "InformacionCampania", required = true)
        protected String informacionCampania;
        @XmlElement(name = "InformacionAlertas", required = true)
        protected String informacionAlertas;

        /**
         * Obtiene el valor de la propiedad tipoTransaccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoTransaccion() {
            return tipoTransaccion;
        }

        /**
         * Define el valor de la propiedad tipoTransaccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoTransaccion(String value) {
            this.tipoTransaccion = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidadClientes.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantidadClientes() {
            return cantidadClientes;
        }

        /**
         * Define el valor de la propiedad cantidadClientes.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantidadClientes(BigInteger value) {
            this.cantidadClientes = value;
        }

        /**
         * Obtiene el valor de la propiedad detallesClientes.
         * 
         * @return
         *     possible object is
         *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes }
         *     
         */
        public LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes getDetallesClientes() {
            return detallesClientes;
        }

        /**
         * Define el valor de la propiedad detallesClientes.
         * 
         * @param value
         *     allowed object is
         *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes }
         *     
         */
        public void setDetallesClientes(LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes value) {
            this.detallesClientes = value;
        }

        /**
         * Obtiene el valor de la propiedad pin.
         * 
         * @return
         *     possible object is
         *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.PIN }
         *     
         */
        public LoginClienteFisicoConIdentificacionRequest.Datos.PIN getPIN() {
            return pin;
        }

        /**
         * Define el valor de la propiedad pin.
         * 
         * @param value
         *     allowed object is
         *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.PIN }
         *     
         */
        public void setPIN(LoginClienteFisicoConIdentificacionRequest.Datos.PIN value) {
            this.pin = value;
        }

        /**
         * Obtiene el valor de la propiedad informacionCampania.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInformacionCampania() {
            return informacionCampania;
        }

        /**
         * Define el valor de la propiedad informacionCampania.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInformacionCampania(String value) {
            this.informacionCampania = value;
        }

        /**
         * Obtiene el valor de la propiedad informacionAlertas.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInformacionAlertas() {
            return informacionAlertas;
        }

        /**
         * Define el valor de la propiedad informacionAlertas.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInformacionAlertas(String value) {
            this.informacionAlertas = value;
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
         *         &lt;element name="DetalleCliente" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
         *                   &lt;element name="NombreYApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Documento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}documento" maxOccurs="2"/>
         *                   &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SegmentoOrigen" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="Empleadomtech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AdhesionCanalesAlternativos" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Estado" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoAdhesion"/>
         *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="EstadoMigracion" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoMigracion"/>
         *                             &lt;element name="IdClaveSistemaCentralSeguridad" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
         *                             &lt;element name="AceptacionTerminosCondiciones" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
         *                             &lt;element name="ClienteEfectuaOperacionesRiesgo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
         *                             &lt;element name="FechaCambio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="CantidadIntentosFallidosPin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                             &lt;element name="Bloqueo" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="CantidadCambioPin" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric3"/>
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
            "detalleCliente"
        })
        public static class DetallesClientes {

            @XmlElement(name = "DetalleCliente", required = true)
            protected List<LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente> detalleCliente;

            /**
             * Gets the value of the detalleCliente property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalleCliente property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalleCliente().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente }
             * 
             * 
             */
            public List<LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente> getDetalleCliente() {
                if (detalleCliente == null) {
                    detalleCliente = new ArrayList<LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente>();
                }
                return this.detalleCliente;
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
             *         &lt;element name="NombreYApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Documento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}documento" maxOccurs="2"/>
             *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SegmentoOrigen" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="Empleadomtech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AdhesionCanalesAlternativos" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Estado" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoAdhesion"/>
             *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="EstadoMigracion" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoMigracion"/>
             *                   &lt;element name="IdClaveSistemaCentralSeguridad" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
             *                   &lt;element name="AceptacionTerminosCondiciones" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
             *                   &lt;element name="ClienteEfectuaOperacionesRiesgo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
             *                   &lt;element name="FechaCambio" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="CantidadIntentosFallidosPin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *                   &lt;element name="Bloqueo" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="CantidadCambioPin" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric3"/>
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
                "idPersona",
                "nombreYApellido",
                "documento",
                "fechaNacimiento",
                "sexo",
                "segmentoOrigen",
                "segmento",
                "empleadomtech",
                "adhesionCanalesAlternativos"
            })
            public static class DetalleCliente {

                @XmlElement(name = "IdPersona", required = true)
                protected Id idPersona;
                @XmlElement(name = "NombreYApellido", required = true)
                protected String nombreYApellido;
                @XmlElement(name = "Documento", required = true)
                protected List<Documento> documento;
                @XmlElement(name = "FechaNacimiento", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar fechaNacimiento;
                @XmlElement(name = "Sexo", required = true)
                protected String sexo;
                @XmlElement(name = "SegmentoOrigen")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger segmentoOrigen;
                @XmlElement(name = "Segmento")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger segmento;
                @XmlElement(name = "Empleadomtech")
                protected String empleadomtech;
                @XmlElement(name = "AdhesionCanalesAlternativos")
                protected LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos adhesionCanalesAlternativos;

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
                 * Obtiene el valor de la propiedad nombreYApellido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreYApellido() {
                    return nombreYApellido;
                }

                /**
                 * Define el valor de la propiedad nombreYApellido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreYApellido(String value) {
                    this.nombreYApellido = value;
                }

                /**
                 * Gets the value of the documento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the documento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocumento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Documento }
                 * 
                 * 
                 */
                public List<Documento> getDocumento() {
                    if (documento == null) {
                        documento = new ArrayList<Documento>();
                    }
                    return this.documento;
                }

                /**
                 * Obtiene el valor de la propiedad fechaNacimiento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaNacimiento() {
                    return fechaNacimiento;
                }

                /**
                 * Define el valor de la propiedad fechaNacimiento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaNacimiento(XMLGregorianCalendar value) {
                    this.fechaNacimiento = value;
                }

                /**
                 * Obtiene el valor de la propiedad sexo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSexo() {
                    return sexo;
                }

                /**
                 * Define el valor de la propiedad sexo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSexo(String value) {
                    this.sexo = value;
                }

                /**
                 * Obtiene el valor de la propiedad segmentoOrigen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSegmentoOrigen() {
                    return segmentoOrigen;
                }

                /**
                 * Define el valor de la propiedad segmentoOrigen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSegmentoOrigen(BigInteger value) {
                    this.segmentoOrigen = value;
                }

                /**
                 * Obtiene el valor de la propiedad segmento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSegmento() {
                    return segmento;
                }

                /**
                 * Define el valor de la propiedad segmento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSegmento(BigInteger value) {
                    this.segmento = value;
                }

                /**
                 * Obtiene el valor de la propiedad empleadomtech.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmpleadomtech() {
                    return empleadomtech;
                }

                /**
                 * Define el valor de la propiedad empleadomtech.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmpleadomtech(String value) {
                    this.empleadomtech = value;
                }

                /**
                 * Obtiene el valor de la propiedad adhesionCanalesAlternativos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos }
                 *     
                 */
                public LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos getAdhesionCanalesAlternativos() {
                    return adhesionCanalesAlternativos;
                }

                /**
                 * Define el valor de la propiedad adhesionCanalesAlternativos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos }
                 *     
                 */
                public void setAdhesionCanalesAlternativos(LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos value) {
                    this.adhesionCanalesAlternativos = value;
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
                 *         &lt;element name="Estado" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoAdhesion"/>
                 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="EstadoMigracion" type="{http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0}estadoMigracion"/>
                 *         &lt;element name="IdClaveSistemaCentralSeguridad" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
                 *         &lt;element name="AceptacionTerminosCondiciones" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
                 *         &lt;element name="ClienteEfectuaOperacionesRiesgo" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
                 *         &lt;element name="FechaCambio" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="CantidadIntentosFallidosPin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                 *         &lt;element name="Bloqueo" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="CantidadCambioPin" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric3"/>
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
                    "estado",
                    "fecha",
                    "numero",
                    "estadoMigracion",
                    "idClaveSistemaCentralSeguridad",
                    "aceptacionTerminosCondiciones",
                    "clienteEfectuaOperacionesRiesgo",
                    "fechaCambio",
                    "cantidadIntentosFallidosPin",
                    "bloqueo",
                    "cantidadCambioPin"
                })
                public static class AdhesionCanalesAlternativos {

                    @XmlElement(name = "Estado", required = true)
                    protected EstadoAdhesion estado;
                    @XmlElement(name = "Fecha", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar fecha;
                    @XmlElement(name = "Numero", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger numero;
                    @XmlElement(name = "EstadoMigracion", required = true)
                    protected EstadoMigracion estadoMigracion;
                    @XmlElement(name = "IdClaveSistemaCentralSeguridad", required = true)
                    protected Id idClaveSistemaCentralSeguridad;
                    @XmlElement(name = "AceptacionTerminosCondiciones", required = true)
                    protected String aceptacionTerminosCondiciones;
                    @XmlElement(name = "ClienteEfectuaOperacionesRiesgo", required = true)
                    protected String clienteEfectuaOperacionesRiesgo;
                    @XmlElement(name = "FechaCambio", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar fechaCambio;
                    @XmlElement(name = "CantidadIntentosFallidosPin")
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger cantidadIntentosFallidosPin;
                    @XmlElement(name = "Bloqueo")
                    protected LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos.Bloqueo bloqueo;
                    @XmlElement(name = "CantidadCambioPin")
                    protected int cantidadCambioPin;

                    /**
                     * Obtiene el valor de la propiedad estado.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EstadoAdhesion }
                     *     
                     */
                    public EstadoAdhesion getEstado() {
                        return estado;
                    }

                    /**
                     * Define el valor de la propiedad estado.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EstadoAdhesion }
                     *     
                     */
                    public void setEstado(EstadoAdhesion value) {
                        this.estado = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fecha.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getFecha() {
                        return fecha;
                    }

                    /**
                     * Define el valor de la propiedad fecha.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setFecha(XMLGregorianCalendar value) {
                        this.fecha = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setNumero(BigInteger value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad estadoMigracion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EstadoMigracion }
                     *     
                     */
                    public EstadoMigracion getEstadoMigracion() {
                        return estadoMigracion;
                    }

                    /**
                     * Define el valor de la propiedad estadoMigracion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EstadoMigracion }
                     *     
                     */
                    public void setEstadoMigracion(EstadoMigracion value) {
                        this.estadoMigracion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad idClaveSistemaCentralSeguridad.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Id }
                     *     
                     */
                    public Id getIdClaveSistemaCentralSeguridad() {
                        return idClaveSistemaCentralSeguridad;
                    }

                    /**
                     * Define el valor de la propiedad idClaveSistemaCentralSeguridad.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Id }
                     *     
                     */
                    public void setIdClaveSistemaCentralSeguridad(Id value) {
                        this.idClaveSistemaCentralSeguridad = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad aceptacionTerminosCondiciones.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAceptacionTerminosCondiciones() {
                        return aceptacionTerminosCondiciones;
                    }

                    /**
                     * Define el valor de la propiedad aceptacionTerminosCondiciones.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAceptacionTerminosCondiciones(String value) {
                        this.aceptacionTerminosCondiciones = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad clienteEfectuaOperacionesRiesgo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClienteEfectuaOperacionesRiesgo() {
                        return clienteEfectuaOperacionesRiesgo;
                    }

                    /**
                     * Define el valor de la propiedad clienteEfectuaOperacionesRiesgo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClienteEfectuaOperacionesRiesgo(String value) {
                        this.clienteEfectuaOperacionesRiesgo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fechaCambio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getFechaCambio() {
                        return fechaCambio;
                    }

                    /**
                     * Define el valor de la propiedad fechaCambio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setFechaCambio(XMLGregorianCalendar value) {
                        this.fechaCambio = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cantidadIntentosFallidosPin.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCantidadIntentosFallidosPin() {
                        return cantidadIntentosFallidosPin;
                    }

                    /**
                     * Define el valor de la propiedad cantidadIntentosFallidosPin.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCantidadIntentosFallidosPin(BigInteger value) {
                        this.cantidadIntentosFallidosPin = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad bloqueo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos.Bloqueo }
                     *     
                     */
                    public LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos.Bloqueo getBloqueo() {
                        return bloqueo;
                    }

                    /**
                     * Define el valor de la propiedad bloqueo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos.Bloqueo }
                     *     
                     */
                    public void setBloqueo(LoginClienteFisicoConIdentificacionRequest.Datos.DetallesClientes.DetalleCliente.AdhesionCanalesAlternativos.Bloqueo value) {
                        this.bloqueo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cantidadCambioPin.
                     * 
                     */
                    public int getCantidadCambioPin() {
                        return cantidadCambioPin;
                    }

                    /**
                     * Define el valor de la propiedad cantidadCambioPin.
                     * 
                     */
                    public void setCantidadCambioPin(int value) {
                        this.cantidadCambioPin = value;
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
                     *       &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Bloqueo {

                        @XmlAttribute(name = "Origen", required = true)
                        protected String origen;
                        @XmlAttribute(name = "Fecha", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar fecha;

                        /**
                         * Obtiene el valor de la propiedad origen.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrigen() {
                            return origen;
                        }

                        /**
                         * Define el valor de la propiedad origen.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrigen(String value) {
                            this.origen = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad fecha.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getFecha() {
                            return fecha;
                        }

                        /**
                         * Define el valor de la propiedad fecha.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setFecha(XMLGregorianCalendar value) {
                            this.fecha = value;
                        }

                    }

                }

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
         *         &lt;element name="SistemaCentralSeguridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CanalesAlternativos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "sistemaCentralSeguridad",
            "canalesAlternativos"
        })
        public static class PIN {

            @XmlElement(name = "SistemaCentralSeguridad")
            protected String sistemaCentralSeguridad;
            @XmlElement(name = "CanalesAlternativos")
            protected String canalesAlternativos;

            /**
             * Obtiene el valor de la propiedad sistemaCentralSeguridad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSistemaCentralSeguridad() {
                return sistemaCentralSeguridad;
            }

            /**
             * Define el valor de la propiedad sistemaCentralSeguridad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSistemaCentralSeguridad(String value) {
                this.sistemaCentralSeguridad = value;
            }

            /**
             * Obtiene el valor de la propiedad canalesAlternativos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCanalesAlternativos() {
                return canalesAlternativos;
            }

            /**
             * Define el valor de la propiedad canalesAlternativos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCanalesAlternativos(String value) {
                this.canalesAlternativos = value;
            }

        }

    }

}
