package com.barcellos.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import io.quarkus.security.Authenticated;

@Path("/autentication/test")
@Produces(MediaType.TEXT_PLAIN)
@Tag(name = "Autentication")
// @SecurityRequirement(name = "oauth2", scopes = { "admin" })
@Authenticated
public class TestAutentication {

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