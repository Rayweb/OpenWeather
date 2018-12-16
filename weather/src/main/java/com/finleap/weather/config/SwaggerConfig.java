package com.finleap.weather.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {  
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "Finleap OpenWeatherMap API", 
          "Java Case Study for Finleap", 
          "API TOS", 
          "Terms of Service", 
          new Contact("Raymundo Armendariz", "www.example.com", "raymundo.armendariz@gmail.com"), 
          "License of API", "API license URL", Collections.emptyList());
    }
    
    @Bean

    public Docket swaggerApi1() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("api-1.0")
            .select()
                .apis(RequestHandlerSelectors.any())
                .paths(regex("/v1.0.*"))
            .build()
            .apiInfo(apiInfo());

    }
    
}