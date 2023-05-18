package com.gestionservicios.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.gestionservicios.api.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class securityConfig{

	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
    private CustomUserDetailsService userDetailsService;
	
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/admin/empresas").authenticated()
				.anyRequest()
				.permitAll()
			)
			.formLogin((form) -> form
				.loginPage("/api/loginForm")
				.permitAll()
			)
			.logout((logout) -> logout.permitAll()
					.invalidateHttpSession(true)
					.clearAuthentication(true)
					.logoutSuccessUrl("/login?logout"));

		return http.build();
	}
}