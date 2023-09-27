//package com.user.service.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
////annotation based configuration
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ConfigSecurity extends WebSecurityConfigurerAdapter{
//
//	
//	//basic security
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		// TODO Auto-generated method stub
////		http.authorizeRequests().antMatchers("/home").permitAll().anyRequest().authenticated().and().httpBasic();
////	}
//	
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		http.authorizeRequests().
//		//.antMatchers("/public/**").hasRole("NORMAL").antMatchers("/user/**").hasRole("ADMIN").
//		anyRequest().authenticated().and().httpBasic();
//	}
//	//this is one way
////	//custome security 	
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		// TODO Auto-generated method stub
////		auth.inMemoryAuthentication().withUser("shamin").password("shamin").roles("NORMAL");
////	}
////	
////	
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		return NoOpPasswordEncoder.getInstance();
////	}
//	
//	//custome encodig with inMemory Authentication
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication().withUser("asif").password(this.passwordEncoder().encode("shamin")).roles("NORMAL");
//		auth.inMemoryAuthentication().withUser("shamin").password(this.passwordEncoder().encode("shamin786")).roles("ADMIN");
//	}
//	
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder(4);
//	}
//}
