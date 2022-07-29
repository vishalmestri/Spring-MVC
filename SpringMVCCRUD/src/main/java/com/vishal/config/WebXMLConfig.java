package com.vishal.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXMLConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		
		Class[] clArray=new Class[] {SpringXMLConfig.class};
		return clArray;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String arg[]=new String[] {"/"};
		return arg;
	}

}
