package com.intern.core.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class InternCoreServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InternCoreServiceApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InternCoreServiceApplication.class);
    }
}
