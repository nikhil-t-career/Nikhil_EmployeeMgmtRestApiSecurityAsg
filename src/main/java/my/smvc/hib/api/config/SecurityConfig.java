package my.smvc.hib.api.config;
//package my.smvc.hib.api.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private UserDetailsService userDetailsService;
//		
////	@Autowired
////	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().passwordEncoder(getPasswordEncoder())
////				.withUser(User.withUsername("ADMIN").password(getPasswordEncoder().encode("PassAdmin")).roles("ADMIN"));
////
////	}
//
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
//	}
//
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		http.csrf().disable();
////
////		http.authorizeRequests().antMatchers("/rest/**").authenticated().anyRequest().permitAll().and()
////				.authorizeRequests().antMatchers("/secure/**").authenticated().anyRequest().hasAnyRole("ADMIN").and()
////				.formLogin().permitAll();
////
////		http.httpBasic().and().authorizeRequests().antMatchers("/rest/**").permitAll().and().antMatchers("/secure/**")
////				.hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin().permitAll();
////
////	}
//
//	/**
//	 * MOST RESTRICTIVE TO LEAST RESTRICTIVE
//	 */
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		// ONLY ADMIN CAN ADD OR DELETE EMPLOYEE
//		// USER (USED BY NON-ADMINS CAN VIEW AND UPDATE AND SAVE)
////		http.authorizeRequests()
////				.antMatchers("/secured/**").authenticated().anyRequest().hasRole("ADMIN") 
////				.antMatchers("/").permitAll().and().formLogin();
////
////		http.csrf().disable();
////		http.headers().frameOptions().disable();
//
////		http.httpBasic().and().authorizeRequests().antMatchers("/rest/**").permitAll().and().antMatcher("/secure/**")
////				.hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin().permitAll();
//
//		
////		http.authorizeRequests().antMatchers("/rest/**").authenticated().anyRequest().permitAll().and()
////		.authorizeRequests().antMatchers("/secure/**").authenticated().anyRequest().hasAnyRole("ADMIN").and()
////		.formLogin().permitAll();
//		
//		
//		 http
//	        .httpBasic()
//	            .and()
//	        .authorizeRequests()
//	            .antMatchers("/rest/**").permitAll()
//	            .and()
//	        .authorizeRequests()
//	            .antMatchers("/secure/**").hasAnyRole("ADMIN")
//	            .anyRequest().authenticated()
//	            .and()
//	        .formLogin()
//	            .permitAll();
//
//	}
//	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/h2-console/**");
//	}
//
//	@Bean
//	public BCryptPasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	
//}
