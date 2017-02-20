package in.co.india.odisha.learnjava.jax.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
@WebService
// notifies that below interface is a webservice interfce
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {

    @WebMethod
    // it specifies web service operations
    String getHelloWorldAsString(String name);

    //TODO: Create another method  int getSquare (int); and expose as a webservice and test from soap ui.

}