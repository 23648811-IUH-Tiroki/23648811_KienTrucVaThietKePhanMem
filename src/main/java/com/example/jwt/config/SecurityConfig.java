package com.example.jwt.config;

import java.security.interfaces.RSAPublicKey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.example.jwt.util.PemUtils;

import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http
	        .csrf(csrf -> csrf.disable())
	        .formLogin(form -> form.disable()) // 🔴 TẮT LOGIN FORM
	        .httpBasic(basic -> basic.disable()) // 🔴 TẮT BASIC AUTH
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/public").permitAll()
	            .anyRequest().authenticated()
	        )
	        .oauth2ResourceServer(oauth2 -> oauth2.jwt());

	    return http.build();
	}


    @Bean
    public JwtDecoder jwtDecoder() throws Exception {
        RSAPublicKey publicKey = (RSAPublicKey) PemUtils.readPublicKey(
                new ClassPathResource("keys/public.pem").getInputStream());

        return NimbusJwtDecoder.withPublicKey(publicKey).build();
    }
}
