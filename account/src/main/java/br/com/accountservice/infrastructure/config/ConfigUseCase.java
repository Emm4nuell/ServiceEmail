package br.com.accountservice.infrastructure.config;

import br.com.accountservice.application.usecase.CreateAccountUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigUseCase {

    @Bean
    public CreateAccountUseCase createAccountUseCase(){
        return new CreateAccountUseCase();
    }
}
