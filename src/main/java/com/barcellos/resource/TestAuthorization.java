package com.barcellos.resource;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/authorization/test")
@Produces(MediaType.TEXT_PLAIN)
@Tag(name = "Autorization")
@SecurityRequirement(name = "oauth2", scopes = { "admin" })
public class TestAuthorization {

    @GET
    @Path("/admin")
    @RolesAllowed({ Roles.ADMIN })
    public String admin() {
        return "Hello Admin";
    }

    @GET
    @Path("/user")

    @RolesAllowed({ Roles.USER })
    public String user() {
        return "Hello User";
    }

    @GET
    @Path("/deny-all")
    @DenyAll
    public String denyAll() {
        return "Denny all";
    }

    @GET
    @Path("/permit-all")
    @PermitAll
    public String permitAll() {
        return "Denny all";
    }
}