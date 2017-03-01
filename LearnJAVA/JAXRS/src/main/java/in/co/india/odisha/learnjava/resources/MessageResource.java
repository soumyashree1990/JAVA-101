package in.co.india.odisha.learnjava.resources;

import in.co.india.odisha.learnjava.model.Message;
import in.co.india.odisha.learnjava.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by personal on 28-02-2017.
 */
@Path("/messages")
public class MessageResource {
    MessageService messageService=new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages(){
        return messageService.getAllMessages();
    }
}
