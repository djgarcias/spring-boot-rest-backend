package com.example.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

	@Path("/public")
	@Component
	public class PublicHello {

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    @Path("/hello")
	    public String hello() {
	    		return "Hello World";
	   
}
}