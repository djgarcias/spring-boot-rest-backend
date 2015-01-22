package com.example.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
@Component
public class ApiAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	@Autowired
	ApiPreAuthenticatedTokenCacheService apiPreAuthenticatedTokenCacheService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		
		response.setStatus(HttpServletResponse.SC_OK);
		
		//String xAuthToken = UUID.randomUUID().toString();
		String xAuthToken = "123456";
		
	    User user = (User) authentication.getPrincipal();

		apiPreAuthenticatedTokenCacheService.putInCache(xAuthToken, user);
		response.setHeader("X-Auth-Token", xAuthToken);
	}

}
