package com.springboot.exception.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @author Mohammed Amr
 * @created 03/01/2021 - 23:25
 * @project spring-boot-exception
 */

@Configuration
public class MySimpleMappingExceptionResolver {

    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties mapping = new Properties();
        mapping.put("java.lang.ArithmeticException", "mathError"); //key=exception full name. value, view name
        mapping.put("java.lang.NullPointerException", "nullPointerError");
        resolver.setExceptionMappings(mapping);
        return resolver;
    }
}
