package br.com.accountservice.adapters.output.database.repository;

import br.com.accountservice.adapters.output.database.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<AccountEntity, Long> {
}
