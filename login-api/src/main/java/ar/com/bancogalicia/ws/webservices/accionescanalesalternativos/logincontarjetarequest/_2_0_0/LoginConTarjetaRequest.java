
package ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetarequest._2_0_0;

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
 *                   &lt;element name="TipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Tarjeta">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RequiereIngresoPin" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
 *                   &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
 *                   &lt;element name="ErrorBaseClientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "LoginConTarjetaRequest")
public class LoginConTarjetaRequest {

    @XmlElement(name = "mtechHeader", namespace = "http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0", required = true)
    protected mtechHeader mtechHeader;
    @XmlElement(name = "Datos", required = true)
    protected LoginConTarjetaRequest.Datos datos;

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
     *     {@link LoginConTarjetaRequest.Datos }
     *     
     */
    public LoginConTarjetaRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginConTarjetaRequest.Datos }
     *     
     */
    public void setDatos(LoginConTarjetaRequest.Datos value) {
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
     *         &lt;element name="Tarjeta">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RequiereIngresoPin" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}indicador"/>
     *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IdPersona" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}id"/>
     *         &lt;element name="ErrorBaseClientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "tarjeta",
        "requiereIngresoPin",
        "pin",
        "idPersona",
        "errorBaseClientes"
    })
    public static class Datos {

        @XmlElement(name = "TipoTransaccion", required = true)
        protected String tipoTransaccion;
        @XmlElement(name = "Tarjeta", required = true)
        protected LoginConTarjetaRequest.Datos.Tarjeta tarjeta;
        @XmlElement(name = "RequiereIngresoPin", required = true)
        protected String requiereIngresoPin;
        @XmlElement(name = "PIN")
        protected String pin;
        @XmlElement(name = "IdPersona", required = true)
        protected Id idPersona;
        @XmlElement(name = "ErrorBaseClientes")
        protected String errorBaseClientes;

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
         * Obtiene el valor de la propiedad tarjeta.
         * 
         * @return
         *     possible object is
         *     {@link LoginConTarjetaRequest.Datos.Tarjeta }
         *     
         */
        public LoginConTarjetaRequest.Datos.Tarjeta getTarjeta() {
            return tarjeta;
        }

        /**
         * Define el valor de la propiedad tarjeta.
         * 
         * @param value
         *     allowed object is
         *     {@link LoginConTarjetaRequest.Datos.Tarjeta }
         *     
         */
        public void setTarjeta(LoginConTarjetaRequest.Datos.Tarjeta value) {
            this.tarjeta = value;
        }

        /**
         * Obtiene el valor de la propiedad requiereIngresoPin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequiereIngresoPin() {
            return requiereIngresoPin;
        }

        /**
         * Define el valor de la propiedad requiereIngresoPin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequiereIngresoPin(String value) {
            this.requiereIngresoPin = value;
        }

        /**
         * Obtiene el valor de la propiedad pin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * Define el valor de la propiedad pin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
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
         * Obtiene el valor de la propiedad errorBaseClientes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorBaseClientes() {
            return errorBaseClientes;
        }

        /**
         * Define el valor de la propiedad errorBaseClientes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorBaseClientes(String value) {
            this.errorBaseClientes = value;
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
         *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "tipo",
            "numero"
        })
        public static class Tarjeta {

            @XmlElement(name = "Tipo", required = true)
            protected String tipo;
            @XmlElement(required = true)
            protected String numero;

            /**
             * Obtiene el valor de la propiedad tipo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipo() {
                return tipo;
            }

            /**
             * Define el valor de la propiedad tipo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipo(String value) {
                this.tipo = value;
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

        }

    }

}
