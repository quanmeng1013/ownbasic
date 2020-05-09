package com.springboot.config;

import com.springboot.interceptor.PiceaInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PiceaWebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())//增加过滤的方法类
                .addPathPatterns("/**");//定义过滤的范围
    }

    @Bean
    public PiceaInterceptor authenticationInterceptor() {
        return new PiceaInterceptor();
    }
}
