
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para saldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saldo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Valor" type="{http://ws.mautech.com.ar/webservices/globales/mtechtiposbase/3_0_0}monto"/>
 *         &lt;element name="FechaHora" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saldo", propOrder = {
    "valor",
    "fechaHora"
})
public class Saldo {

    @XmlElement(name = "Valor", required = true)
    protected Monto valor;
    @XmlElement(name = "FechaHora", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHora;

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link Monto }
     *     
     */
    public Monto getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Monto }
     *     
     */
    public void setValor(Monto value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHora.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHora() {
        return fechaHora;
    }

    /**
     * Define el valor de la propiedad fechaHora.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHora(XMLGregorianCalendar value) {
        this.fechaHora = value;
    }

}
