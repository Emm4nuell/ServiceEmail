package br.com.accountservice.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Minha API")
                        .description("Descrição da minha API Account email")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Eduardo Emmanuel")
                                .url("http://seuwebsite.com")
                                .email("eduardo.eesf@gmail.com")
                        ));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1")
                .packagesToScan("br.com.accountservice.adapters")
                .build();
    }
}
