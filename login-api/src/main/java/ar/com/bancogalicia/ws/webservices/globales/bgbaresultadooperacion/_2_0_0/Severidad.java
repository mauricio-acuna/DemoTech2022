
package ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para severidad.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="severidad">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INFO"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "severidad")
@XmlEnum
public enum Severidad {

    OK,
    INFO,
    WARNING,
    ERROR;

    public String value() {
        return name();
    }

    public static Severidad fromValue(String v) {
        return valueOf(v);
    }

}
