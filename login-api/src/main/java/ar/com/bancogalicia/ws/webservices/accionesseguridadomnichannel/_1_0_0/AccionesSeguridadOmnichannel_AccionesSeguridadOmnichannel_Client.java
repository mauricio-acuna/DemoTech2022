
package ar.com.mautech.ws.webservices.accionesseguridadomnichannel._1_0_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2017-05-16T15:59:10.690-03:00
 * Generated source version: 2.7.11
 * 
 */
public final class AccionesSeguridadOmnichannel_AccionesSeguridadOmnichannel_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.mautech.com.ar/webservices/accionesseguridadomnichannel/1_0_0", "AccionesSeguridadOmnichannel");

    private AccionesSeguridadOmnichannel_AccionesSeguridadOmnichannel_Client() {
    }

//    public static void main(String args[]) throws java.lang.Exception {
//        URL wsdlURL = AccionesSeguridadOmnichannel_Service.WSDL_LOCATION;
//        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
//            File wsdlFile = new File(args[0]);
//            try {
//                if (wsdlFile.exists()) {
//                    wsdlURL = wsdlFile.toURI().toURL();
//                } else {
//                    wsdlURL = new URL(args[0]);
//                }
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
//      
//        AccionesSeguridadOmnichannel_Service ss = new AccionesSeguridadOmnichannel_Service(wsdlURL, SERVICE_NAME);
//        AccionesSeguridadOmnichannel port = ss.getAccionesSeguridadOmnichannel();  
//        
//        {
//        System.out.println("Invoking generarSemilla...");
//        ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillarequest._1_0_0.GenerarSemilla _generarSemilla_parameters = null;
//        try {
//            ar.com.mautech.ws.webservices.accionesseguridadomnichannel.generarsemillaresponse._1_0_0.GenerarSemillaResult _generarSemilla__return = port.generarSemilla(_generarSemilla_parameters);
//            System.out.println("generarSemilla.result=" + _generarSemilla__return);
//
//        } catch (mtechResultadoOperacionFalla e) {
//            System.out.println("Expected exception: mtechResultadoOperacionFalla has occurred.");
//            System.out.println(e.toString());
//        }
//            }
//
//        System.exit(0);
//    }

}
