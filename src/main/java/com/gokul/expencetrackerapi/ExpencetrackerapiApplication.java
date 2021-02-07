package com.gokul.expencetrackerapi;

import com.gokul.expencetrackerapi.filter.AuthFilter;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class ExpencetrackerapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpencetrackerapiApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<CorsFilter>corsFilter(){
        FilterRegistrationBean<CorsFilter>registrationBean=new FilterRegistrationBean<>();
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        CorsConfiguration config=new CorsConfiguration();
        config.addAllowedHeader("*");
        config.addAllowedOrigin("*");
        source.registerCorsConfiguration("/**",config);
        registrationBean.setOrder(0);
        return registrationBean;
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
