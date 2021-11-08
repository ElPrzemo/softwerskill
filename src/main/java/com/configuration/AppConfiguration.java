package com.configuration;



import com.generator.XmlGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ("com")
public class AppConfiguration {

    @Bean
public XmlGenerator xmlGenerator (){
    return new XmlGenerator();
    }
}








