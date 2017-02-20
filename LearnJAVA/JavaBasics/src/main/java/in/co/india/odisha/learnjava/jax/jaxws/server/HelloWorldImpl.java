package in.co.india.odisha.learnjava.jax.jaxws.server;

import javax.jws.WebService;

/**
 * Created by personal on 18-02-2017.
 */

@WebService(endpointInterface = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {


    public String getHelloWorldAsString(String name) {
        return "Hello"+name;
    }
}
