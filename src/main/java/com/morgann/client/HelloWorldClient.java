package com.morgann.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.morgann.ws.HelloWorld;
import com.morgann.client.wsdl.*;

public class HelloWorldClient{

    public static void main(String[] args) throws Exception {

        // =================== Appel manuel du Web Service ===========================
        URL url = new URL("http://localhost:8099/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.morgann.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("Appel manuel"));

        // ===================== Utilisation des classes générées par wsimport ============
        HelloWorldImplService helloService = new HelloWorldImplService();
        com.morgann.client.wsdl.HelloWorld helloPort = helloService.getHelloWorldImplPort();
        System.out.println(hello.getHelloWorldAsString("Appel par classes générées par wsimport"));
    }

}

