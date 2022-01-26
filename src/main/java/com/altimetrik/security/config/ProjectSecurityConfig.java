package com.altimetrik.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*requirement:
 *myAccount -secured
 *myBalance-secured 
 * myLoans-secured
 * myCard-secured
 * notice-unsecured
 * contact-unsecured
 * 
 * */

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.authorizeRequests((requests) -> 
			requests.antMatchers("/account").authenticated().
					 antMatchers("/balance").authenticated().
					 antMatchers("/loan").authenticated().
					 antMatchers("/card").authenticated().
					 antMatchers("/notice").permitAll().
					 antMatchers("/contact").permitAll().
					 antMatchers("/*").denyAll());
		httpSecurity.formLogin();
		httpSecurity.httpBasic();
	}

}
