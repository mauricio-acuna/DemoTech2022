
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idProductoBT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idProductoBT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoSubsistemaBT" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric2"/>
 *         &lt;element name="NumeroCuenta" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}numeroCuenta"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idProductoBT", propOrder = {
    "codigoSubsistemaBT",
    "numeroCuenta"
})
public class IdProductoBT {

    @XmlElement(name = "CodigoSubsistemaBT")
    protected int codigoSubsistemaBT;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected NumeroCuenta numeroCuenta;

    /**
     * Obtiene el valor de la propiedad codigoSubsistemaBT.
     * 
     */
    public int getCodigoSubsistemaBT() {
        return codigoSubsistemaBT;
    }

    /**
     * Define el valor de la propiedad codigoSubsistemaBT.
     * 
     */
    public void setCodigoSubsistemaBT(int value) {
        this.codigoSubsistemaBT = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link NumeroCuenta }
     *     
     */
    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroCuenta }
     *     
     */
    public void setNumeroCuenta(NumeroCuenta value) {
        this.numeroCuenta = value;
    }

}
