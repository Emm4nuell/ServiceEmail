package br.com.accountservice.infrastructure.config;

import br.com.accountservice.application.ports.out.ICreateAccountService;
import br.com.accountservice.application.ports.out.ISendEmail;
import br.com.accountservice.application.usecase.CreateAccountUseCase;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ConfigUseCase {

    private final ICreateAccountService iCreateAccountService;
    private final ISendEmail iSendEmailRabbitMq;

    @Bean
    public CreateAccountUseCase createAccountUseCase(){
        return new CreateAccountUseCase(iCreateAccountService, iSendEmailRabbitMq);
    }
}
