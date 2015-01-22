package com.example.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

import com.example.payload.DefaultPayload;
import com.example.payload.StringBody;

@Provider
public class DefaultResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext,
			ContainerResponseContext responseContext) throws IOException {
	
		//TODO Implement a Handler that bild payloads from types
		DefaultPayload payload = new DefaultPayload();
		StringBody sb = new StringBody(responseContext.getEntity().toString());
		payload.setPayload_body(sb);
		
		responseContext.setEntity(payload);
		
	}

}
