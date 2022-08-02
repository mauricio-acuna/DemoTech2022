
package ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetaresponse._2_0_0;

import java.math.BigDecimal;
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
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacion;
import ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.mtechResultadoOperacionLog;
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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0}mtechResultadoOperacion"/>
 *         &lt;element name="Datos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DetalleCliente">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                             &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ApellidoCasada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                             &lt;element name="Documento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}documento" maxOccurs="2"/>
 *                             &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                             &lt;element name="SegmentoOrigen" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                             &lt;element name="Responsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Alerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdhesionCanalesAlternativos">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                             &lt;element name="Bloqueo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Productos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Producto" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EstadoRetorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="EstadoRetornoMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="SubSistemaMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="Cuenta" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                                 &lt;element name="MetodoAutenticacion" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                           &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="CuentaMonetaria" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                 &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                 &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                 &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="CuentaCredito" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="NumeroInversor" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="CuentaComitente" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="NumeroProducto" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="Tarjetas" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TravelPass" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PlazoFijoNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                       &lt;element name="TipoAutenticacion" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CodigoModificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ConsultaFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="ConsultaHora" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                                       &lt;element name="SaldosPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="MotivoBajaCuenta" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                 &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SaldosDolarUno" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="BajaCuenta" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="AMRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AltaRelacion" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SaldosDolarDos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AlertaCuenta" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Retorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                                 &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="AlertasCuentas" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AlertasSubcriptas" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                                           &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                                           &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                                                           &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                   &lt;element name="CampaniaConDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EstadoAdhesion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EstadoIdentificacionPositiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IntentosRespuestasFallidas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "LoginConTarjetaResponse")
public class LoginConTarjetaResponse {

