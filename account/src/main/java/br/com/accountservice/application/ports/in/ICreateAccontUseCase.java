package br.com.accountservice.application.ports.in;

import br.com.accountservice.application.domain.model.AccountModel;

public interface ICreateAccontUseCase {
    void create(AccountModel model);
}
