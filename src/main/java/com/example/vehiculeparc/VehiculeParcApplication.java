package com.example.vehiculeparc;

import com.example.vehiculeparc.security.services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VehiculeParcApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehiculeParcApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountService accountService) {
        return args -> {


        };
    }
}
