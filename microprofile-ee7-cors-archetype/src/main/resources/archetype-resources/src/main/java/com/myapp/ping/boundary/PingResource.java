package com.myapp.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * A demo JAX-RS Resource. Delete me...
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "Enjoy MicroProfile 1.2!";
    }

}