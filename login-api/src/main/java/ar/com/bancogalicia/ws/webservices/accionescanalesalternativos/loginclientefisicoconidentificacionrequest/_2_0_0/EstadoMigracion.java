
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionrequest._2_0_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadoMigracion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="estadoMigracion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENCRIPTADO BT"/>
 *     &lt;enumeration value="ENCRIPTADO BT Y SCS"/>
 *     &lt;enumeration value="ENCRIPTADO SCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "estadoMigracion")
@XmlEnum
public enum EstadoMigracion {

    @XmlEnumValue("ENCRIPTADO BT")
    ENCRIPTADO_BT("ENCRIPTADO BT"),
    @XmlEnumValue("ENCRIPTADO BT Y SCS")
    ENCRIPTADO_BT_Y_SCS("ENCRIPTADO BT Y SCS"),
    @XmlEnumValue("ENCRIPTADO SCS")
    ENCRIPTADO_SCS("ENCRIPTADO SCS");
    private final String value;

    EstadoMigracion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoMigracion fromValue(String v) {
        for (EstadoMigracion c: EstadoMigracion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
