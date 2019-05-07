package com.morgann.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Created by morgannm on 13/06/2018.
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
    @WebMethod String getHelloWorldAsString(String name);
}
