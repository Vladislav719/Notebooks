package com.github.vladislav719.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by Владислав on 06.03.2015.
 */
@Configuration
public class DataSourceConfig {


    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("org.h2.Driver");
        dataSource.setJdbcUrl("jdbc:h2:file:C:/notebook/notebooks");
        dataSource.setUser("admin");
        dataSource.setPassword("admin");
        return dataSource;
    }
}
