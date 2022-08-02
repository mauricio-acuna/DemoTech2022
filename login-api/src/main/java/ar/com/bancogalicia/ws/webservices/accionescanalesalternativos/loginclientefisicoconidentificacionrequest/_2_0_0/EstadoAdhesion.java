
package ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionrequest._2_0_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadoAdhesion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="estadoAdhesion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADHERIDO"/>
 *     &lt;enumeration value="NO ADHERIDO"/>
 *     &lt;enumeration value="BLOQUEADO CLAVE INEXISTENTE SCS"/>
 *     &lt;enumeration value="BLOQUEADO INTENTOS FALLIDOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "estadoAdhesion")
@XmlEnum
public enum EstadoAdhesion {

    ADHERIDO("ADHERIDO"),
    @XmlEnumValue("NO ADHERIDO")
    NO_ADHERIDO("NO ADHERIDO"),
    @XmlEnumValue("BLOQUEADO CLAVE INEXISTENTE SCS")
    BLOQUEADO_CLAVE_INEXISTENTE_SCS("BLOQUEADO CLAVE INEXISTENTE SCS"),
    @XmlEnumValue("BLOQUEADO INTENTOS FALLIDOS")
    BLOQUEADO_INTENTOS_FALLIDOS("BLOQUEADO INTENTOS FALLIDOS");
    private final String value;

    EstadoAdhesion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoAdhesion fromValue(String v) {
        for (EstadoAdhesion c: EstadoAdhesion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
