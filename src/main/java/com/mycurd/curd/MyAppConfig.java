package com.mycurd.curd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public MyExternalComponent myExternalComponent() {
        return new MyExternalComponent();
    }
}
