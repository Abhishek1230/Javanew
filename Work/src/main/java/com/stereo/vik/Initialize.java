package com.stereo.vik;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.stereo.controller.Controller1;

public class Initialize implements WebApplicationInitializer {

	public void onStartup(ServletContext holder) throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(Controller1.class);
		ctx.setServletContext(holder);

		ServletRegistration.Dynamic servlet = holder.addServlet(
				"dispatcher", new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");

}


}
