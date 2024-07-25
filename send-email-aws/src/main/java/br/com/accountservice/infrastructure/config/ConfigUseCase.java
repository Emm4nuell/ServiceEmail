package br.com.accountservice.infrastructure.config;

import br.com.accountservice.application.port.in.ISendEmailUseCase;
import br.com.accountservice.application.port.out.ISendEmailService;
import br.com.accountservice.application.usecase.SendEmailUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigUseCase {

    @Bean
    public ISendEmailUseCase iSendEmailUseCase(ISendEmailService iSendEmailService){
        return new SendEmailUseCase(iSendEmailService);
    }
}
