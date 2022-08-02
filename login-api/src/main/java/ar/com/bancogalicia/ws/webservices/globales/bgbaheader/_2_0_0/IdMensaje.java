
package ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para idMensaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idMensaje">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0>alfanumerico32">
 *       &lt;attribute name="idEsquema" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}alfanumerico3" default="UUI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idMensaje", propOrder = {
    "value"
})
public class IdMensaje {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "idEsquema")
    protected String idEsquema;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad idEsquema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEsquema() {
        if (idEsquema == null) {
            return "UUI";
        } else {
            return idEsquema;
        }
    }

    /**
     * Define el valor de la propiedad idEsquema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEsquema(String value) {
        this.idEsquema = value;
    }

}
