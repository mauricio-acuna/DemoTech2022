
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoSubsistema" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric2"/>
 *         &lt;element name="CodigoMoneda" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric2"/>
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
@XmlType(name = "idCuenta", propOrder = {
    "codigoSubsistema",
    "codigoMoneda",
    "numeroCuenta"
})
public class IdCuenta {

    @XmlElement(name = "CodigoSubsistema")
    protected int codigoSubsistema;
    @XmlElement(name = "CodigoMoneda")
    protected int codigoMoneda;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected NumeroCuentav2 numeroCuenta;

    /**
     * Obtiene el valor de la propiedad codigoSubsistema.
     * 
     */
    public int getCodigoSubsistema() {
        return codigoSubsistema;
    }

    /**
     * Define el valor de la propiedad codigoSubsistema.
     * 
     */
    public void setCodigoSubsistema(int value) {
        this.codigoSubsistema = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     * 
     */
    public int getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     * 
     */
    public void setCodigoMoneda(int value) {
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
