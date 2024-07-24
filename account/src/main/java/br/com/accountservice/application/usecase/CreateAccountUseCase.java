package br.com.accountservice.application.usecase;

import br.com.accountservice.application.domain.model.AccountModel;
import br.com.accountservice.application.ports.input.ICreateAccontUseCase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateAccountUseCase implements ICreateAccontUseCase {
    @Override
    public void create(AccountModel model) {
        log.info("Access create account usecase!");
    }
}
