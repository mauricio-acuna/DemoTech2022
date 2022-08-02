
package ar.com.mautech.ws.webservices.accionescanalesalternativos.registraroperacionesmonetariasrequest._2_0_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.mtechHeader;
import ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.IdMensaje;
import ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.Codigov2;


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
 *                   &lt;element name="IdentificadorOperacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="NumeroAdhesion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="FechaMovimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="FechaHoraInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="FechaHoraFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="CodigoTipoTransaccion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
 *                   &lt;element name="CuentaDebitoSubsistema" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CuentaDebitoMoneda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CuentaDebito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CuentaDebitoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CuentaCreditoSubsistema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CuentaCreditoMoneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="NumeroCuentaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CuentaCreditoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NumeroCuentaTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ImporteCotizacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CodigoEstado" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
 *                   &lt;element name="CodigoError" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Tarjeta" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TipoMonedaPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Cartera" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="TipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="NumeroSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="FechaEnvio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Titulo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroOrden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="EspecieOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UbicacionOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EspecieDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UbicacionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TipoRescate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CantidadCuotaParte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="Circuito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PrecioLimite" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PlazoFijo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TipoPlazoFijo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SubSistemaPlazoFijo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ImporteInteres" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="Sellado1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="Sellado2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="SelladoVencimiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="TasaNominalAnual" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="SelladoMunicipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="TasaEfectivaMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="Sellados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ImporteGanancia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="AccionVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Calle" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Localidad" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Provincia" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TitularInversor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Impresion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PuntosQuiero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PagoServicios" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ConceptoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FechaPrimerVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="TipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReintegroComision" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroReclamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="FechaReclamo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="NumeroComision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumeroHost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TransferenciasOtrosfintechs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodigofintechCBU" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
 *                             &lt;element name="NumeroCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AliasCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DocumentoIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NombreBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ImporteComision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="MarcaTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ReferenciaOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CompraMonedaExtranjera" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CodigoBoleto" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
 *                             &lt;element name="NumeroBoletoAfectado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="OperadorSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="TerminalSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumeroTicket" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FechaHoraAsignacionTicket" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="FechaHoraAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="FechaHoraUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="ImportePercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PorcentajePercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CodigoDDJ" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TransferenciasTerceromtech" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DenominacionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumeroTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="AliasCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DescripcionOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CodigoSegmento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}idMensaje" minOccurs="0"/>
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
@XmlRootElement(name = "RegistrarOperacionesMonetariasRequest")
public class RegistrarOperacionesMonetariasRequest {