    @XmlElement(name = "mtechResultadoOperacion", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechresultadooperacion/2_0_0", required = true)
    protected mtechResultadoOperacion mtechResultadoOperacion;
    @XmlElement(name = "Datos")
    protected LoginConTarjetaResponse.Datos datos;
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
     *     {@link LoginConTarjetaResponse.Datos }
     *     
     */
    public LoginConTarjetaResponse.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginConTarjetaResponse.Datos }
     *     
     */
    public void setDatos(LoginConTarjetaResponse.Datos value) {
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
     *         &lt;element name="DetalleCliente">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                   &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ApellidoCasada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *                   &lt;element name="Documento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}documento" maxOccurs="2"/>
     *                   &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                   &lt;element name="SegmentoOrigen" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                   &lt;element name="Responsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Alerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdhesionCanalesAlternativos">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                   &lt;element name="Bloqueo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Productos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Producto" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EstadoRetorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="EstadoRetornoMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="SubSistemaMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="Cuenta" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                                       &lt;element name="MetodoAutenticacion" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                                 &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                             &lt;element name="CuentaMonetaria" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CuentaCredito" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="NumeroInversor" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="CuentaComitente" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="NumeroProducto" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="Tarjetas" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TravelPass" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PlazoFijoNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                             &lt;element name="TipoAutenticacion" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CodigoModificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ConsultaFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="ConsultaHora" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *                             &lt;element name="SaldosPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="MotivoBajaCuenta" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SaldosDolarUno" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="BajaCuenta" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="AMRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AltaRelacion" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SaldosDolarDos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AlertaCuenta" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Retorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="AlertasCuentas" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AlertasSubcriptas" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                                                 &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CampaniaConDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EstadoAdhesion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EstadoIdentificacionPositiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IntentosRespuestasFallidas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "detalleCliente",
        "adhesionCanalesAlternativos",
        "productos",
        "campaniaConDescripcion",
        "estadoAdhesion",
        "estadoIdentificacionPositiva",
        "intentosRespuestasFallidas"
    })
    public static class Datos {

        @XmlElement(name = "DetalleCliente", required = true)
        protected LoginConTarjetaResponse.Datos.DetalleCliente detalleCliente;
        @XmlElement(name = "AdhesionCanalesAlternativos", required = true)
        protected LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos adhesionCanalesAlternativos;
        @XmlElement(name = "Productos")
        protected LoginConTarjetaResponse.Datos.Productos productos;
        @XmlElement(name = "CampaniaConDescripcion")
        protected String campaniaConDescripcion;
        @XmlElement(name = "EstadoAdhesion", required = true)
        protected String estadoAdhesion;
        @XmlElement(name = "EstadoIdentificacionPositiva")
        protected String estadoIdentificacionPositiva;
        @XmlElement(name = "IntentosRespuestasFallidas")
        protected String intentosRespuestasFallidas;

        /**
         * Obtiene el valor de la propiedad detalleCliente.
         * 
         * @return
         *     possible object is
         *     {@link LoginConTarjetaResponse.Datos.DetalleCliente }
         *     
         */
        public LoginConTarjetaResponse.Datos.DetalleCliente getDetalleCliente() {
            return detalleCliente;
        }

        /**
         * Define el valor de la propiedad detalleCliente.
         * 
         * @param value
         *     allowed object is
         *     {@link LoginConTarjetaResponse.Datos.DetalleCliente }
         *     
         */
        public void setDetalleCliente(LoginConTarjetaResponse.Datos.DetalleCliente value) {
            this.detalleCliente = value;
        }

        /**
         * Obtiene el valor de la propiedad adhesionCanalesAlternativos.
         * 
         * @return
         *     possible object is
         *     {@link LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos }
         *     
         */
        public LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos getAdhesionCanalesAlternativos() {
            return adhesionCanalesAlternativos;
        }

        /**
         * Define el valor de la propiedad adhesionCanalesAlternativos.
         * 
         * @param value
         *     allowed object is
         *     {@link LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos }
         *     
         */
        public void setAdhesionCanalesAlternativos(LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos value) {
            this.adhesionCanalesAlternativos = value;
        }

        /**
         * Obtiene el valor de la propiedad productos.
         * 
         * @return
         *     possible object is
         *     {@link LoginConTarjetaResponse.Datos.Productos }
         *     
         */
        public LoginConTarjetaResponse.Datos.Productos getProductos() {
            return productos;
        }

        /**
         * Define el valor de la propiedad productos.
         * 
         * @param value
         *     allowed object is
         *     {@link LoginConTarjetaResponse.Datos.Productos }
         *     
         */
        public void setProductos(LoginConTarjetaResponse.Datos.Productos value) {
            this.productos = value;
        }

        /**
         * Obtiene el valor de la propiedad campaniaConDescripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCampaniaConDescripcion() {
            return campaniaConDescripcion;
        }

        /**
         * Define el valor de la propiedad campaniaConDescripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCampaniaConDescripcion(String value) {
            this.campaniaConDescripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad estadoAdhesion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstadoAdhesion() {
            return estadoAdhesion;
        }

        /**
         * Define el valor de la propiedad estadoAdhesion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstadoAdhesion(String value) {
            this.estadoAdhesion = value;
        }

        /**
         * Obtiene el valor de la propiedad estadoIdentificacionPositiva.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstadoIdentificacionPositiva() {
            return estadoIdentificacionPositiva;
        }

        /**
         * Define el valor de la propiedad estadoIdentificacionPositiva.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstadoIdentificacionPositiva(String value) {
            this.estadoIdentificacionPositiva = value;
        }

        /**
         * Obtiene el valor de la propiedad intentosRespuestasFallidas.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntentosRespuestasFallidas() {
            return intentosRespuestasFallidas;
        }

        /**
         * Define el valor de la propiedad intentosRespuestasFallidas.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntentosRespuestasFallidas(String value) {
            this.intentosRespuestasFallidas = value;
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
         *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *         &lt;element name="Bloqueo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Origen" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" />
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
            "estado",
            "fecha",
            "numero",
            "bloqueo"
        })
        public static class AdhesionCanalesAlternativos {

            @XmlElement(name = "Estado", required = true)
            protected String estado;
            @XmlElement(name = "Fecha")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fecha;
            @XmlElement(name = "Numero", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger numero;
            @XmlElement(name = "Bloqueo")
            protected LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos.Bloqueo bloqueo;

            /**
             * Obtiene el valor de la propiedad estado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstado() {
                return estado;
            }

            /**
             * Define el valor de la propiedad estado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstado(String value) {
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
             * Obtiene el valor de la propiedad bloqueo.
             * 
             * @return
             *     possible object is
             *     {@link LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos.Bloqueo }
             *     
             */
            public LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos.Bloqueo getBloqueo() {
                return bloqueo;
            }

            /**
             * Define el valor de la propiedad bloqueo.
             * 
             * @param value
             *     allowed object is
             *     {@link LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos.Bloqueo }
             *     
             */
            public void setBloqueo(LoginConTarjetaResponse.Datos.AdhesionCanalesAlternativos.Bloqueo value) {
                this.bloqueo = value;
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
             *       &lt;attribute name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" />
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
                @XmlAttribute(name = "Fecha")
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
         *         &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ApellidoCasada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
         *         &lt;element name="Documento" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}documento" maxOccurs="2"/>
         *         &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *         &lt;element name="SegmentoOrigen" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *         &lt;element name="Responsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Alerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "tipoPersona",
            "fechaNacimiento",
            "sexo",
            "nombre",
            "apellido",
            "apellidoCasada",
            "idPersona",
            "documento",
            "segmento",
            "segmentoOrigen",
            "responsable",
            "alerta"
        })
        public static class DetalleCliente {

            @XmlElement(name = "TipoPersona", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger tipoPersona;
            @XmlElement(name = "FechaNacimiento")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaNacimiento;
            @XmlElement(name = "Sexo", required = true)
            protected String sexo;
            @XmlElement(name = "Nombre", required = true)
            protected String nombre;
            @XmlElement(name = "Apellido", required = true)
            protected String apellido;
            @XmlElement(name = "ApellidoCasada")
            protected String apellidoCasada;
            @XmlElement(name = "IdPersona", required = true)
            protected Id idPersona;
            @XmlElement(name = "Documento", required = true)
            protected List<Documento> documento;
            @XmlElement(name = "Segmento")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger segmento;
            @XmlElement(name = "SegmentoOrigen")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger segmentoOrigen;
            @XmlElement(name = "Responsable")
            protected String responsable;
            @XmlElement(name = "Alerta")
            protected String alerta;

            /**
             * Obtiene el valor de la propiedad tipoPersona.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTipoPersona() {
                return tipoPersona;
            }

            /**
             * Define el valor de la propiedad tipoPersona.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTipoPersona(BigInteger value) {
                this.tipoPersona = value;
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
             * Obtiene el valor de la propiedad apellido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApellido() {
                return apellido;
            }

            /**
             * Define el valor de la propiedad apellido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApellido(String value) {
                this.apellido = value;
            }

            /**
             * Obtiene el valor de la propiedad apellidoCasada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApellidoCasada() {
                return apellidoCasada;
            }

            /**
             * Define el valor de la propiedad apellidoCasada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApellidoCasada(String value) {
                this.apellidoCasada = value;
            }

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
             * Obtiene el valor de la propiedad responsable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsable() {
                return responsable;
            }

            /**
             * Define el valor de la propiedad responsable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsable(String value) {
                this.responsable = value;
            }

            /**
             * Obtiene el valor de la propiedad alerta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlerta() {
                return alerta;
            }

            /**
             * Define el valor de la propiedad alerta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlerta(String value) {
                this.alerta = value;
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
         *         &lt;element name="Producto" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="EstadoRetorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="EstadoRetornoMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="SubSistemaMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="Cuenta" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                             &lt;element name="MetodoAutenticacion" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                                       &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                   &lt;element name="CuentaMonetaria" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CuentaCredito" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="NumeroInversor" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="CuentaComitente" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="NumeroProducto" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="Tarjetas" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TravelPass" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PlazoFijoNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                   &lt;element name="TipoAutenticacion" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CodigoModificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ConsultaFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="ConsultaHora" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
         *                   &lt;element name="SaldosPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="MotivoBajaCuenta" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SaldosDolarUno" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="BajaCuenta" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="AMRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AltaRelacion" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SaldosDolarDos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AlertaCuenta" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Retorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="AlertasCuentas" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AlertasSubcriptas" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *                                       &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "producto"
        })
        public static class Productos {

            @XmlElement(name = "Producto", required = true)
            protected List<LoginConTarjetaResponse.Datos.Productos.Producto> producto;

            /**
             * Gets the value of the producto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the producto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProducto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LoginConTarjetaResponse.Datos.Productos.Producto }
             * 
             * 
             */
            public List<LoginConTarjetaResponse.Datos.Productos.Producto> getProducto() {
                if (producto == null) {
                    producto = new ArrayList<LoginConTarjetaResponse.Datos.Productos.Producto>();
                }
                return this.producto;
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
             *         &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="EstadoRetorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="EstadoRetornoMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="SubSistemaMetodoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="Cuenta" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *                   &lt;element name="MetodoAutenticacion" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                             &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *         &lt;element name="CuentaMonetaria" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CuentaCredito" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="NumeroInversor" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="CuentaComitente" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="NumeroProducto" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="Tarjetas" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TravelPass" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PlazoFijoNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *         &lt;element name="TipoAutenticacion" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CodigoModificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ConsultaFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="ConsultaHora" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
             *         &lt;element name="SaldosPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="MotivoBajaCuenta" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SaldosDolarUno" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="BajaCuenta" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="AMRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AltaRelacion" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SaldosDolarDos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AlertaCuenta" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Retorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="AlertasCuentas" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AlertasSubcriptas" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
             *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "adherido",
                "estadoRetorno",
                "estadoRetornoMetodoAutenticacion",
                "subSistema",
                "subSistemaMetodoAutenticacion",
                "cuenta",
                "cuentaMonetaria",
                "cuentaCredito",
                "numeroInversor",
                "cuentaComitente",
                "numeroProducto",
                "tarjetas",
                "travelPass",
                "plazoFijoNumero",
                "tipoAutenticacion",
                "consultaFecha",
                "consultaHora",
                "saldosPesos",
                "motivoBajaCuenta",
                "saldosDolarUno",
                "bajaCuenta",
                "amro",
                "altaRelacion",
                "saldosDolarDos",
                "descripcion",
                "fechaVencimiento",
                "canal",
                "alertaCuenta",
                "alertasCuentas"
            })
            public static class Producto {

                @XmlElement(name = "Adherido")
                protected String adherido;
                @XmlElement(name = "EstadoRetorno")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger estadoRetorno;
                @XmlElement(name = "EstadoRetornoMetodoAutenticacion")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger estadoRetornoMetodoAutenticacion;
                @XmlElement(name = "SubSistema")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger subSistema;
                @XmlElement(name = "SubSistemaMetodoAutenticacion")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger subSistemaMetodoAutenticacion;
                @XmlElement(name = "Cuenta")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta cuenta;
                @XmlElement(name = "CuentaMonetaria")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.CuentaMonetaria cuentaMonetaria;
                @XmlElement(name = "CuentaCredito")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger cuentaCredito;
                @XmlElement(name = "NumeroInversor")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger numeroInversor;
                @XmlElement(name = "CuentaComitente")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger cuentaComitente;
                @XmlElement(name = "NumeroProducto")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger numeroProducto;
                @XmlElement(name = "Tarjetas")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.Tarjetas tarjetas;
                @XmlElement(name = "TravelPass")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.TravelPass travelPass;
                @XmlElement(name = "PlazoFijoNumero")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger plazoFijoNumero;
                @XmlElement(name = "TipoAutenticacion")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.TipoAutenticacion tipoAutenticacion;
                @XmlElement(name = "ConsultaFecha")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar consultaFecha;
                @XmlElement(name = "ConsultaHora")
                @XmlSchemaType(name = "time")
                protected XMLGregorianCalendar consultaHora;
                @XmlElement(name = "SaldosPesos")
                protected BigDecimal saldosPesos;
                @XmlElement(name = "MotivoBajaCuenta")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.MotivoBajaCuenta motivoBajaCuenta;
                @XmlElement(name = "SaldosDolarUno")
                protected BigDecimal saldosDolarUno;
                @XmlElement(name = "BajaCuenta")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.BajaCuenta bajaCuenta;
                @XmlElement(name = "AMRO")
                protected String amro;
                @XmlElement(name = "AltaRelacion")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.AltaRelacion altaRelacion;
                @XmlElement(name = "SaldosDolarDos")
                protected BigDecimal saldosDolarDos;
                @XmlElement(name = "Descripcion")
                protected String descripcion;
                @XmlElement(name = "FechaVencimiento")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar fechaVencimiento;
                @XmlElement(name = "Canal")
                protected String canal;
                @XmlElement(name = "AlertaCuenta")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.AlertaCuenta alertaCuenta;
                @XmlElement(name = "AlertasCuentas")
                protected LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas alertasCuentas;

                /**
                 * Obtiene el valor de la propiedad adherido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdherido() {
                    return adherido;
                }

                /**
                 * Define el valor de la propiedad adherido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdherido(String value) {
                    this.adherido = value;
                }

                /**
                 * Obtiene el valor de la propiedad estadoRetorno.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getEstadoRetorno() {
                    return estadoRetorno;
                }

                /**
                 * Define el valor de la propiedad estadoRetorno.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setEstadoRetorno(BigInteger value) {
                    this.estadoRetorno = value;
                }

                /**
                 * Obtiene el valor de la propiedad estadoRetornoMetodoAutenticacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getEstadoRetornoMetodoAutenticacion() {
                    return estadoRetornoMetodoAutenticacion;
                }

                /**
                 * Define el valor de la propiedad estadoRetornoMetodoAutenticacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setEstadoRetornoMetodoAutenticacion(BigInteger value) {
                    this.estadoRetornoMetodoAutenticacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad subSistema.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSubSistema() {
                    return subSistema;
                }

                /**
                 * Define el valor de la propiedad subSistema.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSubSistema(BigInteger value) {
                    this.subSistema = value;
                }

                /**
                 * Obtiene el valor de la propiedad subSistemaMetodoAutenticacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSubSistemaMetodoAutenticacion() {
                    return subSistemaMetodoAutenticacion;
                }

                /**
                 * Define el valor de la propiedad subSistemaMetodoAutenticacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSubSistemaMetodoAutenticacion(BigInteger value) {
                    this.subSistemaMetodoAutenticacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad cuenta.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta getCuenta() {
                    return cuenta;
                }

                /**
                 * Define el valor de la propiedad cuenta.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta }
                 *     
                 */
                public void setCuenta(LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta value) {
                    this.cuenta = value;
                }

                /**
                 * Obtiene el valor de la propiedad cuentaMonetaria.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.CuentaMonetaria }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.CuentaMonetaria getCuentaMonetaria() {
                    return cuentaMonetaria;
                }

                /**
                 * Define el valor de la propiedad cuentaMonetaria.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.CuentaMonetaria }
                 *     
                 */
                public void setCuentaMonetaria(LoginConTarjetaResponse.Datos.Productos.Producto.CuentaMonetaria value) {
                    this.cuentaMonetaria = value;
                }

                /**
                 * Obtiene el valor de la propiedad cuentaCredito.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCuentaCredito() {
                    return cuentaCredito;
                }

                /**
                 * Define el valor de la propiedad cuentaCredito.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCuentaCredito(BigInteger value) {
                    this.cuentaCredito = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroInversor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumeroInversor() {
                    return numeroInversor;
                }

                /**
                 * Define el valor de la propiedad numeroInversor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumeroInversor(BigInteger value) {
                    this.numeroInversor = value;
                }

                /**
                 * Obtiene el valor de la propiedad cuentaComitente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCuentaComitente() {
                    return cuentaComitente;
                }

                /**
                 * Define el valor de la propiedad cuentaComitente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCuentaComitente(BigInteger value) {
                    this.cuentaComitente = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroProducto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumeroProducto() {
                    return numeroProducto;
                }

                /**
                 * Define el valor de la propiedad numeroProducto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumeroProducto(BigInteger value) {
                    this.numeroProducto = value;
                }

                /**
                 * Obtiene el valor de la propiedad tarjetas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.Tarjetas }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.Tarjetas getTarjetas() {
                    return tarjetas;
                }

                /**
                 * Define el valor de la propiedad tarjetas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.Tarjetas }
                 *     
                 */
                public void setTarjetas(LoginConTarjetaResponse.Datos.Productos.Producto.Tarjetas value) {
                    this.tarjetas = value;
                }

                /**
                 * Obtiene el valor de la propiedad travelPass.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.TravelPass }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.TravelPass getTravelPass() {
                    return travelPass;
                }

                /**
                 * Define el valor de la propiedad travelPass.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.TravelPass }
                 *     
                 */
                public void setTravelPass(LoginConTarjetaResponse.Datos.Productos.Producto.TravelPass value) {
                    this.travelPass = value;
                }

                /**
                 * Obtiene el valor de la propiedad plazoFijoNumero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPlazoFijoNumero() {
                    return plazoFijoNumero;
                }

                /**
                 * Define el valor de la propiedad plazoFijoNumero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPlazoFijoNumero(BigInteger value) {
                    this.plazoFijoNumero = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipoAutenticacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.TipoAutenticacion }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.TipoAutenticacion getTipoAutenticacion() {
                    return tipoAutenticacion;
                }

                /**
                 * Define el valor de la propiedad tipoAutenticacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.TipoAutenticacion }
                 *     
                 */
                public void setTipoAutenticacion(LoginConTarjetaResponse.Datos.Productos.Producto.TipoAutenticacion value) {
                    this.tipoAutenticacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad consultaFecha.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getConsultaFecha() {
                    return consultaFecha;
                }

                /**
                 * Define el valor de la propiedad consultaFecha.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setConsultaFecha(XMLGregorianCalendar value) {
                    this.consultaFecha = value;
                }

                /**
                 * Obtiene el valor de la propiedad consultaHora.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getConsultaHora() {
                    return consultaHora;
                }

                /**
                 * Define el valor de la propiedad consultaHora.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setConsultaHora(XMLGregorianCalendar value) {
                    this.consultaHora = value;
                }

                /**
                 * Obtiene el valor de la propiedad saldosPesos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSaldosPesos() {
                    return saldosPesos;
                }

                /**
                 * Define el valor de la propiedad saldosPesos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSaldosPesos(BigDecimal value) {
                    this.saldosPesos = value;
                }

                /**
                 * Obtiene el valor de la propiedad motivoBajaCuenta.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.MotivoBajaCuenta }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.MotivoBajaCuenta getMotivoBajaCuenta() {
                    return motivoBajaCuenta;
                }

                /**
                 * Define el valor de la propiedad motivoBajaCuenta.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.MotivoBajaCuenta }
                 *     
                 */
                public void setMotivoBajaCuenta(LoginConTarjetaResponse.Datos.Productos.Producto.MotivoBajaCuenta value) {
                    this.motivoBajaCuenta = value;
                }

                /**
                 * Obtiene el valor de la propiedad saldosDolarUno.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSaldosDolarUno() {
                    return saldosDolarUno;
                }

                /**
                 * Define el valor de la propiedad saldosDolarUno.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSaldosDolarUno(BigDecimal value) {
                    this.saldosDolarUno = value;
                }

                /**
                 * Obtiene el valor de la propiedad bajaCuenta.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.BajaCuenta }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.BajaCuenta getBajaCuenta() {
                    return bajaCuenta;
                }

                /**
                 * Define el valor de la propiedad bajaCuenta.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.BajaCuenta }
                 *     
                 */
                public void setBajaCuenta(LoginConTarjetaResponse.Datos.Productos.Producto.BajaCuenta value) {
                    this.bajaCuenta = value;
                }

                /**
                 * Obtiene el valor de la propiedad amro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAMRO() {
                    return amro;
                }

                /**
                 * Define el valor de la propiedad amro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAMRO(String value) {
                    this.amro = value;
                }

                /**
                 * Obtiene el valor de la propiedad altaRelacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.AltaRelacion }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.AltaRelacion getAltaRelacion() {
                    return altaRelacion;
                }

                /**
                 * Define el valor de la propiedad altaRelacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.AltaRelacion }
                 *     
                 */
                public void setAltaRelacion(LoginConTarjetaResponse.Datos.Productos.Producto.AltaRelacion value) {
                    this.altaRelacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad saldosDolarDos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSaldosDolarDos() {
                    return saldosDolarDos;
                }

                /**
                 * Define el valor de la propiedad saldosDolarDos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSaldosDolarDos(BigDecimal value) {
                    this.saldosDolarDos = value;
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
                 * Obtiene el valor de la propiedad fechaVencimiento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaVencimiento() {
                    return fechaVencimiento;
                }

                /**
                 * Define el valor de la propiedad fechaVencimiento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaVencimiento(XMLGregorianCalendar value) {
                    this.fechaVencimiento = value;
                }

                /**
                 * Obtiene el valor de la propiedad canal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCanal() {
                    return canal;
                }

                /**
                 * Define el valor de la propiedad canal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCanal(String value) {
                    this.canal = value;
                }

                /**
                 * Obtiene el valor de la propiedad alertaCuenta.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.AlertaCuenta }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.AlertaCuenta getAlertaCuenta() {
                    return alertaCuenta;
                }

                /**
                 * Define el valor de la propiedad alertaCuenta.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.AlertaCuenta }
                 *     
                 */
                public void setAlertaCuenta(LoginConTarjetaResponse.Datos.Productos.Producto.AlertaCuenta value) {
                    this.alertaCuenta = value;
                }

                /**
                 * Obtiene el valor de la propiedad alertasCuentas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas }
                 *     
                 */
                public LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas getAlertasCuentas() {
                    return alertasCuentas;
                }

                /**
                 * Define el valor de la propiedad alertasCuentas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas }
                 *     
                 */
                public void setAlertasCuentas(LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas value) {
                    this.alertasCuentas = value;
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
                 *         &lt;element name="Adherido" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Retorno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
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
                    "adherido",
                    "retorno",
                    "tipo",
                    "cantidad"
                })
                public static class AlertaCuenta {

                    @XmlElement(name = "Adherido", required = true)
                    protected String adherido;
                    @XmlElement(name = "Retorno", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger retorno;
                    @XmlElement(name = "Tipo", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger tipo;
                    @XmlElement(name = "Cantidad")
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger cantidad;

                    /**
                     * Obtiene el valor de la propiedad adherido.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdherido() {
                        return adherido;
                    }

                    /**
                     * Define el valor de la propiedad adherido.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdherido(String value) {
                        this.adherido = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad retorno.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRetorno() {
                        return retorno;
                    }

                    /**
                     * Define el valor de la propiedad retorno.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRetorno(BigInteger value) {
                        this.retorno = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad tipo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTipo() {
                        return tipo;
                    }

                    /**
                     * Define el valor de la propiedad tipo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTipo(BigInteger value) {
                        this.tipo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cantidad.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCantidad() {
                        return cantidad;
                    }

                    /**
                     * Define el valor de la propiedad cantidad.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCantidad(BigInteger value) {
                        this.cantidad = value;
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
                 *         &lt;element name="AlertasSubcriptas" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                 *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                 *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "alertasSubcriptas"
                })
                public static class AlertasCuentas {

                    @XmlElement(name = "AlertasSubcriptas")
                    protected List<LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas.AlertasSubcriptas> alertasSubcriptas;

                    /**
                     * Gets the value of the alertasSubcriptas property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the alertasSubcriptas property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAlertasSubcriptas().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas.AlertasSubcriptas }
                     * 
                     * 
                     */
                    public List<LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas.AlertasSubcriptas> getAlertasSubcriptas() {
                        if (alertasSubcriptas == null) {
                            alertasSubcriptas = new ArrayList<LoginConTarjetaResponse.Datos.Productos.Producto.AlertasCuentas.AlertasSubcriptas>();
                        }
                        return this.alertasSubcriptas;
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
                     *         &lt;element name="SubSistema" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                     *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                     *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "subSistema",
                        "numero",
                        "tipo",
                        "descripcion"
                    })
                    public static class AlertasSubcriptas {

                        @XmlElement(name = "SubSistema")
                        @XmlSchemaType(name = "unsignedLong")
                        protected BigInteger subSistema;
                        @XmlElement(name = "Numero")
                        @XmlSchemaType(name = "unsignedLong")
                        protected BigInteger numero;
                        @XmlElement(name = "Tipo")
                        @XmlSchemaType(name = "unsignedLong")
                        protected BigInteger tipo;
                        @XmlElement(name = "Descripcion")
                        protected String descripcion;

                        /**
                         * Obtiene el valor de la propiedad subSistema.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getSubSistema() {
                            return subSistema;
                        }

                        /**
                         * Define el valor de la propiedad subSistema.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setSubSistema(BigInteger value) {
                            this.subSistema = value;
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
                         * Obtiene el valor de la propiedad tipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getTipo() {
                            return tipo;
                        }

                        /**
                         * Define el valor de la propiedad tipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setTipo(BigInteger value) {
                            this.tipo = value;
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
                 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "fecha",
                    "espacios"
                })
                public static class AltaRelacion {

                    @XmlElement(name = "Fecha", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar fecha;
                    @XmlElement(name = "Espacios", required = true)
                    protected String espacios;

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
                     * Obtiene el valor de la propiedad espacios.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEspacios() {
                        return espacios;
                    }

                    /**
                     * Define el valor de la propiedad espacios.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEspacios(String value) {
                        this.espacios = value;
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
                 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "fecha",
                    "espacios"
                })
                public static class BajaCuenta {

                    @XmlElement(name = "Fecha", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar fecha;
                    @XmlElement(name = "Espacios", required = true)
                    protected String espacios;

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
                     * Obtiene el valor de la propiedad espacios.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEspacios() {
                        return espacios;
                    }

                    /**
                     * Define el valor de la propiedad espacios.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEspacios(String value) {
                        this.espacios = value;
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
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
                 *         &lt;element name="MetodoAutenticacion" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *                   &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "numero",
                    "metodoAutenticacion"
                })
                public static class Cuenta {

                    @XmlElement(name = "Numero")
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger numero;
                    @XmlElement(name = "MetodoAutenticacion")
                    protected LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta.MetodoAutenticacion metodoAutenticacion;

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
                     * Obtiene el valor de la propiedad metodoAutenticacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta.MetodoAutenticacion }
                     *     
                     */
                    public LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta.MetodoAutenticacion getMetodoAutenticacion() {
                        return metodoAutenticacion;
                    }

                    /**
                     * Define el valor de la propiedad metodoAutenticacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta.MetodoAutenticacion }
                     *     
                     */
                    public void setMetodoAutenticacion(LoginConTarjetaResponse.Datos.Productos.Producto.Cuenta.MetodoAutenticacion value) {
                        this.metodoAutenticacion = value;
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
                     *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                     *         &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "espacios"
                    })
                    public static class MetodoAutenticacion {

                        @XmlElement(name = "Numero", required = true)
                        @XmlSchemaType(name = "unsignedLong")
                        protected BigInteger numero;
                        @XmlElement(name = "Espacios", required = true)
                        protected String espacios;

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
                         * Obtiene el valor de la propiedad espacios.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEspacios() {
                            return espacios;
                        }

                        /**
                         * Define el valor de la propiedad espacios.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEspacios(String value) {
                            this.espacios = value;
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
                 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
                    "folio",
                    "digitoUno",
                    "sucursal",
                    "digitoDos"
                })
                public static class CuentaMonetaria {

                    @XmlElement(name = "Folio", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger folio;
                    @XmlElement(name = "DigitoUno", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger digitoUno;
                    @XmlElement(name = "Sucursal", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger sucursal;
                    @XmlElement(name = "DigitoDos", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger digitoDos;

                    /**
                     * Obtiene el valor de la propiedad folio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getFolio() {
                        return folio;
                    }

                    /**
                     * Define el valor de la propiedad folio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setFolio(BigInteger value) {
                        this.folio = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad digitoUno.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getDigitoUno() {
                        return digitoUno;
                    }

                    /**
                     * Define el valor de la propiedad digitoUno.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setDigitoUno(BigInteger value) {
                        this.digitoUno = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad sucursal.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getSucursal() {
                        return sucursal;
                    }

                    /**
                     * Define el valor de la propiedad sucursal.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setSucursal(BigInteger value) {
                        this.sucursal = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad digitoDos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getDigitoDos() {
                        return digitoDos;
                    }

                    /**
                     * Define el valor de la propiedad digitoDos.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setDigitoDos(BigInteger value) {
                        this.digitoDos = value;
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
                 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "espacios"
                })
                public static class MotivoBajaCuenta {

                    @XmlElement(name = "Codigo", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger codigo;
                    @XmlElement(name = "Espacios", required = true)
                    protected String espacios;

                    /**
                     * Obtiene el valor de la propiedad codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define el valor de la propiedad codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCodigo(BigInteger value) {
                        this.codigo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad espacios.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEspacios() {
                        return espacios;
                    }

                    /**
                     * Define el valor de la propiedad espacios.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEspacios(String value) {
                        this.espacios = value;
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
                 *         &lt;element name="DigitoUno" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
                    "digitoUno",
                    "numero"
                })
                public static class Tarjetas {

                    @XmlElement(name = "DigitoUno", required = true)
                    protected String digitoUno;
                    @XmlElement(name = "Numero", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger numero;

                    /**
                     * Obtiene el valor de la propiedad digitoUno.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDigitoUno() {
                        return digitoUno;
                    }

                    /**
                     * Define el valor de la propiedad digitoUno.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDigitoUno(String value) {
                        this.digitoUno = value;
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
                 *         &lt;element name="CodigoModificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Espacios" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "codigoModificador",
                    "espacios"
                })
                public static class TipoAutenticacion {

                    @XmlElement(name = "CodigoModificador", required = true)
                    protected String codigoModificador;
                    @XmlElement(name = "Espacios", required = true)
                    protected String espacios;

                    /**
                     * Obtiene el valor de la propiedad codigoModificador.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigoModificador() {
                        return codigoModificador;
                    }

                    /**
                     * Define el valor de la propiedad codigoModificador.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigoModificador(String value) {
                        this.codigoModificador = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad espacios.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEspacios() {
                        return espacios;
                    }

                    /**
                     * Define el valor de la propiedad espacios.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEspacios(String value) {
                        this.espacios = value;
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
                 *         &lt;element name="DigitoDos" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
                    "digitoDos",
                    "numero"
                })
                public static class TravelPass {

                    @XmlElement(name = "DigitoDos", required = true)
                    protected String digitoDos;
                    @XmlElement(name = "Numero", required = true)
                    @XmlSchemaType(name = "unsignedLong")
                    protected BigInteger numero;

                    /**
                     * Obtiene el valor de la propiedad digitoDos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDigitoDos() {
                        return digitoDos;
                    }

                    /**
                     * Define el valor de la propiedad digitoDos.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDigitoDos(String value) {
                        this.digitoDos = value;
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

                }

            }

        }

    }

}
