package com.hjh.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author Hjh
 * @Date 2022/12/23 13:17
 * 认真写代码，细节决定成败
 * Dignity is only above the sword
 */

@SpringBootApplication
public class Jenkins extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Jenkins.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Jenkins.class);
    }
}
