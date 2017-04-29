
package t320.nks34;

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
@WebServiceClient(name = "HelloService", targetNamespace = "http://nks34.t320", wsdlLocation = "http://t320webservices.open.ac.uk/t320/services/HelloService?wsdl")
public class HelloService
    extends Service
{

    private final static URL HELLOSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOSERVICE_EXCEPTION;
    private final static QName HELLOSERVICE_QNAME = new QName("http://nks34.t320", "HelloService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://t320webservices.open.ac.uk/t320/services/HelloService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOSERVICE_WSDL_LOCATION = url;
        HELLOSERVICE_EXCEPTION = e;
    }

    public HelloService() {
        super(__getWsdlLocation(), HELLOSERVICE_QNAME);
    }

    public HelloService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOSERVICE_QNAME, features);
    }

    public HelloService(URL wsdlLocation) {
        super(wsdlLocation, HELLOSERVICE_QNAME);
    }

    public HelloService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOSERVICE_QNAME, features);
    }

    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloServicePortType
     */
    @WebEndpoint(name = "HelloServiceSOAP11port_https")
    public HelloServicePortType getHelloServiceSOAP11PortHttps() {
        return super.getPort(new QName("http://nks34.t320", "HelloServiceSOAP11port_https"), HelloServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloServicePortType
     */
    @WebEndpoint(name = "HelloServiceSOAP11port_https")
    public HelloServicePortType getHelloServiceSOAP11PortHttps(WebServiceFeature... features) {
        return super.getPort(new QName("http://nks34.t320", "HelloServiceSOAP11port_https"), HelloServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns HelloServicePortType
     */
    @WebEndpoint(name = "HelloServiceSOAP11port_http1")
    public HelloServicePortType getHelloServiceSOAP11PortHttp1() {
        return super.getPort(new QName("http://nks34.t320", "HelloServiceSOAP11port_http1"), HelloServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloServicePortType
     */
    @WebEndpoint(name = "HelloServiceSOAP11port_http1")
    public HelloServicePortType getHelloServiceSOAP11PortHttp1(WebServiceFeature... features) {
        return super.getPort(new QName("http://nks34.t320", "HelloServiceSOAP11port_http1"), HelloServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSERVICE_EXCEPTION!= null) {
            throw HELLOSERVICE_EXCEPTION;
        }
        return HELLOSERVICE_WSDL_LOCATION;
    }

}
