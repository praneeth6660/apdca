package com.apdca.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.session.InvalidSessionStrategy;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurity {
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public static PasswordEncoder passwordEncoder() {
		 PasswordEncoder encoder = new CustomPasswordEncoder();
		 return encoder;
	}

	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	 http.csrf().disable()
     .authorizeHttpRequests((authorize) ->
             authorize.requestMatchers("/register/**").permitAll()
                     .requestMatchers("/index").permitAll()
                     .requestMatchers("/verify").permitAll()
                     .requestMatchers("/", "/home", "/js/**", "/css/**").permitAll()
                     .requestMatchers("/error/**").permitAll()
                     .requestMatchers("/users").hasAuthority("User")
                     .requestMatchers("/users/**").hasAuthority("User")
                     .requestMatchers("/commons/**").hasAnyAuthority("User")
     )
     .formLogin(
             form -> form
                     .loginPage("/login")
                     .loginProcessingUrl("/login")
                     .defaultSuccessUrl("/users")
                     .permitAll()
     ).logout(
             logout -> logout
                     .logoutSuccessUrl("/login?logout")
                     .logoutUrl("/logout")
                     .addLogoutHandler(myLogoutHandler())
                     .permitAll()
     )
     .sessionManagement()
     .maximumSessions(1)
     .maxSessionsPreventsLogin(true)
    ;
	 
return http.build();
}

	 
	 @Bean
	    public LogoutHandler myLogoutHandler() {
	        return new MyLogoutHandler();
	    }
	 
	 @Bean
	    public InvalidSessionStrategy invalidSessionStrategy() {
	        return new MyInvalidSessionStrategy("/login");
	    }
	 
	 
@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
auth
	  .eraseCredentials(false)
     .userDetailsService(userDetailsService)
     .passwordEncoder(passwordEncoder());

}



}
