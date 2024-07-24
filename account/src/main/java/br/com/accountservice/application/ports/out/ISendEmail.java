package br.com.accountservice.application.ports.out;

import br.com.accountservice.application.domain.model.AccountModel;

public interface ISendEmail {
    void publish(AccountModel accountModel);
}
