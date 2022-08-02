
package ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0;

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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}IdMensaje" minOccurs="0"/>
 *         &lt;element name="IdMensajeAnterior" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}idMensaje" minOccurs="0"/>
 *         &lt;element name="IdOperacion" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}idMensaje"/>
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
    "idMensaje",
    "idMensajeAnterior",
    "idOperacion"
})
@XmlRootElement(name = "Identificadores")
public class Identificadores {

    @XmlElement(name = "IdMensaje")
    protected IdMensaje idMensaje;
    @XmlElement(name = "IdMensajeAnterior")
    protected IdMensaje idMensajeAnterior;
    @XmlElement(name = "IdOperacion", required = true)
    protected IdMensaje idOperacion;

    /**
     * Identificador del mensaje actual
     * 
     * @return
     *     possible object is
     *     {@link IdMensaje }
     *     
     */
    public IdMensaje getIdMensaje() {
        return idMensaje;
    }

    /**
     * Define el valor de la propiedad idMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link IdMensaje }
     *     
     */
    public void setIdMensaje(IdMensaje value) {
        this.idMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad idMensajeAnterior.
     * 
     * @return
     *     possible object is
     *     {@link IdMensaje }
     *     
     */
    public IdMensaje getIdMensajeAnterior() {
        return idMensajeAnterior;
    }

    /**
     * Define el valor de la propiedad idMensajeAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link IdMensaje }
     *     
     */
    public void setIdMensajeAnterior(IdMensaje value) {
        this.idMensajeAnterior = value;
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

}
