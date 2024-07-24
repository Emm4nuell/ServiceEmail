package br.com.accountservice.application.usecase;

import br.com.accountservice.application.domain.model.AccountModel;
import br.com.accountservice.application.ports.in.ICreateAccontUseCase;
import br.com.accountservice.application.ports.out.ICreateAccountService;
import br.com.accountservice.application.ports.out.ISendEmail;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@AllArgsConstructor
public class CreateAccountUseCase implements ICreateAccontUseCase {

    private final ICreateAccountService iCreateAccountService;
    private final ISendEmail iSendEmailRabbitMq;

    @Override
    public void create(AccountModel model) {
        model.setAccount_status(false);
        model.setAccount_data(LocalDateTime.now());
        iCreateAccountService.create(model);
        iSendEmailRabbitMq.publish(model);
        log.info("Access create account usecase!");
    }
}
