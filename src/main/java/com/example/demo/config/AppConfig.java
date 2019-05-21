package com.example.demo.config;


import com.example.demo.service.Impl.TestPropertiesServiceImpl;
import com.example.demo.service.TestPropertiesService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*指明该类是一个配置类*/
@Configuration
public class AppConfig {


    @Bean
    public TestPropertiesService testPropertiesService(){
        System.out.println("新建了一个testPropertiesService");
        return new TestPropertiesServiceImpl();
    }

}
