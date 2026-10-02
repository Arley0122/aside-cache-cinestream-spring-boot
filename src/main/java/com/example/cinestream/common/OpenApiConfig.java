package com.example.cinestream.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI cineStreamOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("CineStream API")
                        .description("API para gerenciamento de assinantes, catalogo, assinaturas e faturamento.")
                        .version("1.0.0"));
    }
}
