package in.co.india.odisha.learnjava.jax.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 * Created by personal on 19-02-2017.
 */

//ServiceEndpointInterface
    @WebService
    @SOAPBinding(style = Style.RPC)
public interface Square {
    @WebMethod int getSquare(int number);
}
