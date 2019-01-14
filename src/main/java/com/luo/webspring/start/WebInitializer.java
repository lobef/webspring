package com.luo.webspring.start;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
		// annotationConfigWebApplicationContext.register(RootConfig.class, SpringMvcConfig.class, DataSourceConfig.class);
		annotationConfigWebApplicationContext.scan("com.luo.webspring.config");
		annotationConfigWebApplicationContext.setServletContext(servletContext);
		Dynamic dynamic = servletContext.addServlet("dispatcher",
				new DispatcherServlet(annotationConfigWebApplicationContext));
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		//servletContext.addListener();

	}

}

// public class WebInitializer extends
// AbstractAnnotationConfigDispatcherServletInitializer {
//
// @Override
// protected Class<?>[] getRootConfigClasses() {
// return new Class<?>[] { RootConfig.class };
// }
//
// @Override
// protected Class<?>[] getServletConfigClasses() {
// return new Class<?>[] { SpringMvcConfig.class };
// }
//
// @Override
// protected String[] getServletMappings() {
// return new String[] { "/" };
// }
//
// }
