package com.springboot.ownbasic.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CtxCommandLine {

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
          System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            //Arrays.stream(beanNames).forEach(System.out::println);
        };
    }
}
