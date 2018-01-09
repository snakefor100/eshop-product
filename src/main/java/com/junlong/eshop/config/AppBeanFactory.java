package com.junlong.eshop.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by niujunlong on 18/1/9.
 */
@Configuration
public class AppBeanFactory {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource buildDataSource() {
        return DataSourceBuilder.create().build();
    }
}