    @XmlElement(name = "mtechHeader", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0", required = true)
    protected mtechHeader mtechHeader;
    @XmlElement(name = "Datos", required = true)
    protected RegistrarOperacionesMonetariasRequest.Datos datos;

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
     *     {@link RegistrarOperacionesMonetariasRequest.Datos }
     *     
     */
    public RegistrarOperacionesMonetariasRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrarOperacionesMonetariasRequest.Datos }
     *     
     */
    public void setDatos(RegistrarOperacionesMonetariasRequest.Datos value) {
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
     *         &lt;element name="IdentificadorOperacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="NumeroAdhesion" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="FechaMovimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="FechaHoraInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="FechaHoraFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="CodigoTipoTransaccion" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
     *         &lt;element name="CuentaDebitoSubsistema" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CuentaDebitoMoneda" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CuentaDebito" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CuentaDebitoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CuentaCreditoSubsistema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CuentaCreditoMoneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="NumeroCuentaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CuentaCreditoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NumeroCuentaTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ImporteCotizacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CodigoEstado" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2"/>
     *         &lt;element name="CodigoError" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Tarjeta" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TipoMonedaPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Cartera" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="TipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="NumeroSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="FechaEnvio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Titulo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumeroOrden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="EspecieOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UbicacionOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EspecieDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UbicacionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TipoRescate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CantidadCuotaParte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="Circuito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PrecioLimite" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PlazoFijo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TipoPlazoFijo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SubSistemaPlazoFijo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ImporteInteres" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="Sellado1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="Sellado2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="SelladoVencimiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="TasaNominalAnual" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="SelladoMunicipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="TasaEfectivaMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="Sellados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ImporteGanancia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="AccionVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Calle" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Localidad" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Provincia" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TitularInversor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Impresion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PuntosQuiero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PagoServicios" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ConceptoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FechaPrimerVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="TipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReintegroComision" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumeroReclamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="FechaReclamo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="NumeroComision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumeroHost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TransferenciasOtrosfintechs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodigofintechCBU" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
     *                   &lt;element name="NumeroCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AliasCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DocumentoIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NombreBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ImporteComision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="MarcaTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ReferenciaOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CompraMonedaExtranjera" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CodigoBoleto" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
     *                   &lt;element name="NumeroBoletoAfectado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="OperadorSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="TerminalSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumeroTicket" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FechaHoraAsignacionTicket" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="FechaHoraAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="FechaHoraUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="ImportePercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PorcentajePercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CodigoDDJ" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TransferenciasTerceromtech" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DenominacionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumeroTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="AliasCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DescripcionOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CodigoSegmento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}idMensaje" minOccurs="0"/>
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
        "identificadorOperacion",
        "numeroAdhesion",
        "fechaMovimiento",
        "fechaProceso",
        "fechaHoraInicio",
        "fechaHoraFin",
        "codigoTipoTransaccion",
        "cuentaDebitoSubsistema",
        "cuentaDebitoMoneda",
        "cuentaDebito",
        "cuentaDebitoImporte",
        "cuentaCreditoSubsistema",
        "cuentaCreditoMoneda",
        "numeroCuentaCredito",
        "cuentaCreditoImporte",
        "numeroCuentaTarjeta",
        "importeCotizacion",
        "codigoEstado",
        "codigoError",
        "descripcion",
        "tarjeta",
        "titulo",
        "plazoFijo",
        "pagoServicios",
        "reintegroComision",
        "transferenciasOtrosfintechs",
        "compraMonedaExtranjera",
        "transferenciasTerceromtech",
        "tipoTransaccion",
        "codigoSegmento",
        "idOperacion"
    })
    public static class Datos {

        @XmlElement(name = "IdentificadorOperacion")
        protected int identificadorOperacion;
        @XmlElement(name = "NumeroAdhesion")
        protected int numeroAdhesion;
        @XmlElement(name = "FechaMovimiento", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaMovimiento;
        @XmlElement(name = "FechaProceso")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaProceso;
        @XmlElement(name = "FechaHoraInicio", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaHoraInicio;
        @XmlElement(name = "FechaHoraFin")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaHoraFin;
        @XmlElement(name = "CodigoTipoTransaccion")
        protected Codigov2 codigoTipoTransaccion;
        @XmlElement(name = "CuentaDebitoSubsistema")
        protected int cuentaDebitoSubsistema;
        @XmlElement(name = "CuentaDebitoMoneda")
        protected int cuentaDebitoMoneda;
        @XmlElement(name = "CuentaDebito", required = true)
        protected String cuentaDebito;
        @XmlElement(name = "CuentaDebitoImporte")
        protected BigDecimal cuentaDebitoImporte;
        @XmlElement(name = "CuentaCreditoSubsistema")
        protected Integer cuentaCreditoSubsistema;
        @XmlElement(name = "CuentaCreditoMoneda")
        protected Integer cuentaCreditoMoneda;
        @XmlElement(name = "NumeroCuentaCredito")
        protected String numeroCuentaCredito;
        @XmlElement(name = "CuentaCreditoImporte")
        protected BigDecimal cuentaCreditoImporte;
        @XmlElement(name = "NumeroCuentaTarjeta")
        protected String numeroCuentaTarjeta;
        @XmlElement(name = "ImporteCotizacion")
        protected BigDecimal importeCotizacion;
        @XmlElement(name = "CodigoEstado", required = true)
        protected Codigov2 codigoEstado;
        @XmlElement(name = "CodigoError")
        protected Codigov2 codigoError;
        @XmlElement(name = "Descripcion")
        protected String descripcion;
        @XmlElement(name = "Tarjeta")
        protected RegistrarOperacionesMonetariasRequest.Datos.Tarjeta tarjeta;
        @XmlElement(name = "Titulo")
        protected RegistrarOperacionesMonetariasRequest.Datos.Titulo titulo;
        @XmlElement(name = "PlazoFijo")
        protected RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo plazoFijo;
        @XmlElement(name = "PagoServicios")
        protected RegistrarOperacionesMonetariasRequest.Datos.PagoServicios pagoServicios;
        @XmlElement(name = "ReintegroComision")
        protected RegistrarOperacionesMonetariasRequest.Datos.ReintegroComision reintegroComision;
        @XmlElement(name = "TransferenciasOtrosfintechs")
        protected RegistrarOperacionesMonetariasRequest.Datos.TransferenciasOtrosfintechs transferenciasOtrosfintechs;
        @XmlElement(name = "CompraMonedaExtranjera")
        protected RegistrarOperacionesMonetariasRequest.Datos.CompraMonedaExtranjera compraMonedaExtranjera;
        @XmlElement(name = "TransferenciasTerceromtech")
        protected RegistrarOperacionesMonetariasRequest.Datos.TransferenciasTerceromtech transferenciasTerceromtech;
        @XmlElement(name = "TipoTransaccion", required = true)
        protected String tipoTransaccion;
        @XmlElement(name = "CodigoSegmento")
        protected BigDecimal codigoSegmento;
        @XmlElement(name = "IdOperacion")
        protected IdMensaje idOperacion;

        /**
         * Obtiene el valor de la propiedad identificadorOperacion.
         * 
         */
        public int getIdentificadorOperacion() {
            return identificadorOperacion;
        }

        /**
         * Define el valor de la propiedad identificadorOperacion.
         * 
         */
        public void setIdentificadorOperacion(int value) {
            this.identificadorOperacion = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroAdhesion.
         * 
         */
        public int getNumeroAdhesion() {
            return numeroAdhesion;
        }

        /**
         * Define el valor de la propiedad numeroAdhesion.
         * 
         */
        public void setNumeroAdhesion(int value) {
            this.numeroAdhesion = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaMovimiento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaMovimiento() {
            return fechaMovimiento;
        }

        /**
         * Define el valor de la propiedad fechaMovimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaMovimiento(XMLGregorianCalendar value) {
            this.fechaMovimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaProceso.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaProceso() {
            return fechaProceso;
        }

        /**
         * Define el valor de la propiedad fechaProceso.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaProceso(XMLGregorianCalendar value) {
            this.fechaProceso = value;
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
         * Obtiene el valor de la propiedad codigoTipoTransaccion.
         * 
         * @return
         *     possible object is
         *     {@link Codigov2 }
         *     
         */
        public Codigov2 getCodigoTipoTransaccion() {
            return codigoTipoTransaccion;
        }

        /**
         * Define el valor de la propiedad codigoTipoTransaccion.
         * 
         * @param value
         *     allowed object is
         *     {@link Codigov2 }
         *     
         */
        public void setCodigoTipoTransaccion(Codigov2 value) {
            this.codigoTipoTransaccion = value;
        }

        /**
         * Obtiene el valor de la propiedad cuentaDebitoSubsistema.
         * 
         */
        public int getCuentaDebitoSubsistema() {
            return cuentaDebitoSubsistema;
        }

        /**
         * Define el valor de la propiedad cuentaDebitoSubsistema.
         * 
         */
        public void setCuentaDebitoSubsistema(int value) {
            this.cuentaDebitoSubsistema = value;
        }

        /**
         * Obtiene el valor de la propiedad cuentaDebitoMoneda.
         * 
         */
        public int getCuentaDebitoMoneda() {
            return cuentaDebitoMoneda;
        }

        /**
         * Define el valor de la propiedad cuentaDebitoMoneda.
         * 
         */
        public void setCuentaDebitoMoneda(int value) {
            this.cuentaDebitoMoneda = value;
        }

        /**
         * Obtiene el valor de la propiedad cuentaDebito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCuentaDebito() {
            return cuentaDebito;
        }

        /**
         * Define el valor de la propiedad cuentaDebito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCuentaDebito(String value) {
            this.cuentaDebito = value;
        }

        /**
         * Obtiene el valor de la propiedad cuentaDebitoImporte.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCuentaDebitoImporte() {
            return cuentaDebitoImporte;
        }

        /**
         * Define el valor de la propiedad cuentaDebitoImporte.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCuentaDebitoImporte(BigDecimal value) {
            this.cuentaDebitoImporte = value;
        }

        /**
         * Obtiene el valor de la propiedad cuentaCreditoSubsistema.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCuentaCreditoSubsistema() {
            return cuentaCreditoSubsistema;
        }

        /**
         * Define el valor de la propiedad cuentaCreditoSubsistema.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCuentaCreditoSubsistema(Integer value) {
            this.cuentaCreditoSubsistema = value;
        }

        /**
         * Obtiene el valor de la propiedad cuentaCreditoMoneda.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCuentaCreditoMoneda() {
            return cuentaCreditoMoneda;
        }

        /**
         * Define el valor de la propiedad cuentaCreditoMoneda.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCuentaCreditoMoneda(Integer value) {
            this.cuentaCreditoMoneda = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroCuentaCredito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroCuentaCredito() {
            return numeroCuentaCredito;
        }

        /**
         * Define el valor de la propiedad numeroCuentaCredito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroCuentaCredito(String value) {
            this.numeroCuentaCredito = value;
        }

        /**
         * Obtiene el valor de la propiedad cuentaCreditoImporte.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCuentaCreditoImporte() {
            return cuentaCreditoImporte;
        }

        /**
         * Define el valor de la propiedad cuentaCreditoImporte.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCuentaCreditoImporte(BigDecimal value) {
            this.cuentaCreditoImporte = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroCuentaTarjeta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroCuentaTarjeta() {
            return numeroCuentaTarjeta;
        }

        /**
         * Define el valor de la propiedad numeroCuentaTarjeta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroCuentaTarjeta(String value) {
            this.numeroCuentaTarjeta = value;
        }

        /**
         * Obtiene el valor de la propiedad importeCotizacion.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporteCotizacion() {
            return importeCotizacion;
        }

        /**
         * Define el valor de la propiedad importeCotizacion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setImporteCotizacion(BigDecimal value) {
            this.importeCotizacion = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoEstado.
         * 
         * @return
         *     possible object is
         *     {@link Codigov2 }
         *     
         */
        public Codigov2 getCodigoEstado() {
            return codigoEstado;
        }

        /**
         * Define el valor de la propiedad codigoEstado.
         * 
         * @param value
         *     allowed object is
         *     {@link Codigov2 }
         *     
         */
        public void setCodigoEstado(Codigov2 value) {
            this.codigoEstado = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoError.
         * 
         * @return
         *     possible object is
         *     {@link Codigov2 }
         *     
         */
        public Codigov2 getCodigoError() {
            return codigoError;
        }

        /**
         * Define el valor de la propiedad codigoError.
         * 
         * @param value
         *     allowed object is
         *     {@link Codigov2 }
         *     
         */
        public void setCodigoError(Codigov2 value) {
            this.codigoError = value;
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
         * Obtiene el valor de la propiedad tarjeta.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.Tarjeta }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.Tarjeta getTarjeta() {
            return tarjeta;
        }

        /**
         * Define el valor de la propiedad tarjeta.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.Tarjeta }
         *     
         */
        public void setTarjeta(RegistrarOperacionesMonetariasRequest.Datos.Tarjeta value) {
            this.tarjeta = value;
        }

        /**
         * Obtiene el valor de la propiedad titulo.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.Titulo }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.Titulo getTitulo() {
            return titulo;
        }

        /**
         * Define el valor de la propiedad titulo.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.Titulo }
         *     
         */
        public void setTitulo(RegistrarOperacionesMonetariasRequest.Datos.Titulo value) {
            this.titulo = value;
        }

        /**
         * Obtiene el valor de la propiedad plazoFijo.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo getPlazoFijo() {
            return plazoFijo;
        }

        /**
         * Define el valor de la propiedad plazoFijo.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo }
         *     
         */
        public void setPlazoFijo(RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo value) {
            this.plazoFijo = value;
        }

        /**
         * Obtiene el valor de la propiedad pagoServicios.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.PagoServicios }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.PagoServicios getPagoServicios() {
            return pagoServicios;
        }

        /**
         * Define el valor de la propiedad pagoServicios.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.PagoServicios }
         *     
         */
        public void setPagoServicios(RegistrarOperacionesMonetariasRequest.Datos.PagoServicios value) {
            this.pagoServicios = value;
        }

        /**
         * Obtiene el valor de la propiedad reintegroComision.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.ReintegroComision }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.ReintegroComision getReintegroComision() {
            return reintegroComision;
        }

        /**
         * Define el valor de la propiedad reintegroComision.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.ReintegroComision }
         *     
         */
        public void setReintegroComision(RegistrarOperacionesMonetariasRequest.Datos.ReintegroComision value) {
            this.reintegroComision = value;
        }

        /**
         * Obtiene el valor de la propiedad transferenciasOtrosfintechs.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.TransferenciasOtrosfintechs }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.TransferenciasOtrosfintechs getTransferenciasOtrosfintechs() {
            return transferenciasOtrosfintechs;
        }

        /**
         * Define el valor de la propiedad transferenciasOtrosfintechs.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.TransferenciasOtrosfintechs }
         *     
         */
        public void setTransferenciasOtrosfintechs(RegistrarOperacionesMonetariasRequest.Datos.TransferenciasOtrosfintechs value) {
            this.transferenciasOtrosfintechs = value;
        }

        /**
         * Obtiene el valor de la propiedad compraMonedaExtranjera.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.CompraMonedaExtranjera }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.CompraMonedaExtranjera getCompraMonedaExtranjera() {
            return compraMonedaExtranjera;
        }

        /**
         * Define el valor de la propiedad compraMonedaExtranjera.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.CompraMonedaExtranjera }
         *     
         */
        public void setCompraMonedaExtranjera(RegistrarOperacionesMonetariasRequest.Datos.CompraMonedaExtranjera value) {
            this.compraMonedaExtranjera = value;
        }

        /**
         * Obtiene el valor de la propiedad transferenciasTerceromtech.
         * 
         * @return
         *     possible object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.TransferenciasTerceromtech }
         *     
         */
        public RegistrarOperacionesMonetariasRequest.Datos.TransferenciasTerceromtech getTransferenciasTerceromtech() {
            return transferenciasTerceromtech;
        }

        /**
         * Define el valor de la propiedad transferenciasTerceromtech.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrarOperacionesMonetariasRequest.Datos.TransferenciasTerceromtech }
         *     
         */
        public void setTransferenciasTerceromtech(RegistrarOperacionesMonetariasRequest.Datos.TransferenciasTerceromtech value) {
            this.transferenciasTerceromtech = value;
        }

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
         * Obtiene el valor de la propiedad codigoSegmento.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCodigoSegmento() {
            return codigoSegmento;
        }

        /**
         * Define el valor de la propiedad codigoSegmento.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCodigoSegmento(BigDecimal value) {
            this.codigoSegmento = value;
        }

        /**
         * Obtiene el valor de la propiedad idOperacion.
         * 
         * @return
         *     possible object is
         *     {@link IdMensaje }
         *     
         */
        public IdMensaje getIdOperacion() {
            return idOperacion;
        }

        /**
         * Define el valor de la propiedad idOperacion.
         * 
         * @param value
         *     allowed object is
         *     {@link IdMensaje }
         *     
         */
        public void setIdOperacion(IdMensaje value) {
            this.idOperacion = value;
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
         *         &lt;element name="CodigoBoleto" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
         *         &lt;element name="NumeroBoletoAfectado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="OperadorSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="TerminalSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumeroTicket" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FechaHoraAsignacionTicket" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="FechaHoraAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="FechaHoraUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="ImportePercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PorcentajePercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CodigoDDJ" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
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
            "codigoBoleto",
            "numeroBoletoAfectado",
            "numeroOperacion",
            "operadorSucursal",
            "terminalSucursal",
            "numeroTicket",
            "fechaHoraAsignacionTicket",
            "fechaHoraAlta",
            "fechaHoraUltimaActualizacion",
            "importePercepcion",
            "porcentajePercepcion",
            "codigoDDJ"
        })
        public static class CompraMonedaExtranjera {

            @XmlElement(name = "CodigoBoleto")
            protected Codigov2 codigoBoleto;
            @XmlElement(name = "NumeroBoletoAfectado")
            protected Integer numeroBoletoAfectado;
            @XmlElement(name = "NumeroOperacion")
            protected Integer numeroOperacion;
            @XmlElement(name = "OperadorSucursal")
            protected Integer operadorSucursal;
            @XmlElement(name = "TerminalSucursal")
            protected String terminalSucursal;
            @XmlElement(name = "NumeroTicket")
            protected BigDecimal numeroTicket;
            @XmlElement(name = "FechaHoraAsignacionTicket")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaHoraAsignacionTicket;
            @XmlElement(name = "FechaHoraAlta")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaHoraAlta;
            @XmlElement(name = "FechaHoraUltimaActualizacion")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaHoraUltimaActualizacion;
            @XmlElement(name = "ImportePercepcion")
            protected BigDecimal importePercepcion;
            @XmlElement(name = "PorcentajePercepcion")
            protected BigDecimal porcentajePercepcion;
            @XmlElement(name = "CodigoDDJ")
            protected Codigov2 codigoDDJ;

            /**
             * Obtiene el valor de la propiedad codigoBoleto.
             * 
             * @return
             *     possible object is
             *     {@link Codigov2 }
             *     
             */
            public Codigov2 getCodigoBoleto() {
                return codigoBoleto;
            }

            /**
             * Define el valor de la propiedad codigoBoleto.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigov2 }
             *     
             */
            public void setCodigoBoleto(Codigov2 value) {
                this.codigoBoleto = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroBoletoAfectado.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroBoletoAfectado() {
                return numeroBoletoAfectado;
            }

            /**
             * Define el valor de la propiedad numeroBoletoAfectado.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroBoletoAfectado(Integer value) {
                this.numeroBoletoAfectado = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroOperacion.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroOperacion() {
                return numeroOperacion;
            }

            /**
             * Define el valor de la propiedad numeroOperacion.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroOperacion(Integer value) {
                this.numeroOperacion = value;
            }

            /**
             * Obtiene el valor de la propiedad operadorSucursal.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOperadorSucursal() {
                return operadorSucursal;
            }

            /**
             * Define el valor de la propiedad operadorSucursal.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOperadorSucursal(Integer value) {
                this.operadorSucursal = value;
            }

            /**
             * Obtiene el valor de la propiedad terminalSucursal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalSucursal() {
                return terminalSucursal;
            }

            /**
             * Define el valor de la propiedad terminalSucursal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalSucursal(String value) {
                this.terminalSucursal = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroTicket.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumeroTicket() {
                return numeroTicket;
            }

            /**
             * Define el valor de la propiedad numeroTicket.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNumeroTicket(BigDecimal value) {
                this.numeroTicket = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraAsignacionTicket.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraAsignacionTicket() {
                return fechaHoraAsignacionTicket;
            }

            /**
             * Define el valor de la propiedad fechaHoraAsignacionTicket.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraAsignacionTicket(XMLGregorianCalendar value) {
                this.fechaHoraAsignacionTicket = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraAlta.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraAlta() {
                return fechaHoraAlta;
            }

            /**
             * Define el valor de la propiedad fechaHoraAlta.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraAlta(XMLGregorianCalendar value) {
                this.fechaHoraAlta = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraUltimaActualizacion.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraUltimaActualizacion() {
                return fechaHoraUltimaActualizacion;
            }

            /**
             * Define el valor de la propiedad fechaHoraUltimaActualizacion.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraUltimaActualizacion(XMLGregorianCalendar value) {
                this.fechaHoraUltimaActualizacion = value;
            }

            /**
             * Obtiene el valor de la propiedad importePercepcion.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImportePercepcion() {
                return importePercepcion;
            }

            /**
             * Define el valor de la propiedad importePercepcion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImportePercepcion(BigDecimal value) {
                this.importePercepcion = value;
            }

            /**
             * Obtiene el valor de la propiedad porcentajePercepcion.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPorcentajePercepcion() {
                return porcentajePercepcion;
            }

            /**
             * Define el valor de la propiedad porcentajePercepcion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPorcentajePercepcion(BigDecimal value) {
                this.porcentajePercepcion = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoDDJ.
             * 
             * @return
             *     possible object is
             *     {@link Codigov2 }
             *     
             */
            public Codigov2 getCodigoDDJ() {
                return codigoDDJ;
            }

            /**
             * Define el valor de la propiedad codigoDDJ.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigov2 }
             *     
             */
            public void setCodigoDDJ(Codigov2 value) {
                this.codigoDDJ = value;
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
         *         &lt;element name="ConceptoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FechaPrimerVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="TipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "conceptoPago",
            "fechaPrimerVencimiento",
            "tipoPago"
        })
        public static class PagoServicios {

            @XmlElement(name = "ConceptoPago")
            protected String conceptoPago;
            @XmlElement(name = "FechaPrimerVencimiento")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaPrimerVencimiento;
            @XmlElement(name = "TipoPago")
            protected String tipoPago;

            /**
             * Obtiene el valor de la propiedad conceptoPago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConceptoPago() {
                return conceptoPago;
            }

            /**
             * Define el valor de la propiedad conceptoPago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConceptoPago(String value) {
                this.conceptoPago = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaPrimerVencimiento.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaPrimerVencimiento() {
                return fechaPrimerVencimiento;
            }

            /**
             * Define el valor de la propiedad fechaPrimerVencimiento.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaPrimerVencimiento(XMLGregorianCalendar value) {
                this.fechaPrimerVencimiento = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoPago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoPago() {
                return tipoPago;
            }

            /**
             * Define el valor de la propiedad tipoPago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoPago(String value) {
                this.tipoPago = value;
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
         *         &lt;element name="TipoPlazoFijo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SubSistemaPlazoFijo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ImporteInteres" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="Sellado1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="Sellado2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="SelladoVencimiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="TasaNominalAnual" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="SelladoMunicipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="TasaEfectivaMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="Sellados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ImporteGanancia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="AccionVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Calle" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Localidad" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Provincia" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TitularInversor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Impresion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PuntosQuiero" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "tipoPlazoFijo",
            "subSistemaPlazoFijo",
            "importeInteres",
            "plazo",
            "fechaVencimiento",
            "sellado1",
            "sellado2",
            "fechaPago",
            "selladoVencimiento",
            "tasaNominalAnual",
            "selladoMunicipal",
            "tasaEfectivaMensual",
            "sellados",
            "importeGanancia",
            "accionVencimiento",
            "calle",
            "numero",
            "piso",
            "departamento",
            "localidad",
            "codigoPostal",
            "provincia",
            "titularInversor",
            "impresion",
            "puntosQuiero"
        })
        public static class PlazoFijo {

            @XmlElement(name = "TipoPlazoFijo", required = true)
            protected String tipoPlazoFijo;
            @XmlElement(name = "SubSistemaPlazoFijo")
            protected int subSistemaPlazoFijo;
            @XmlElement(name = "ImporteInteres", required = true)
            protected BigDecimal importeInteres;
            @XmlElement(name = "Plazo")
            protected int plazo;
            @XmlElement(name = "FechaVencimiento", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaVencimiento;
            @XmlElement(name = "Sellado1")
            protected BigDecimal sellado1;
            @XmlElement(name = "Sellado2")
            protected BigDecimal sellado2;
            @XmlElement(name = "FechaPago", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaPago;
            @XmlElement(name = "SelladoVencimiento")
            protected BigDecimal selladoVencimiento;
            @XmlElement(name = "TasaNominalAnual", required = true)
            protected BigDecimal tasaNominalAnual;
            @XmlElement(name = "SelladoMunicipal")
            protected BigDecimal selladoMunicipal;
            @XmlElement(name = "TasaEfectivaMensual")
            protected BigDecimal tasaEfectivaMensual;
            @XmlElement(name = "Sellados")
            protected BigDecimal sellados;
            @XmlElement(name = "ImporteGanancia")
            protected BigDecimal importeGanancia;
            @XmlElement(name = "AccionVencimiento")
            protected String accionVencimiento;
            @XmlElement(name = "Calle")
            protected RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Calle calle;
            @XmlElement(name = "Numero")
            protected String numero;
            @XmlElement(name = "Piso")
            protected String piso;
            @XmlElement(name = "Departamento")
            protected String departamento;
            @XmlElement(name = "Localidad")
            protected RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Localidad localidad;
            @XmlElement(name = "CodigoPostal")
            protected String codigoPostal;
            @XmlElement(name = "Provincia")
            protected RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Provincia provincia;
            @XmlElement(name = "TitularInversor")
            protected String titularInversor;
            @XmlElement(name = "Impresion", required = true)
            protected String impresion;
            @XmlElement(name = "PuntosQuiero")
            protected int puntosQuiero;

            /**
             * Obtiene el valor de la propiedad tipoPlazoFijo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoPlazoFijo() {
                return tipoPlazoFijo;
            }

            /**
             * Define el valor de la propiedad tipoPlazoFijo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoPlazoFijo(String value) {
                this.tipoPlazoFijo = value;
            }

            /**
             * Obtiene el valor de la propiedad subSistemaPlazoFijo.
             * 
             */
            public int getSubSistemaPlazoFijo() {
                return subSistemaPlazoFijo;
            }

            /**
             * Define el valor de la propiedad subSistemaPlazoFijo.
             * 
             */
            public void setSubSistemaPlazoFijo(int value) {
                this.subSistemaPlazoFijo = value;
            }

            /**
             * Obtiene el valor de la propiedad importeInteres.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteInteres() {
                return importeInteres;
            }

            /**
             * Define el valor de la propiedad importeInteres.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporteInteres(BigDecimal value) {
                this.importeInteres = value;
            }

            /**
             * Obtiene el valor de la propiedad plazo.
             * 
             */
            public int getPlazo() {
                return plazo;
            }

            /**
             * Define el valor de la propiedad plazo.
             * 
             */
            public void setPlazo(int value) {
                this.plazo = value;
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
             * Obtiene el valor de la propiedad sellado1.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSellado1() {
                return sellado1;
            }

            /**
             * Define el valor de la propiedad sellado1.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSellado1(BigDecimal value) {
                this.sellado1 = value;
            }

            /**
             * Obtiene el valor de la propiedad sellado2.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSellado2() {
                return sellado2;
            }

            /**
             * Define el valor de la propiedad sellado2.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSellado2(BigDecimal value) {
                this.sellado2 = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaPago.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaPago() {
                return fechaPago;
            }

            /**
             * Define el valor de la propiedad fechaPago.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaPago(XMLGregorianCalendar value) {
                this.fechaPago = value;
            }

            /**
             * Obtiene el valor de la propiedad selladoVencimiento.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSelladoVencimiento() {
                return selladoVencimiento;
            }

            /**
             * Define el valor de la propiedad selladoVencimiento.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSelladoVencimiento(BigDecimal value) {
                this.selladoVencimiento = value;
            }

            /**
             * Obtiene el valor de la propiedad tasaNominalAnual.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTasaNominalAnual() {
                return tasaNominalAnual;
            }

            /**
             * Define el valor de la propiedad tasaNominalAnual.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTasaNominalAnual(BigDecimal value) {
                this.tasaNominalAnual = value;
            }

            /**
             * Obtiene el valor de la propiedad selladoMunicipal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSelladoMunicipal() {
                return selladoMunicipal;
            }

            /**
             * Define el valor de la propiedad selladoMunicipal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSelladoMunicipal(BigDecimal value) {
                this.selladoMunicipal = value;
            }

            /**
             * Obtiene el valor de la propiedad tasaEfectivaMensual.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTasaEfectivaMensual() {
                return tasaEfectivaMensual;
            }

            /**
             * Define el valor de la propiedad tasaEfectivaMensual.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTasaEfectivaMensual(BigDecimal value) {
                this.tasaEfectivaMensual = value;
            }

            /**
             * Obtiene el valor de la propiedad sellados.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSellados() {
                return sellados;
            }

            /**
             * Define el valor de la propiedad sellados.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSellados(BigDecimal value) {
                this.sellados = value;
            }

            /**
             * Obtiene el valor de la propiedad importeGanancia.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteGanancia() {
                return importeGanancia;
            }

            /**
             * Define el valor de la propiedad importeGanancia.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporteGanancia(BigDecimal value) {
                this.importeGanancia = value;
            }

            /**
             * Obtiene el valor de la propiedad accionVencimiento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccionVencimiento() {
                return accionVencimiento;
            }

            /**
             * Define el valor de la propiedad accionVencimiento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccionVencimiento(String value) {
                this.accionVencimiento = value;
            }

            /**
             * Obtiene el valor de la propiedad calle.
             * 
             * @return
             *     possible object is
             *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Calle }
             *     
             */
            public RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Calle getCalle() {
                return calle;
            }

            /**
             * Define el valor de la propiedad calle.
             * 
             * @param value
             *     allowed object is
             *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Calle }
             *     
             */
            public void setCalle(RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Calle value) {
                this.calle = value;
            }

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
             * Obtiene el valor de la propiedad piso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPiso() {
                return piso;
            }

            /**
             * Define el valor de la propiedad piso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPiso(String value) {
                this.piso = value;
            }

            /**
             * Obtiene el valor de la propiedad departamento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartamento() {
                return departamento;
            }

            /**
             * Define el valor de la propiedad departamento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartamento(String value) {
                this.departamento = value;
            }

            /**
             * Obtiene el valor de la propiedad localidad.
             * 
             * @return
             *     possible object is
             *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Localidad }
             *     
             */
            public RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Localidad getLocalidad() {
                return localidad;
            }

            /**
             * Define el valor de la propiedad localidad.
             * 
             * @param value
             *     allowed object is
             *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Localidad }
             *     
             */
            public void setLocalidad(RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Localidad value) {
                this.localidad = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoPostal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoPostal() {
                return codigoPostal;
            }

            /**
             * Define el valor de la propiedad codigoPostal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoPostal(String value) {
                this.codigoPostal = value;
            }

            /**
             * Obtiene el valor de la propiedad provincia.
             * 
             * @return
             *     possible object is
             *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Provincia }
             *     
             */
            public RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Provincia getProvincia() {
                return provincia;
            }

            /**
             * Define el valor de la propiedad provincia.
             * 
             * @param value
             *     allowed object is
             *     {@link RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Provincia }
             *     
             */
            public void setProvincia(RegistrarOperacionesMonetariasRequest.Datos.PlazoFijo.Provincia value) {
                this.provincia = value;
            }

            /**
             * Obtiene el valor de la propiedad titularInversor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitularInversor() {
                return titularInversor;
            }

            /**
             * Define el valor de la propiedad titularInversor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitularInversor(String value) {
                this.titularInversor = value;
            }

            /**
             * Obtiene el valor de la propiedad impresion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImpresion() {
                return impresion;
            }

            /**
             * Define el valor de la propiedad impresion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImpresion(String value) {
                this.impresion = value;
            }

            /**
             * Obtiene el valor de la propiedad puntosQuiero.
             * 
             */
            public int getPuntosQuiero() {
                return puntosQuiero;
            }

            /**
             * Define el valor de la propiedad puntosQuiero.
             * 
             */
            public void setPuntosQuiero(int value) {
                this.puntosQuiero = value;
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
             *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "longitud",
                "nombre"
            })
            public static class Calle {

                @XmlElement(name = "Longitud")
                protected int longitud;
                @XmlElement(name = "Nombre", required = true)
                protected String nombre;

                /**
                 * Obtiene el valor de la propiedad longitud.
                 * 
                 */
                public int getLongitud() {
                    return longitud;
                }

                /**
                 * Define el valor de la propiedad longitud.
                 * 
                 */
                public void setLongitud(int value) {
                    this.longitud = value;
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
             *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "longitud",
                "nombre"
            })
            public static class Localidad {

                @XmlElement(name = "Longitud")
                protected int longitud;
                @XmlElement(name = "Nombre", required = true)
                protected String nombre;

                /**
                 * Obtiene el valor de la propiedad longitud.
                 * 
                 */
                public int getLongitud() {
                    return longitud;
                }

                /**
                 * Define el valor de la propiedad longitud.
                 * 
                 */
                public void setLongitud(int value) {
                    this.longitud = value;
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
             *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "longitud",
                "nombre"
            })
            public static class Provincia {

                @XmlElement(name = "Longitud")
                protected int longitud;
                @XmlElement(name = "Nombre", required = true)
                protected String nombre;

                /**
                 * Obtiene el valor de la propiedad longitud.
                 * 
                 */
                public int getLongitud() {
                    return longitud;
                }

                /**
                 * Define el valor de la propiedad longitud.
                 * 
                 */
                public void setLongitud(int value) {
                    this.longitud = value;
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
         *         &lt;element name="NumeroReclamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="FechaReclamo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="NumeroComision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumeroHost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "numeroReclamo",
            "fechaReclamo",
            "numeroComision",
            "descripcion",
            "cuenta",
            "numeroHost"
        })
        public static class ReintegroComision {

            @XmlElement(name = "NumeroReclamo")
            protected Integer numeroReclamo;
            @XmlElement(name = "FechaReclamo")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaReclamo;
            @XmlElement(name = "NumeroComision")
            protected Integer numeroComision;
            @XmlElement(name = "Descripcion")
            protected String descripcion;
            @XmlElement(name = "Cuenta")
            protected String cuenta;
            @XmlElement(name = "NumeroHost")
            protected Integer numeroHost;

            /**
             * Obtiene el valor de la propiedad numeroReclamo.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroReclamo() {
                return numeroReclamo;
            }

            /**
             * Define el valor de la propiedad numeroReclamo.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroReclamo(Integer value) {
                this.numeroReclamo = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaReclamo.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaReclamo() {
                return fechaReclamo;
            }

            /**
             * Define el valor de la propiedad fechaReclamo.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaReclamo(XMLGregorianCalendar value) {
                this.fechaReclamo = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroComision.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroComision() {
                return numeroComision;
            }

            /**
             * Define el valor de la propiedad numeroComision.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroComision(Integer value) {
                this.numeroComision = value;
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
             * Obtiene el valor de la propiedad cuenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCuenta() {
                return cuenta;
            }

            /**
             * Define el valor de la propiedad cuenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCuenta(String value) {
                this.cuenta = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroHost.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroHost() {
                return numeroHost;
            }

            /**
             * Define el valor de la propiedad numeroHost.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroHost(Integer value) {
                this.numeroHost = value;
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
         *         &lt;element name="TipoMonedaPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Cartera" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="TipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="NumeroSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="FechaEnvio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "tipoMonedaPago",
            "cartera",
            "tipoTarjeta",
            "numeroSucursal",
            "fechaEnvio"
        })
        public static class Tarjeta {

            @XmlElement(name = "TipoMonedaPago")
            protected Integer tipoMonedaPago;
            @XmlElement(name = "Cartera")
            protected Integer cartera;
            @XmlElement(name = "TipoTarjeta")
            protected Integer tipoTarjeta;
            @XmlElement(name = "NumeroSucursal")
            protected Integer numeroSucursal;
            @XmlElement(name = "FechaEnvio")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaEnvio;

            /**
             * Obtiene el valor de la propiedad tipoMonedaPago.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTipoMonedaPago() {
                return tipoMonedaPago;
            }

            /**
             * Define el valor de la propiedad tipoMonedaPago.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTipoMonedaPago(Integer value) {
                this.tipoMonedaPago = value;
            }

            /**
             * Obtiene el valor de la propiedad cartera.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCartera() {
                return cartera;
            }

            /**
             * Define el valor de la propiedad cartera.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCartera(Integer value) {
                this.cartera = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoTarjeta.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTipoTarjeta() {
                return tipoTarjeta;
            }

            /**
             * Define el valor de la propiedad tipoTarjeta.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTipoTarjeta(Integer value) {
                this.tipoTarjeta = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroSucursal.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroSucursal() {
                return numeroSucursal;
            }

            /**
             * Define el valor de la propiedad numeroSucursal.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroSucursal(Integer value) {
                this.numeroSucursal = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaEnvio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaEnvio() {
                return fechaEnvio;
            }

            /**
             * Define el valor de la propiedad fechaEnvio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaEnvio(XMLGregorianCalendar value) {
                this.fechaEnvio = value;
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
         *         &lt;element name="NumeroOrden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="EspecieOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UbicacionOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EspecieDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UbicacionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TipoRescate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CantidadCuotaParte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="Circuito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PrecioLimite" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "numeroOrden",
            "especieOrigen",
            "ubicacionOrigen",
            "especieDestino",
            "ubicacionDestino",
            "tipoRescate",
            "cantidadCuotaParte",
            "circuito",
            "precioLimite",
            "vigencia",
            "montoTotal"
        })
        public static class Titulo {

            @XmlElement(name = "NumeroOrden")
            protected Integer numeroOrden;
            @XmlElement(name = "EspecieOrigen")
            protected String especieOrigen;
            @XmlElement(name = "UbicacionOrigen", required = true)
            protected String ubicacionOrigen;
            @XmlElement(name = "EspecieDestino")
            protected String especieDestino;
            @XmlElement(name = "UbicacionDestino")
            protected String ubicacionDestino;
            @XmlElement(name = "TipoRescate")
            protected String tipoRescate;
            @XmlElement(name = "CantidadCuotaParte")
            protected BigDecimal cantidadCuotaParte;
            @XmlElement(name = "Circuito")
            protected String circuito;
            @XmlElement(name = "PrecioLimite")
            protected BigDecimal precioLimite;
            @XmlElement(name = "Vigencia")
            protected Integer vigencia;
            @XmlElement(name = "MontoTotal")
            protected BigDecimal montoTotal;

            /**
             * Obtiene el valor de la propiedad numeroOrden.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroOrden() {
                return numeroOrden;
            }

            /**
             * Define el valor de la propiedad numeroOrden.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroOrden(Integer value) {
                this.numeroOrden = value;
            }

            /**
             * Obtiene el valor de la propiedad especieOrigen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEspecieOrigen() {
                return especieOrigen;
            }

            /**
             * Define el valor de la propiedad especieOrigen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEspecieOrigen(String value) {
                this.especieOrigen = value;
            }

            /**
             * Obtiene el valor de la propiedad ubicacionOrigen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUbicacionOrigen() {
                return ubicacionOrigen;
            }

            /**
             * Define el valor de la propiedad ubicacionOrigen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUbicacionOrigen(String value) {
                this.ubicacionOrigen = value;
            }

            /**
             * Obtiene el valor de la propiedad especieDestino.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEspecieDestino() {
                return especieDestino;
            }

            /**
             * Define el valor de la propiedad especieDestino.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEspecieDestino(String value) {
                this.especieDestino = value;
            }

            /**
             * Obtiene el valor de la propiedad ubicacionDestino.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUbicacionDestino() {
                return ubicacionDestino;
            }

            /**
             * Define el valor de la propiedad ubicacionDestino.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUbicacionDestino(String value) {
                this.ubicacionDestino = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoRescate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoRescate() {
                return tipoRescate;
            }

            /**
             * Define el valor de la propiedad tipoRescate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoRescate(String value) {
                this.tipoRescate = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadCuotaParte.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidadCuotaParte() {
                return cantidadCuotaParte;
            }

            /**
             * Define el valor de la propiedad cantidadCuotaParte.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidadCuotaParte(BigDecimal value) {
                this.cantidadCuotaParte = value;
            }

            /**
             * Obtiene el valor de la propiedad circuito.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCircuito() {
                return circuito;
            }

            /**
             * Define el valor de la propiedad circuito.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCircuito(String value) {
                this.circuito = value;
            }

            /**
             * Obtiene el valor de la propiedad precioLimite.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrecioLimite() {
                return precioLimite;
            }

            /**
             * Define el valor de la propiedad precioLimite.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrecioLimite(BigDecimal value) {
                this.precioLimite = value;
            }

            /**
             * Obtiene el valor de la propiedad vigencia.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getVigencia() {
                return vigencia;
            }

            /**
             * Define el valor de la propiedad vigencia.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setVigencia(Integer value) {
                this.vigencia = value;
            }

            /**
             * Obtiene el valor de la propiedad montoTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotal() {
                return montoTotal;
            }

            /**
             * Define el valor de la propiedad montoTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotal(BigDecimal value) {
                this.montoTotal = value;
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
         *         &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodigofintechCBU" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigov2" minOccurs="0"/>
         *         &lt;element name="NumeroCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AliasCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DocumentoIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NombreBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ImporteComision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="MarcaTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ReferenciaOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "tipoMoneda",
            "codigofintechCBU",
            "numeroCBU",
            "aliasCBU",
            "tipoDocumento",
            "documentoIdentidad",
            "nombreBeneficiario",
            "importeComision",
            "marcaTitular",
            "referenciaOperacion"
        })
        public static class TransferenciasOtrosfintechs {

            @XmlElement(name = "TipoMoneda")
            protected String tipoMoneda;
            @XmlElement(name = "CodigofintechCBU")
            protected Codigov2 codigofintechCBU;
            @XmlElement(name = "NumeroCBU")
            protected String numeroCBU;
            @XmlElement(name = "AliasCBU")
            protected String aliasCBU;
            @XmlElement(name = "TipoDocumento")
            protected String tipoDocumento;
            @XmlElement(name = "DocumentoIdentidad")
            protected String documentoIdentidad;
            @XmlElement(name = "NombreBeneficiario")
            protected String nombreBeneficiario;
            @XmlElement(name = "ImporteComision")
            protected BigDecimal importeComision;
            @XmlElement(name = "MarcaTitular", required = true)
            protected String marcaTitular;
            @XmlElement(name = "ReferenciaOperacion")
            protected String referenciaOperacion;

            /**
             * Obtiene el valor de la propiedad tipoMoneda.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoMoneda() {
                return tipoMoneda;
            }

            /**
             * Define el valor de la propiedad tipoMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoMoneda(String value) {
                this.tipoMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad codigofintechCBU.
             * 
             * @return
             *     possible object is
             *     {@link Codigov2 }
             *     
             */
            public Codigov2 getCodigofintechCBU() {
                return codigofintechCBU;
            }

            /**
             * Define el valor de la propiedad codigofintechCBU.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigov2 }
             *     
             */
            public void setCodigofintechCBU(Codigov2 value) {
                this.codigofintechCBU = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroCBU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroCBU() {
                return numeroCBU;
            }

            /**
             * Define el valor de la propiedad numeroCBU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroCBU(String value) {
                this.numeroCBU = value;
            }

            /**
             * Obtiene el valor de la propiedad aliasCBU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAliasCBU() {
                return aliasCBU;
            }

            /**
             * Define el valor de la propiedad aliasCBU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAliasCBU(String value) {
                this.aliasCBU = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoDocumento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoDocumento() {
                return tipoDocumento;
            }

            /**
             * Define el valor de la propiedad tipoDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoDocumento(String value) {
                this.tipoDocumento = value;
            }

            /**
             * Obtiene el valor de la propiedad documentoIdentidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentoIdentidad() {
                return documentoIdentidad;
            }

            /**
             * Define el valor de la propiedad documentoIdentidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentoIdentidad(String value) {
                this.documentoIdentidad = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreBeneficiario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreBeneficiario() {
                return nombreBeneficiario;
            }

            /**
             * Define el valor de la propiedad nombreBeneficiario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreBeneficiario(String value) {
                this.nombreBeneficiario = value;
            }

            /**
             * Obtiene el valor de la propiedad importeComision.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteComision() {
                return importeComision;
            }

            /**
             * Define el valor de la propiedad importeComision.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporteComision(BigDecimal value) {
                this.importeComision = value;
            }

            /**
             * Obtiene el valor de la propiedad marcaTitular.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarcaTitular() {
                return marcaTitular;
            }

            /**
             * Define el valor de la propiedad marcaTitular.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarcaTitular(String value) {
                this.marcaTitular = value;
            }

            /**
             * Obtiene el valor de la propiedad referenciaOperacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenciaOperacion() {
                return referenciaOperacion;
            }

            /**
             * Define el valor de la propiedad referenciaOperacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenciaOperacion(String value) {
                this.referenciaOperacion = value;
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
         *         &lt;element name="DenominacionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumeroTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="AliasCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DescripcionOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "denominacionCuenta",
            "numeroTitular",
            "aliasCBU",
            "descripcionOperacion"
        })
        public static class TransferenciasTerceromtech {

            @XmlElement(name = "DenominacionCuenta")
            protected String denominacionCuenta;
            @XmlElement(name = "NumeroTitular")
            protected Integer numeroTitular;
            @XmlElement(name = "AliasCBU")
            protected String aliasCBU;
            @XmlElement(name = "DescripcionOperacion")
            protected String descripcionOperacion;

            /**
             * Obtiene el valor de la propiedad denominacionCuenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDenominacionCuenta() {
                return denominacionCuenta;
            }

            /**
             * Define el valor de la propiedad denominacionCuenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDenominacionCuenta(String value) {
                this.denominacionCuenta = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroTitular.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumeroTitular() {
                return numeroTitular;
            }

            /**
             * Define el valor de la propiedad numeroTitular.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumeroTitular(Integer value) {
                this.numeroTitular = value;
            }

            /**
             * Obtiene el valor de la propiedad aliasCBU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAliasCBU() {
                return aliasCBU;
            }

            /**
             * Define el valor de la propiedad aliasCBU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAliasCBU(String value) {
                this.aliasCBU = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcionOperacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcionOperacion() {
                return descripcionOperacion;
            }

            /**
             * Define el valor de la propiedad descripcionOperacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcionOperacion(String value) {
                this.descripcionOperacion = value;
            }

        }

    }

}
