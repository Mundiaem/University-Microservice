package com.university.department.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.university.department.models")
@Configuration
public class PersistenceConfig {
}
