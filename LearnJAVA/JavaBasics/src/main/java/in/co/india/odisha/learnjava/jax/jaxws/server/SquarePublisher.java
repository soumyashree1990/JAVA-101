package in.co.india.odisha.learnjava.jax.jaxws.server;

import javax.xml.ws.Endpoint;

/**
 * Created by personal on 19-02-2017.
 */
//EndpointPublisher
public class SquarePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/square",new SquareIMPL());
    }
}
