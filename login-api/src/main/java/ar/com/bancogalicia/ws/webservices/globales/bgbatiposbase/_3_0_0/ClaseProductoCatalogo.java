
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CodigoProducto" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric9"/>
 *         &lt;element name="CodigoComponente" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}numeric9"/>
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
    "codigoProducto",
    "codigoComponente"
})
@XmlRootElement(name = "ClaseProductoCatalogo")
public class ClaseProductoCatalogo {

    @XmlElement(name = "CodigoProducto")
    protected int codigoProducto;
    @XmlElement(name = "CodigoComponente")
    protected int codigoComponente;

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     */
    public void setCodigoProducto(int value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoComponente.
     * 
     */
    public int getCodigoComponente() {
        return codigoComponente;
    }

    /**
     * Define el valor de la propiedad codigoComponente.
     * 
     */
    public void setCodigoComponente(int value) {
        this.codigoComponente = value;
    }

}
