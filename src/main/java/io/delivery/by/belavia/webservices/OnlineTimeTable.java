
package io.delivery.by.belavia.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <img src="webservice.jpg" />
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OnlineTimeTable", targetNamespace = "http://webservices.belavia.by/", wsdlLocation = "http://86.57.245.235/TimeTable/Service.asmx?WSDL")
public class OnlineTimeTable
    extends Service
{

    private final static URL ONLINETIMETABLE_WSDL_LOCATION;
    private final static WebServiceException ONLINETIMETABLE_EXCEPTION;
    private final static QName ONLINETIMETABLE_QNAME = new QName("http://webservices.belavia.by/", "OnlineTimeTable");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://86.57.245.235/TimeTable/Service.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ONLINETIMETABLE_WSDL_LOCATION = url;
        ONLINETIMETABLE_EXCEPTION = e;
    }

    public OnlineTimeTable() {
        super(__getWsdlLocation(), ONLINETIMETABLE_QNAME);
    }

    public OnlineTimeTable(WebServiceFeature... features) {
        super(__getWsdlLocation(), ONLINETIMETABLE_QNAME, features);
    }

    public OnlineTimeTable(URL wsdlLocation) {
        super(wsdlLocation, ONLINETIMETABLE_QNAME);
    }

    public OnlineTimeTable(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ONLINETIMETABLE_QNAME, features);
    }

    public OnlineTimeTable(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OnlineTimeTable(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OnlineTimeTableSoap
     */
    @WebEndpoint(name = "OnlineTimeTableSoap")
    public OnlineTimeTableSoap getOnlineTimeTableSoap() {
        return super.getPort(new QName("http://webservices.belavia.by/", "OnlineTimeTableSoap"), OnlineTimeTableSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OnlineTimeTableSoap
     */
    @WebEndpoint(name = "OnlineTimeTableSoap")
    public OnlineTimeTableSoap getOnlineTimeTableSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.belavia.by/", "OnlineTimeTableSoap"), OnlineTimeTableSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ONLINETIMETABLE_EXCEPTION!= null) {
            throw ONLINETIMETABLE_EXCEPTION;
        }
        return ONLINETIMETABLE_WSDL_LOCATION;
    }

}
