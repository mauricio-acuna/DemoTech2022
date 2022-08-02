
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
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}Identificadores" minOccurs="0"/>
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}ModuloAplicativo"/>
 *         &lt;element ref="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}Equipo" minOccurs="0"/>
 *         &lt;element name="Origen" type="{http://ws.mautech.com.ar/webservices/globales/mtechheader/2_0_0}Origen"/>
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
    "identificadores",
    "moduloAplicativo",
    "equipo",
    "origen"
})
@XmlRootElement(name = "mtechHeader")
public class mtechHeader {

    @XmlElement(name = "Identificadores")
    protected Identificadores identificadores;
    @XmlElement(name = "ModuloAplicativo", required = true)
    protected ModuloAplicativo moduloAplicativo;
    @XmlElement(name = "Equipo")
    protected Equipo equipo;
    @XmlElement(name = "Origen", required = true)
    protected Origen origen;

    /**
     * Agrupación de los identificadores requeridos para el tracing de los mensajes
     * 
     * @return
     *     possible object is
     *     {@link Identificadores }
     *     
     */
    public Identificadores getIdentificadores() {
        return identificadores;
    }

    /**
     * Define el valor de la propiedad identificadores.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificadores }
     *     
     */
    public void setIdentificadores(Identificadores value) {
        this.identificadores = value;
    }

    /**
     * Obtiene el valor de la propiedad moduloAplicativo.
     * 
     * @return
     *     possible object is
     *     {@link ModuloAplicativo }
     *     
     */
    public ModuloAplicativo getModuloAplicativo() {
        return moduloAplicativo;
    }

    /**
     * Define el valor de la propiedad moduloAplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuloAplicativo }
     *     
     */
    public void setModuloAplicativo(ModuloAplicativo value) {
        this.moduloAplicativo = value;
    }

    /**
     * Identificación de la máquina que generó el mensaje
     * 
     * @return
     *     possible object is
     *     {@link Equipo }
     *     
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Define el valor de la propiedad equipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipo }
     *     
     */
    public void setEquipo(Equipo value) {
        this.equipo = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link Origen }
     *     
     */
    public Origen getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link Origen }
     *     
     */
    public void setOrigen(Origen value) {
        this.origen = value;
    }

}
