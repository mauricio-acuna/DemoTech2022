
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idCuenta2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idCuenta2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoSubsistema" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
 *         &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}codigo"/>
 *         &lt;element name="NumeroCuenta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}numeroCuentav2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idCuenta2", propOrder = {
    "codigoSubsistema",
    "codigoMoneda",
    "numeroCuenta"
})
public class IdCuenta2 {

    @XmlElement(name = "CodigoSubsistema", required = true)
    protected Codigo codigoSubsistema;
    @XmlElement(name = "CodigoMoneda", required = true)
    protected Codigo codigoMoneda;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected NumeroCuentav2 numeroCuenta;

    /**
     * Obtiene el valor de la propiedad codigoSubsistema.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigoSubsistema() {
        return codigoSubsistema;
    }

    /**
     * Define el valor de la propiedad codigoSubsistema.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigoSubsistema(Codigo value) {
        this.codigoSubsistema = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigoMoneda(Codigo value) {
        this.codigoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link NumeroCuentav2 }
     *     
     */
    public NumeroCuentav2 getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroCuentav2 }
     *     
     */
    public void setNumeroCuenta(NumeroCuentav2 value) {
        this.numeroCuenta = value;
    }

}
