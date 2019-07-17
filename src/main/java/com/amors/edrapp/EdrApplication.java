package com.amors.edrapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdrApplication {

    public static final String PREAUTHORIZE_ADMIN = "hasRole('ROLE_ADMIN')";
    public static final String PREAUTHORIZE_ADMIN_OR_USER = "hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')";

    public static void main(String[] args) {
        SpringApplication.run(EdrApplication.class, args);
    }
}
