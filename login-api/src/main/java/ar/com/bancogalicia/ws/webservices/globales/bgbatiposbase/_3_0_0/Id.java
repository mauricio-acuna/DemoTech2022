
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para id complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="id">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0>alfanumerico32">
 *       &lt;attribute name="idEsquema" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token60" />
 *       &lt;attribute name="organizacionIdEsquema" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token60" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "id", propOrder = {
    "value"
})
public class Id {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "idEsquema")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idEsquema;
    @XmlAttribute(name = "organizacionIdEsquema")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String organizacionIdEsquema;

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
        return idEsquema;
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

    /**
     * Obtiene el valor de la propiedad organizacionIdEsquema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizacionIdEsquema() {
        return organizacionIdEsquema;
    }

    /**
     * Define el valor de la propiedad organizacionIdEsquema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizacionIdEsquema(String value) {
        this.organizacionIdEsquema = value;
    }

}
