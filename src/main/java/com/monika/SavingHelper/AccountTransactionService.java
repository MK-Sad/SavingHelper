package com.monika.SavingHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class AccountTransactionService {

    @Autowired
    AccountRepository accountRepository;

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

    public List<AccountTransaction> getAllTransactions(){
        return accountTransactionRepository.findAll();
    }

    public List<AccountTransaction> getTransactionByCategory(String category){
        return accountTransactionRepository.findByCategory(category);
    }

    public List<AccountTransaction> getTransactionsForYearAndMonth(int year, int month){

        Date dateFrom = new GregorianCalendar(year, month - 1, 1).getTime();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFrom);

        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        Date dateMonthFirstDay = calendar.getTime();
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date dateMonthLastDay = calendar.getTime();

        return accountTransactionRepository.findByDateBetween(dateMonthFirstDay, dateMonthLastDay);
    }


    }
