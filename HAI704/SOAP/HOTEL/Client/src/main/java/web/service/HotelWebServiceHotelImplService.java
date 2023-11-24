
package web.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HotelWebServiceHotelImplService", targetNamespace = "http://service.web/", wsdlLocation = "http://localhost:8090/hotelwebservice?wsdl")
public class HotelWebServiceHotelImplService
    extends Service
{

    private final static URL HOTELWEBSERVICEHOTELIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELWEBSERVICEHOTELIMPLSERVICE_EXCEPTION;
    private final static QName HOTELWEBSERVICEHOTELIMPLSERVICE_QNAME = new QName("http://service.web/", "HotelWebServiceHotelImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/hotelwebservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELWEBSERVICEHOTELIMPLSERVICE_WSDL_LOCATION = url;
        HOTELWEBSERVICEHOTELIMPLSERVICE_EXCEPTION = e;
    }

    public HotelWebServiceHotelImplService() {
        super(__getWsdlLocation(), HOTELWEBSERVICEHOTELIMPLSERVICE_QNAME);
    }

    public HotelWebServiceHotelImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELWEBSERVICEHOTELIMPLSERVICE_QNAME, features);
    }

    public HotelWebServiceHotelImplService(URL wsdlLocation) {
        super(wsdlLocation, HOTELWEBSERVICEHOTELIMPLSERVICE_QNAME);
    }

    public HotelWebServiceHotelImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELWEBSERVICEHOTELIMPLSERVICE_QNAME, features);
    }

    public HotelWebServiceHotelImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelWebServiceHotelImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HotelWebService
     */
    @WebEndpoint(name = "HotelWebServiceHotelImplPort")
    public HotelWebService getHotelWebServiceHotelImplPort() {
        return super.getPort(new QName("http://service.web/", "HotelWebServiceHotelImplPort"), HotelWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelWebService
     */
    @WebEndpoint(name = "HotelWebServiceHotelImplPort")
    public HotelWebService getHotelWebServiceHotelImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.web/", "HotelWebServiceHotelImplPort"), HotelWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELWEBSERVICEHOTELIMPLSERVICE_EXCEPTION!= null) {
            throw HOTELWEBSERVICEHOTELIMPLSERVICE_EXCEPTION;
        }
        return HOTELWEBSERVICEHOTELIMPLSERVICE_WSDL_LOCATION;
    }

}
