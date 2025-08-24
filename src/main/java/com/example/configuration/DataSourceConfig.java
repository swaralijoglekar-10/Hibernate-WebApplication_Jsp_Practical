package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Adjust driver
        dataSource.setUrl("jdbc:mysql://localhost:3306/hibernatetutorials"); // Adjust URL
        dataSource.setUsername("root"); // Adjust username
        dataSource.setPassword("joglesar"); // Adjust password
        return dataSource;
    }
}