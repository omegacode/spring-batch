
package org.omegacode.helloworldservice.wsdl;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2014-03-13T20:49:14.274-03:00
 * Generated source version: 2.7.0
 * 
 */
 
public class DigaOlaPortType_HelloWorldServicePort_Server{

    protected DigaOlaPortType_HelloWorldServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new DigaOlaPortTypeImpl();
        String address = "http://www.omegacode.org/HelloWorldService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new DigaOlaPortType_HelloWorldServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
