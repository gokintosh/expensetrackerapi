package com.gokul.expencetrackerapi;

import com.gokul.expencetrackerapi.filter.AuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExpencetrackerapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpencetrackerapiApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<AuthFilter> filteRegistrationBean(){
        FilterRegistrationBean<AuthFilter>registrationBean=new FilterRegistrationBean<>();
        AuthFilter authFilter=new AuthFilter();
        registrationBean.setFilter(authFilter);
        registrationBean.addUrlPatterns("/api/categories/*");
        return registrationBean;
    }

}
