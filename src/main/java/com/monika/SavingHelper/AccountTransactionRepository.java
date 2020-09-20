package com.monika.SavingHelper;

import org.springframework.data.repository.Repository;

import java.util.Date;
import java.util.List;

public interface AccountTransactionRepository extends Repository<AccountTransaction, Long> {

    AccountTransaction save(AccountTransaction accountTransaction);

    List<AccountTransaction> findAll();

    List<AccountTransaction> findByCategory(String category);

    List<AccountTransaction> findByDateBetween(Date date1, Date date2);


}
