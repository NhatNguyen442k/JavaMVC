package CNPM.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


//@Configuration
//@EnableWebMvc
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
//	@Autowired
//	DataSource datasource;
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(passwordEncoder())
////		.usersByUsernameQuery("SELECT Taikhoan,Matkhau,Enable FROM khachhang "
////				+ "WHERE Taikhoan = ? ")
////		.authoritiesByUsernameQuery("SELECT b.Taikhoan,a.Tenrole FROM role AS a,khachhang AS b "
////				+ "WHERE Taikhoan = ?");
//		auth.inMemoryAuthentication().withUser("admin1").password("12345").roles("Admin");
//	}
////	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		
////		http.authorizeHttpRequests().antMatchers("/Dangnhap").permitAll();
////		http.authorizeHttpRequests().antMatchers("/Admin/**").hasRole("Admin");
////		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
////		http.authorizeRequests().and().formLogin()
////		.loginProcessingUrl("/Lo-gin").loginPage("/Dangnhap").defaultSuccessUrl("/")
////		.failureUrl("/Dangnhap?error=true").usernameParameter("username")
////		.passwordParameter("password");
////		.and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
//	}
//	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/static/**");
//	}
}
