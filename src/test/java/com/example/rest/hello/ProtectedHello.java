package com.example.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;


	@Path("/protected")
	@Component
	public class ProtectedHello {

	    
	    
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    @Path("/hello")
	    public String securehello() {
	    		return "Secure Hello World";
	}
	
}
