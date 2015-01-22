package org.test.service;

import java.io.IOException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Just a definition of the service. No implementation needed.
 *
 * Needs to be a class so that Spring can call a default constructor (which it
 * can't do with an interface).
 */
public class TestService {
    /**
     * Camel intercepts this.
     *
     * Receives a request with one URL-based argument and responds with JSON or
     * XML.
     *
     * Content Negotiation: Set the request header with Accept:Application/json,
     * or Accept:Application/xml, or Accept:Text/xml in order to receive a
     * response in the desired format.
     *
     * @param id
     *            text
     * @return A response in String format with MIME of application/json or xml
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
    @Path("/{id}")
    public Response ping(@HeaderParam("id") int id) {
        return null;
    }

}
