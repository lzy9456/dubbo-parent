package org.dubbo.consumer;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

/**
 * @author _lizy
 * @version 1.0
 * @description web启动
 * @date 2020/10/18 8:44
 */
@EnableAutoConfiguration
@EnableDubbo
@ComponentScan("org.dubbo.consumer.controller")
public class DubboConsumerWebApp extends SpringBootServletInitializer implements WebApplicationInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(getClass());
    }

    public static void main(String[] args) { // Run as the generic Spring Boot Web(Servlet) Application
        SpringApplication application = new SpringApplication(DubboConsumerWebApp.class);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}
