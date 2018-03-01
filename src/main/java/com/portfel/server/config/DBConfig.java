package com.portfel.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.portfel.server.repository")
@EnableTransactionManagement
@ComponentScan("com.portfel.server")
@PropertySource("classpath:db.properties")
public class DBConfig {

    @Resource
    private Environment environment;
}
