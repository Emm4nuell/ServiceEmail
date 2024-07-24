package br.com.accountservice.application.usecase;

import br.com.accountservice.application.domain.model.AccountModel;
import br.com.accountservice.application.ports.in.ICreateAccontUseCase;
import br.com.accountservice.application.ports.out.ICreateAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class CreateAccountUseCase implements ICreateAccontUseCase {

    private final ICreateAccountService iCreateAccountService;

    @Override
    public void create(AccountModel model) {
        iCreateAccountService.create(model);
        log.info("Access create account usecase!");
    }
}
