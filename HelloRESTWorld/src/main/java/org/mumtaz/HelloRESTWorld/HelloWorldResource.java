package org.mumtaz.HelloRESTWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mumtaz.HelloRESTWorld.model.Message;

@Path("/hello")
public class HelloWorldResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Message hello() {
    	Message message = new Message("World!");
        return message;
    }
}
