package com.monika.SavingHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AccountTransactionService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountTransaction accountTransaction;

    @Autowired
    AccountTransactionRepository accountTransactionRepository;

    public Account getAccountBalanceByUser(String user) {
        return accountRepository.findByUser(user);
    }

    public AccountTransaction addTransaction(AccountTransaction accountTransaction){
        Account accountToUpdate = getAccountBalanceByUser(accountTransaction.getUser());
        int updatedBalance = accountToUpdate.getBalance() + accountTransaction.getAmount();
        accountToUpdate.setBalance(updatedBalance);
        accountRepository.save(accountToUpdate);
        return accountTransactionRepository.save(accountTransaction);
    }

    public Page<AccountTransaction> getAllTransactions(Pageable pageable){
        return accountTransactionRepository.findAll(pageable);
    }


    }
