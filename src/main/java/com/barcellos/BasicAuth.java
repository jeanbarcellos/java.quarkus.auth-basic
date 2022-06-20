package com.barcellos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/basic")
@Produces(MediaType.TEXT_PLAIN)
public class BasicAuth {

    @GET
    @Path("/admin")
    public String admin() {
        return "Hello Admin";
    }

    @GET
    @Path("/user")
    public String user() {
        return "Hello User";
    }
}