
package ar.com.mautech.ws.webservices.globales.mtechtipossoporte._3_0_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para monto9_7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="monto9_7">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0>decimal9_7">
 *       &lt;attribute name="listIdMoneda" type="{http://www.w3.org/2001/XMLSchema}string" default="NV" />
 *       &lt;attribute name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monto9_7", propOrder = {
    "value"
})
public class Monto97 {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "listIdMoneda")
    protected String listIdMoneda;
    @XmlAttribute(name = "moneda")
    protected String moneda;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad listIdMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListIdMoneda() {
        if (listIdMoneda == null) {
            return "NV";
        } else {
            return listIdMoneda;
        }
    }

    /**
     * Define el valor de la propiedad listIdMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListIdMoneda(String value) {
        this.listIdMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

}
