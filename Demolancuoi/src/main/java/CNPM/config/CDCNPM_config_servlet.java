	package CNPM.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class CDCNPM_config_servlet implements WebApplicationInitializer {

	public CDCNPM_config_servlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//Servlet
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(Spring_config_MVC.class);
	//		appContext.register(SecurityConfiguration.class);
		ServletRegistration.Dynamic dispatcher 
		= servletContext.addServlet("SpringDispatcher",new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		
		//Filter
		ContextLoaderListener contextLoaderListener = new ContextLoaderListener(appContext);
        servletContext.addListener(contextLoaderListener);
        FilterRegistration.Dynamic fr = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
        fr.setInitParameter("encoding", "UTF-8");
        fr.setInitParameter("forceEncoding", "true");
        fr.addMappingForUrlPatterns(null, true, "/*");
	}

}
