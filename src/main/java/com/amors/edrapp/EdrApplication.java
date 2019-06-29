package com.amors.edrapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@Profile(value = "develop")
@SpringBootApplication
public class EdrApplication {
    public static void main(String[] args) {
        SpringApplication.run(EdrApplication.class, args);
    }
}
