package com.monika.SavingHelper;

import org.springframework.data.repository.Repository;

public interface AccountRepository extends Repository<Account, Long> {

    Account findByUser(String user);
    Account save(Account account);

}
