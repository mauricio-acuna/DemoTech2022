
package ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para codigov2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="codigov2">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="idLista" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token60" />
 *       &lt;attribute name="organizacionIdLista" type="{http://ws.mautech.com.ar/webservices/globales/mtechtipossoporte/3_0_0}token60" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codigov2", propOrder = {
    "value"
})
public class Codigov2 {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "idLista")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idLista;
    @XmlAttribute(name = "organizacionIdLista")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String organizacionIdLista;

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
     * Obtiene el valor de la propiedad idLista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLista() {
        return idLista;
    }

    /**
     * Define el valor de la propiedad idLista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLista(String value) {
        this.idLista = value;
    }

    /**
     * Obtiene el valor de la propiedad organizacionIdLista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizacionIdLista() {
        return organizacionIdLista;
    }

    /**
     * Define el valor de la propiedad organizacionIdLista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizacionIdLista(String value) {
        this.organizacionIdLista = value;
    }

}
