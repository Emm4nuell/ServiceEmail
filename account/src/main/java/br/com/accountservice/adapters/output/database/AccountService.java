package br.com.accountservice.adapters.output.database;

import br.com.accountservice.adapters.output.database.entity.AccountEntity;
import br.com.accountservice.adapters.output.database.repository.IAccountRepository;
import br.com.accountservice.application.domain.model.AccountModel;
import br.com.accountservice.application.ports.out.ICreateAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
public class AccountService implements ICreateAccountService {

    private final IAccountRepository iAccountRepository;

    @Transactional
    @Override
    public void create(AccountModel accountModel) {
        var entity = AccountEntity.builder()
                .id(accountModel.getId())
                .name(accountModel.getName())
                .document(accountModel.getDocument())
                .email(accountModel.getEmail())
                .birthdate(accountModel.getBirthdate())
                .account_status(accountModel.getAccount_status())
                .account_data(accountModel.getAccount_data())
                .build();
//        iAccountRepository.save(entity);
        log.info("Account save success --> " + entity.toString());
    }
}
