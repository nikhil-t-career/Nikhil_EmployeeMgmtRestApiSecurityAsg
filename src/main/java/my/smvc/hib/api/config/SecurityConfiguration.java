package my.smvc.hib.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(getPasswordEncoder())
			.withUser(User.withUsername("ADMIN").password(getPasswordEncoder().encode("password")).roles("ADMIN"))
			.withUser(User.withUsername("USER").password(getPasswordEncoder().encode("password")).roles("USER"));

	}

	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * MOST RESTRICTIVE TO LEAST RESTRICTIVE
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		// Security role
		http
		.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/secure/**").hasRole("ADMIN")
		.antMatchers("/api/**").hasAnyRole("ADMIN", "USER")
		.and()
//		.antMatchers("/").permitAll().and().formLogin();

		.csrf().disable()
		.formLogin().disable();
		http.headers().frameOptions().disable();
		
		
		
		// ONLY ADMIN CAN ADD OR DELETE STUDENT
		//USER  (USED BY STUDENTS CAN VIEW AND UPDATE AND SAVE)
//		http.authorizeRequests().antMatchers("/delete-student", "/add-student").hasRole("ADMIN") 
//		
//				.antMatchers("/list-students", "/update-student", "/save-student").hasAnyRole("ADMIN", "USER") 
//				.antMatchers("/").permitAll().and().formLogin();
//
//		http.csrf().disable();
//		http.headers().frameOptions().disable();

	}
}
