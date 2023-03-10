package CNPM.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import CNPM.Service.Admin.*;
import CNPM.Service.User.*;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "iot.vn")
public class Spring_config_MVC implements WebMvcConfigurer{
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/qlquanlau_php");
		data.setUsername("root");
		data.setPassword("");
		return data;
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/html/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/static/**")
		.addResourceLocations("/WEB-INF/sourceinput/images/");
	}
	
	@Bean 
	public  ItfIndexACAdmin getThongtinaccount() {
		return new ACServiceAdminIpm(getDataSource());
	}
	
	@Bean
	public ItfIndex getIndexDao() {
		return new IndexServiceIpm(getDataSource());
	}
	
	@Bean
	public ItfKynhap getKynhapDao() {
		return new KynhapServiceIpm(getDataSource());
	}
	
	@Bean 
	public  ItfGiohang getGiohangDao() {
		return new GiohangServiceIpm(getDataSource());
	}
	
//	@Bean
//	public SecurityItilizer getSecurity(){
//		return new SecurityItilizer();
//	}
	
	@Bean 
	public  ItfIndexTPAdmin getThongtinthucpham() {
		return new IndexTPServiceAdminIpm(getDataSource());
	}
	
	@Bean 
	public  ItfBill getbill() {
		return new BillServiceIpm(getDataSource());
	}

}
