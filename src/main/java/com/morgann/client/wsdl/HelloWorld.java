package com.morgann.client.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;

// Classe générée par wsimport à partir de l'url du Web Service démarré

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebService(name = "HelloWorld", targetNamespace = "http://ws.morgann.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {


    /**
     *
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.morgann.com/HelloWorld/getHelloWorldAsStringRequest", output = "http://ws.morgann.com/HelloWorld/getHelloWorldAsStringResponse")
    public String getHelloWorldAsString(
            @WebParam(name = "arg0", partName = "arg0")
                    String arg0);

}
