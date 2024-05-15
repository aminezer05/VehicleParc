package com.example.vehiculeparc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
               // .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(
                        authCustomizer -> authCustomizer
                                .requestMatchers("/deleteUser" , "/createVehicule","/maintenance/save","/createControleTechnique","/createUser").hasRole("ADMIN")
                                .requestMatchers("/createUser","/createControleTechnique","/saveControleTechnique").hasAnyRole("ADMIN","USER")
                                .requestMatchers("/usersList").hasAnyRole("ADMIN","USER")
                                .requestMatchers("/login","/webjars/**").permitAll()
                                .anyRequest().authenticated()


                )
                .formLogin(
                        formlogin -> formlogin
                                .loginPage("/login")
                                .defaultSuccessUrl("/")
                )
        .build();
    }
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.withUsername("admin").password(bCryptPasswordEncoder().encode("0000")).roles("ADMIN", "USER").build(),
                User.withUsername("user").password(bCryptPasswordEncoder().encode("0000")).roles("USER").build()
        );
    }
}
