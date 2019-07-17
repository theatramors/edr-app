package com.amors.edrapp.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.web.servlet.MultipartProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.util.unit.DataSize.parse;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        return objectMapper;
    }

    @Bean
    public MultipartProperties multipartProperties() {
        MultipartProperties properties = new MultipartProperties();
        properties.setMaxFileSize(parse("25MB"));
        properties.setMaxRequestSize(parse("25MB"));
        return properties;
    }
}
