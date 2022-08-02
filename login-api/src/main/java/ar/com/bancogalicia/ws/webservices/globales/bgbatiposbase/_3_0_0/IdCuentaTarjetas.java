
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idCuentaTarjetas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idCuentaTarjetas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMarca" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric3"/>
 *         &lt;element name="NumeroCuentaCredito" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idCuentaTarjetas", propOrder = {
    "codigoMarca",
    "numeroCuentaCredito"
})
public class IdCuentaTarjetas {

    @XmlElement(name = "CodigoMarca")
    protected int codigoMarca;
    @XmlElement(name = "NumeroCuentaCredito", required = true)
    protected BigDecimal numeroCuentaCredito;

    /**
     * Obtiene el valor de la propiedad codigoMarca.
     * 
     */
    public int getCodigoMarca() {
        return codigoMarca;
    }

    /**
     * Define el valor de la propiedad codigoMarca.
     * 
     */
    public void setCodigoMarca(int value) {
        this.codigoMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuentaCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroCuentaCredito() {
        return numeroCuentaCredito;
    }

    /**
     * Define el valor de la propiedad numeroCuentaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroCuentaCredito(BigDecimal value) {
        this.numeroCuentaCredito = value;
    }

}
