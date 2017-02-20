package in.co.india.odisha.learnjava.jax.jaxws.server;

import javax.xml.ws.Endpoint;

/**
 * Created by personal on 18-02-2017.
 */
//Endpoint publisher

//This class publishes this webservice in the below url
//it can be accessed at "http://localhost:9999/ws/hello?wsdl"
public class HelloWorldPublisher{

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}
