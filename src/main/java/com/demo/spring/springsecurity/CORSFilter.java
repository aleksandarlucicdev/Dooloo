/*package com.demo.spring.springsecurity;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

public class CORSFilter extends GenericFilterBean implements Filter {
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException{
		
		
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Access-Controll-Allow-Origin", "*");
		httpResponse.setHeader("Access-Controll-Allow-Method", "*");
		
		
		
		httpResponse.setHeader("Access-Controll-Allow-Headers", "*");
		
		
		
		
		
		httpResponse.setHeader("Access-Controll-Allow-Credentials", "false");
		httpResponse.setHeader("Access-Controll-Max-Age", "3600");
		
		
		
		System.out.println("Suecccess");
		chain.doFilter(request, response);

	}

}
*/