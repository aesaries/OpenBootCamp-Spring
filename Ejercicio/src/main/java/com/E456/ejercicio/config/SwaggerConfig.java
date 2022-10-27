package com.E456.ejercicio.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;

/**
 * Configuracian Swagger para la generacion de documentacion de la API REST
 * HTML: <a href="http://localhost:8080/swagger-ui/">Swahher UI</a>
 * JSON: <a href="http://localhost:8080/v2/api-docs">Api Docs</a>
 */
@Configuration
public class SwaggerConfig{

    @Bean
    public Docket api(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }
    private ApiInfo apiDetails(){
        return new ApiInfo("Spring Boot de Laptop API REST",
                "Library Api rest docs",
                "1.0",
                "http://www.google.com",
                new Contact("Enzo", "http://www.google.com", "enzo@gmail.com"),
                "MIT",
                "http://www.google.com",
                Collections.emptyList());
    }


}