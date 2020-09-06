package com.monika.SavingHelper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface AccountTransactionRepository extends Repository<AccountTransaction, Long> {

    AccountTransaction save(AccountTransaction accountTransaction);

    Page<AccountTransaction> findAll(Pageable pageable);

}
