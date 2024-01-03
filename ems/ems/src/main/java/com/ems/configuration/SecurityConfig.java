//package com.ems.configuration;
//
//	import org.springframework.context.annotation.Bean;
//	import org.springframework.context.annotation.Configuration;
//	import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//	@Configuration
//	@EnableWebSecurity
//	public class SecurityConfig extends WebSecurityConfigum8rerAdapter {
//
//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http.csrf().disable()
//	            .authorizeRequests()
//	            .antMatchers("/signup", "/login").permitAll()
//	            .anyRequest().authenticated()
//	            .and()
//	            .addFilter(new JwtAuthenticationFilter(authenticationManager()))
//	            .addFilter(new JwtAuthorizationFilter(authenticationManager()));
//	    }
//
//	}
//
