package in.co.india.odisha.learnjava.jax.jaxws.server;

import javax.jws.WebService;

/**
 * Created by personal on 19-02-2017.
 */

//ServiceImplementation
    @WebService(endpointInterface = "Square")
public class SquareIMPL implements Square {


    public int getSquare(int number) {
        return number*number;
    }
}
