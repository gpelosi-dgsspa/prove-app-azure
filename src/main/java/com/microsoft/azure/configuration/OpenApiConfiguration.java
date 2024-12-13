package com.microsoft.azure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Configuration for Spring doc OpenAPI (Swagger).
 */
@Configuration
class OpenApiConfiguration {

    /**
     * Disables Spring Security for all routes, making all APIs public.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**").permitAll()  // Permette l'accesso a tutte le API senza autenticazione
                .and()
                .csrf().disable();  // Disabilita la protezione CSRF se non necessaria (per uso con API REST)
        return http.build();
    }

    /**
     * Custom OpenAPI configuration (Swagger).
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("RESTful APIs for SimpleTodo")
                        .description("Public APIs for the SimpleTodo application")
                        .version("1.0"));
    }

    /**
     * Customizes Spring Security to ignore specific paths for Swagger UI and OpenAPI docs.
     */
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring()
                .antMatchers("/", "/swagger-ui.html", "/swagger-ui/**", "/v3/api-docs", "/v3/api-docs/**");  // Rende accessibili le rotte Swagger senza autenticazione
    }
}
