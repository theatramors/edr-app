package com.amors.edrapp.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

import static org.springframework.boot.jdbc.DataSourceBuilder.create;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        return objectMapper;
    }

    @Bean
    @ConditionalOnProperty(prefix = "spring.datasource", name = "enabled", havingValue = "true")
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/edr-develop");
        dataSourceBuilder.username("edr");
        dataSourceBuilder.password("edr");
        return dataSourceBuilder.build();
    }
}
