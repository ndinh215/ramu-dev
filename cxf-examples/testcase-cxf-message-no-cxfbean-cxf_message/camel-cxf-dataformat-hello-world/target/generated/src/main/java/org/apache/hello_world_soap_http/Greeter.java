package org.apache.hello_world_soap_http;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2016-04-26T15:42:29.786+05:30
 * Generated source version: 2.7.0.redhat-610379
 * 
 */
@WebService(targetNamespace = "http://apache.org/hello_world_soap_http", name = "Greeter")
@XmlSeeAlso({org.apache.hello_world_soap_http.types.ObjectFactory.class})
public interface Greeter {

    @WebMethod
    @RequestWrapper(localName = "greetMe", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.GreetMe")
    @ResponseWrapper(localName = "greetMeResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.GreetMeResponse")
    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
    public java.lang.String greetMe(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
        java.lang.String requestType
    ) throws UnknownRequestFault;
}
