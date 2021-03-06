
package com.kema;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * Testing Wsdl style Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "StyleTestsService", targetNamespace = "http://kema.com", wsdlLocation = "file:/C:/data/work/EE_workspaces/KevinPrivate/WSExample/wsdl/BindingStyleTest.wsdl")
public class StyleTestsService
    extends Service
{

    private final static URL STYLETESTSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.kema.StyleTestsService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.kema.StyleTestsService.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/data/work/EE_workspaces/KevinPrivate/WSExample/wsdl/BindingStyleTest.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/data/work/EE_workspaces/KevinPrivate/WSExample/wsdl/BindingStyleTest.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        STYLETESTSSERVICE_WSDL_LOCATION = url;
    }

    public StyleTestsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StyleTestsService() {
        super(STYLETESTSSERVICE_WSDL_LOCATION, new QName("http://kema.com", "StyleTestsService"));
    }

    /**
     * 
     * @return
     *     returns BindingStyleTestRpcPortType
     */
    @WebEndpoint(name = "RpcTestsPort")
    public BindingStyleTestRpcPortType getRpcTestsPort() {
        return super.getPort(new QName("http://kema.com", "RpcTestsPort"), BindingStyleTestRpcPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BindingStyleTestRpcPortType
     */
    @WebEndpoint(name = "RpcTestsPort")
    public BindingStyleTestRpcPortType getRpcTestsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://kema.com", "RpcTestsPort"), BindingStyleTestRpcPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns BindingStyleTestDocumentPortType
     */
    @WebEndpoint(name = "DocumentTestsPort")
    public BindingStyleTestDocumentPortType getDocumentTestsPort() {
        return super.getPort(new QName("http://kema.com", "DocumentTestsPort"), BindingStyleTestDocumentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BindingStyleTestDocumentPortType
     */
    @WebEndpoint(name = "DocumentTestsPort")
    public BindingStyleTestDocumentPortType getDocumentTestsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://kema.com", "DocumentTestsPort"), BindingStyleTestDocumentPortType.class, features);
    }

}
