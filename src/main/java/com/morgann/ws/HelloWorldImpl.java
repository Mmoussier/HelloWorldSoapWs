package com.morgann.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.morgann.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

    @Override
    public void publishSchedule(String schedule) {
        System.out.println("Appel de la méthode publishSchedule avec le paramètre schedule = " + schedule);
    }

    @Override
    public void updateJob(Job job) {
        System.out.println("Job '" + job.getReference() + "' updated.");
    }

}
