package com.morgann.ws;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher{

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8099/ws/hello", new HelloWorldImpl());
    }

}