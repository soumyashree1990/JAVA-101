package in.co.india.odisha.learnjava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by personal on 28-02-2017.
 */

@Path("/messages") //URI Path which shows the message
public class MessageResource {

    @GET    //HTTP method which function will be performed
    @Produces(MediaType.TEXT_PLAIN) // Type of response
    public String getMessage(){
        return "Hello World";
    }
}
