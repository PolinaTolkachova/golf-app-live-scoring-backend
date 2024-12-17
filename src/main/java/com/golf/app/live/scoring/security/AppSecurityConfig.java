package com.golf.app.live.scoring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = createUser("a", "a");
        return new InMemoryUserDetailsManager(user);
    }

    private UserDetails createUser(String username, String password) {
        return User.withUsername(username)
            .password(passwordEncoder().encode(password))
            .roles("USER")
            .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .cors(withDefaults())
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers(HttpMethod.GET, "/tournament/**").permitAll()
                .requestMatchers(HttpMethod.POST, "/tournament/**").permitAll()
                .requestMatchers(HttpMethod.PUT, "/tournament/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/player/**").permitAll()
                .requestMatchers(HttpMethod.POST, "/player/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/leaderboard/**").permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(withDefaults());

        return http.build();
    }
}