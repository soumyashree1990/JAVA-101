package in.co.india.odisha.learnjava.jax.jaxws.client;

/**
 * Created by personal on 19-02-2017.
 */
import in.co.india.odisha.learnjava.jax.jaxws.server.HelloWorld;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class HelloWorldClient{

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://server.jaxws.jax.learnjava.odisha.india.co.in/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("mkyong"));

    }

}
