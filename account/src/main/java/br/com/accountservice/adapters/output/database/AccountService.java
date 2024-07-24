package br.com.accountservice.adapters.output.database;

import br.com.accountservice.adapters.output.database.entity.AccountEntity;
import br.com.accountservice.application.domain.model.AccountModel;
import br.com.accountservice.application.ports.out.ICreateAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AccountService implements ICreateAccountService {

    @Override
    public void create(AccountModel accountModel) {
        var entity = AccountEntity.builder()
                .id(accountModel.getId())
                .name(accountModel.getName())
                .document(accountModel.getDocument())
                .email(accountModel.getEmail())
                .birthdate(accountModel.getBirthdate())
                .build();
        log.info("Service adapters --> " + entity.toString());
    }
}
