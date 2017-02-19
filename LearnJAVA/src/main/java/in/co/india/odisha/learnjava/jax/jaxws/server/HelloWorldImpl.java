package in.co.india.odisha.learnjava.jax.jaxws.server;

import javax.jws.WebService;

/**
 * Created by personal on 18-02-2017.
 */

@WebService(endpointInterface = "in.co.india.odisha.learnjava.jax.jaxws.server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {


    public String getHelloWorldAsString(String name) {
        return "Hello"+name;
    }
}
