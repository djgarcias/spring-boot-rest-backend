package com.example.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;
@Component
public class ApiAuthenticationFailureHandler implements AuthenticationFailureHandler  {

	@Override
	public void onAuthenticationFailure(HttpServletRequest arg0,
			HttpServletResponse arg1, AuthenticationException arg2)
			throws IOException, ServletException {
		
		System.out.println("username :" +arg0.getParameter("username"));
		
		arg1.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		ServletOutputStream out = arg1.getOutputStream();
		out.println("erroraco");
		out.close();
	}

}
